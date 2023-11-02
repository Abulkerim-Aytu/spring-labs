package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.AddressDTO;
import com.cydeo.lab08rest.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    List<OrderDTO> listAllAddress();
    List<OrderDTO> listAllOrderByPaymentMethods();
    List<OrderDTO> listAllOrderByEmail(String email);
    OrderDTO updateOrder(OrderDTO orderDTO);
    OrderDTO createOrder(OrderDTO orderDTO);
}
