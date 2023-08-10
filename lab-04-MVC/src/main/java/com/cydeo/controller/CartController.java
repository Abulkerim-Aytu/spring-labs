package com.cydeo.controller;

import com.cydeo.model.Cart;
import com.cydeo.model.CartItem;
import com.cydeo.model.Product;
import com.cydeo.service.impl.CartServiceImpl;
import com.cydeo.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Controller
public class CartController {

    @RequestMapping("/cart-list")
    public String cartList1 (Model model){

        model.addAttribute("cartList",CartServiceImpl.CART_LIST);
        return "/cart/cart-list";
    }

//    @RequestMapping("/cart-list/{id}")
//    public String cartListID (@PathVariable String id, Model model){
//
//        model.addAttribute("cartList",);
//        return "/cart/cart-list";
//    }
}
