package com.cydeo.controller;

import com.cydeo.model.Product;
import com.cydeo.service.ProductService;
import com.cydeo.service.impl.CartServiceImpl;
import com.cydeo.service.impl.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;
//    Here wu use the dependency injection.

    @RequestMapping("/search-product/{product}")
    public String searchProduct(@PathVariable String product, Model model){

//        ProductServiceImpl search = new ProductServiceImpl();

        List<Product> result = productService.searchProduct(product);

        model.addAttribute("productList",result);
        model.addAttribute("product",result);

        return "/product/product-list";
    }
}
