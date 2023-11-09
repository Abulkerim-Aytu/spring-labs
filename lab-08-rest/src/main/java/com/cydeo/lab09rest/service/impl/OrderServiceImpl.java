package com.cydeo.lab09rest.service.impl;

import com.cydeo.lab09rest.dto.OrderDTO;
import com.cydeo.lab09rest.entity.Order;
import com.cydeo.lab09rest.enums.PaymentMethod;
import com.cydeo.lab09rest.mapper.MapperUtil;
import com.cydeo.lab09rest.repository.OrderRepository;
import com.cydeo.lab09rest.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final MapperUtil mapperUtil;

    public OrderServiceImpl(OrderRepository orderRepository, MapperUtil mapperUtil) {
        this.orderRepository = orderRepository;
        this.mapperUtil = mapperUtil;
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
        Optional<Order> find = orderRepository.findById(orderDTO.getId());
        Order convert = mapperUtil.convert(orderDTO,new Order());
        convert.setId(find.get().getId());
        orderRepository.save(convert);
        return orderDTO;
    }

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        orderRepository.save(mapperUtil.convert(orderDTO,new Order()));
        return orderDTO;
    }
}
