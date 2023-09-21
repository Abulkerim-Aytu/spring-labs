package com.cydeo.repository;

import com.cydeo.entity.Order;
import com.cydeo.enums.PaymentMethod;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    //Write a derived query to get top 5 orders by order by total price desc
    List<Order> findTop5ByOrderByTotalPriceDesc();
    //Write a derived query to get all orders by customer email
    List<Order> findByCustomerEmail(String email);
    //Write a derived query to get all orders by specific payment method
    List<Order> findByPaymentPaymentMethod(PaymentMethod paymentMethod);
    //Write a derived query to get all orders by specific customer email
    //List<Order> find
    //Write a derived query to check is there any orders by customer email
    boolean existsByCustomerEmail(String email);

    //Write a native query to get all orders by specific product name
    @Query(value = "SELECT * FROM orders o JOIN Cart c ON o.id = c.id JOIN cart_item ci on  ci.id = c.id JOIN product p on p.id = ci.id WHERE P.name = '?1' ", nativeQuery = true)
    List<Order> retrieveByName(String name);

    //Write a native query to get all orders by specific categoryId
    //SELECT * FROM orders o JOIN Cart c ON o.id = c.id JOIN cart_item ci on  ci.id = c.id JOIN product p on p.id = ci.id JOIN category ca on ca.id=p.id
    //WHERE ca.id = 2

    //Write a derived query to get all orders by totalPrice and paidPrice are equals
    //List<List> findByTotalPriceEqualsPaidPrice();

    //Write a derived query to get all orders by totalPrice and paidPrice are not equals and discount is not null
    //List<Order> findAllByTotalPrice

}
