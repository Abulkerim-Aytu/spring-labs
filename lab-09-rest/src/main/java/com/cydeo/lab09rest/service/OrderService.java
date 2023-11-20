package com.cydeo.lab09rest.service;

import com.cydeo.lab09rest.dto.OrderDTO;
import com.cydeo.lab09rest.enums.PaymentMethod;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<OrderDTO> listAllAddress();
    OrderDTO findById(Long id, Optional<String> currency) throws Exception;
    List<OrderDTO> listAllOrderByPaymentMethods(PaymentMethod paymentMethod);
    List<OrderDTO> listAllOrderByEmail(String email);
    OrderDTO updateOrder(OrderDTO orderDTO);
    OrderDTO createOrder(OrderDTO orderDTO);
}
