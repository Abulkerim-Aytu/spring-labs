package com.cydeo.repository;
import com.cydeo.entity.Cart;
import com.cydeo.enums.CartState;
import com.cydeo.enums.DiscountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
    //Write a derived query to get all cart by specific discount type
    List<Cart> findByDiscountDiscountType(DiscountType discountType);

    //Write a JPQL query to get all cart by customer
    @Query("SELECT e FROM Cart e WHERE e.customer.id = ?1")
    List<Cart> retrieveCartByCustomer(Long id);

    //Write a derived query to get all cart by customer and cart state
    List<Cart> findByCustomerIdAndCartState(Long id, CartState cartState);

    //Write a derived query to get all cart by customer and cart state and discount is null condition
    List<Cart> findByCustomerIdAndCartStateAndDiscountIdIsNull(Long id, CartState cartState);

    //Write a native query to get all cart by customer and cart state and discount is not null condition
    @Query(value= "SELECT * FROM cart c JOIN customer cu ON c.customer_id = cu.id WHERE c.cart_state = ?1 " +
            "AND cu.id = ?2 AND discount.id <> null", nativeQuery = true)
    List<Cart> findAllByCustomerIdAndCartStateAndDiscountIsNotNull(String cartState, Long id);

    // @Query(value = "SELECT * FROM cart WHERE customer_id = ?1 AND cart_state='?2' AND discount_id IS NOT NULL",nativeQuery = true)
    // List<Cart> retrieveDiscountIdIsNotNull(Long id, CartState cartState);




}
