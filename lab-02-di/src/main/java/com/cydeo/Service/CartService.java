package com.cydeo.Service;

import com.cydeo.model.Cart;
import com.cydeo.model.Product;

public interface CartService {
    Cart addCart(Product product, int quantity);
}
