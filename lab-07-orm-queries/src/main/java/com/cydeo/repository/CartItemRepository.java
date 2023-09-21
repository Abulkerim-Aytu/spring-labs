package com.cydeo.repository;


import com.cydeo.entity.Balance;
import com.cydeo.entity.Cart;
import com.cydeo.entity.CartItem;
import com.cydeo.enums.CartState;
import com.cydeo.enums.DiscountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Long> {

    //Write a derived query to get count cart items
    //Integer countAllByCartItemId();
    //Write a derived query to get cart items for specific cart state
    //List<CartItem> findByCartCartState(CartState state);
    //Write a native query to get cart items for specific cart state and product name
    //@Query(value = "SELECT * FROM cart_item WHERE Cart.cart_state = ?1 AND Product.name=?2", nativeQuery = true)
    //List<CartItem> retrieveStateName(CartState cartState, String name);

    //Write a native query to get cart items for specific cart state and without discount
    @Query(value = "SELECT * FROM Cart_Item ci JOIN Cart c ON ci.id = c.id WHERE c.cart_state='?1' AND c.discount_id IS NULL", nativeQuery = true)
    List<CartItem> retrieveAllCartItemState(CartState cartState);

    //Write a native query to get cart items for specific cart state and with specific Discount type
    @Query(value = "SELECT * FROM Cart_Item ci JOIN Cart c ON ci.id = c.id JOIN discount d on  d.id = c.id " +
            "WHERE c.cart_state='?1' AND d.discount_type ='?2';", nativeQuery = true)
    List<CartItem> retrieveAllCartIDiscountType(CartState cartState, DiscountType discountType);

}

//
