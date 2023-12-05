package com.cydeo.lab09rest.service.impl;

import com.cydeo.lab09rest.client.CurrencyClient;
import com.cydeo.lab09rest.dto.CurrencyApiResponse;
import com.cydeo.lab09rest.dto.OrderDTO;
import com.cydeo.lab09rest.entity.Order;
import com.cydeo.lab09rest.enums.Currency;
import com.cydeo.lab09rest.enums.PaymentMethod;
import com.cydeo.lab09rest.exception.CurrencyInvalidException;
import com.cydeo.lab09rest.exception.OrderNotFoundException;
import com.cydeo.lab09rest.mapper.MapperUtil;
import com.cydeo.lab09rest.repository.OrderRepository;
import com.cydeo.lab09rest.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class OrderServiceImpl implements OrderService {

    @Value("${access_key}")
    private String access_key;

    private final OrderRepository orderRepository;
    private final MapperUtil mapperUtil;
    private final CurrencyClient currencyClient;

    public OrderServiceImpl(OrderRepository orderRepository, MapperUtil mapperUtil, CurrencyClient currencyClient) {
        this.orderRepository = orderRepository;
        this.mapperUtil = mapperUtil;
        this.currencyClient = currencyClient;
    }


    @Override
    public List<OrderDTO> listAllAddress() {
        List<Order> order = orderRepository.findAll();
        return order.stream().map(order1 -> mapperUtil.convert(order,new OrderDTO())).collect(Collectors.toList());
    }

    @Override
    public List<OrderDTO> listAllOrderByPaymentMethods(PaymentMethod paymentMethod) {
        List<Order> order = orderRepository.findAllByPayment_PaymentMethod(paymentMethod);
        return order.stream().map(order1 -> mapperUtil.convert(order,new OrderDTO())).collect(Collectors.toList());
    }

    @Override
    public List<OrderDTO> listAllOrderByEmail(String email) {
        List<Order> order = orderRepository.findAllByCustomer_Email(email);
        return order.stream().map(order1 -> mapperUtil.convert(order,new OrderDTO())).collect(Collectors.toList());
    }

    @Override
    public OrderDTO updateOrder(OrderDTO orderDTO) {
        Order find = orderRepository.findById(orderDTO.getId()).orElseThrow(() -> new OrderNotFoundException("No Order Found!"));

        Order convert = mapperUtil.convert(orderDTO,new Order());
        convert.setId(find.getId());
        orderRepository.save(convert);
        return orderDTO;
    }

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        orderRepository.save(mapperUtil.convert(orderDTO,new Order()));
        return orderDTO;
    }

    @Override
    public OrderDTO readByOrderIdAndOptionalCurrency(Long orderId, Optional<String> currency) {

        Order foundOrder = orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("No Order Found!"));

        OrderDTO orderToReturn = mapperUtil.convert(foundOrder, new OrderDTO());

        BigDecimal currencyRate = getCurrencyRate(currency);

        orderToReturn.setPaidPrice(convertCurrency(foundOrder.getPaidPrice(), currencyRate));
        orderToReturn.setTotalPrice(convertCurrency(foundOrder.getTotalPrice(), currencyRate));

        return orderToReturn;

    }

    private BigDecimal getCurrencyRate(Optional<String> currency) {
        // currency.get() -> null.toUpperCase() -> NullPointerException ??? - NO
        if (currency.isPresent() && !currency.get().toUpperCase().equals("USD")) {

            validateCurrency(currency.get());

            // Consume currency api and return currency rate
            CurrencyApiResponse responseBody = currencyClient
                    .consumeCurrencyApi(access_key, currency.get()).getBody();

            BigDecimal rate = responseBody.getQuotes().get("USD" + currency.get().toUpperCase());

            return rate;

        }

        return BigDecimal.ONE;

    }

    private BigDecimal convertCurrency(BigDecimal dollarAmount, BigDecimal currencyRate) {
        return dollarAmount.multiply(currencyRate).setScale(2, RoundingMode.CEILING);
    }

    private void validateCurrency(String currency) {

//        List<String> validCurrencies = Stream.of(Currency.values())        // Currency
//                .map(eachCurrency -> eachCurrency.value)        // Stream<String>
//                .collect(Collectors.toList());
//
//        boolean isValidCurrency = validCurrencies.contains(currency);

        boolean isValidCurrency = Stream.of(Currency.values())        // Currency
                .map(eachCurrency -> eachCurrency.value)        // Stream<String>
                .anyMatch(eachCurrency -> eachCurrency.equals(currency));

        if (!isValidCurrency) {
            throw new CurrencyInvalidException("Invalid Currency!");
        }

    }

}
