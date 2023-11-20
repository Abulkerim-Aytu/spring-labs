package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.OrderDTO;
import com.cydeo.lab08rest.enums.PaymentMethod;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<OrderDTO> listAllAddress();
    List<OrderDTO> listAllOrderByPaymentMethods(PaymentMethod paymentMethod);
    List<OrderDTO> listAllOrderByEmail(String email);
    OrderDTO updateOrder(OrderDTO orderDTO);
    OrderDTO createOrder(OrderDTO orderDTO);

    Object readByOrderIdAndOptionalCurrency(Long orderId, Optional<String> currency);
}
