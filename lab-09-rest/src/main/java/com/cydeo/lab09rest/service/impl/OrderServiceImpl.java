package com.cydeo.lab09rest.service.impl;

import com.cydeo.lab09rest.client.CurrencyApiClient;
import com.cydeo.lab09rest.dto.OrderDTO;
import com.cydeo.lab09rest.entity.Order;
import com.cydeo.lab09rest.enums.PaymentMethod;
import com.cydeo.lab09rest.exception.OrderNotFoundException;
import com.cydeo.lab09rest.mapper.MapperUtil;
import com.cydeo.lab09rest.repository.OrderRepository;
import com.cydeo.lab09rest.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final MapperUtil mapperUtil;
    private final CurrencyApiClient currencyApiClient;


    @Value("${access_key}")
    private String access_key;

    public OrderServiceImpl(OrderRepository orderRepository, MapperUtil mapperUtil, CurrencyApiClient currencyApiClient) {
        this.orderRepository = orderRepository;
        this.mapperUtil = mapperUtil;
        this.currencyApiClient = currencyApiClient;
    }

    @Override
    public List<OrderDTO> listAllAddress() {
        List<Order> order = orderRepository.findAll();
        return order.stream().map(order1 -> mapperUtil.convert(order,new OrderDTO())).collect(Collectors.toList());
    }

    @Override
    public OrderDTO findById(Long id,String currency) throws Exception {
        Order order = orderRepository.findById(id).orElseThrow(() -> new Exception("Order Not Found!"));
        if(currency != null) {
            BigDecimal rate = currencyApiClient.getCurrentCurrency(access_key, currency, "USD", 1).getQuotes().get("USD" + currency);
            order.setTotalPrice(order.getTotalPrice().multiply(rate));
            order.setPaidPrice(order.getPaidPrice().multiply(rate));
        }
        return mapperUtil.convert(order, new OrderDTO());
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
        Order find = orderRepository.findById(orderDTO.getId())
                .orElseThrow(() -> new OrderNotFoundException("No Order Found!"));

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
}
