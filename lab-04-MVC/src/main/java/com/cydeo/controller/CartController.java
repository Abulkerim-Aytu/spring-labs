package com.cydeo.controller;

import com.cydeo.model.CartItem;
import com.cydeo.service.CartService;
import com.cydeo.service.impl.CartServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.UUID;

@Controller
@AllArgsConstructor
public class CartController {

    private final CartService cartService;

    @RequestMapping("/cart-list")
    public String cartList1 (Model model){
//        have another solution
        model.addAttribute("cartList",cartService.retrieveCartList());
        return "/cart/cart-list";
    }


    @RequestMapping("/cart-list/{id}")
    public String cartListID (@PathVariable UUID id, Model model){

       List<CartItem> result = cartService.retrieveCartDetail(id);

        model.addAttribute("cartItemList",result);
        model.addAttribute("cartItem",result);

        return "/cart/cart-detail";
    }
}
