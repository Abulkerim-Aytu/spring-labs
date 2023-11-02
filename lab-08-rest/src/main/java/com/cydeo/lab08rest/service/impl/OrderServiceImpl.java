package com.cydeo.lab08rest.service.impl;

import com.cydeo.lab08rest.dto.AddressDTO;
import com.cydeo.lab08rest.dto.OrderDTO;
import com.cydeo.lab08rest.entity.Address;
import com.cydeo.lab08rest.entity.Order;
import com.cydeo.lab08rest.mapper.MapperUtil;
import com.cydeo.lab08rest.repository.OrderRepository;
import com.cydeo.lab08rest.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public List<OrderDTO> listAllOrderByPaymentMethods() {
        return null;
    }

    @Override
    public List<OrderDTO> listAllOrderByEmail(String email) {
        return null;
    }

    @Override
    public OrderDTO updateOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        return null;
    }
}
