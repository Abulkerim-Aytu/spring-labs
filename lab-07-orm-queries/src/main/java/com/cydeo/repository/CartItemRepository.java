package com.cydeo.repository;


import com.cydeo.entity.Balance;
import com.cydeo.entity.Cart;
import com.cydeo.entity.CartItem;
import com.cydeo.enums.CartState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Long> {

    //Write a derived query to get count cart items
    //List<CartItem> countByCartId(Long id);
    //Write a derived query to get cart items for specific cart state
    //List<CartItem> findByCartCartState(CartState state);
    //Write a native query to get cart items for specific cart state and product name
    //@Query(value = "SELECT * FROM cart_item WHERE Cart.cart_state = ?1 AND Product.name=?2", nativeQuery = true)
    //List<CartItem> retrieveStateName(CartState cartState, String name);
    //Write a native query to get cart items for specific cart state and without discount
    //Write a native query to get cart items for specific cart state and with specific Discount type
}
