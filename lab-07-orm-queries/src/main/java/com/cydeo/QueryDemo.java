package com.cydeo;
import com.cydeo.enums.CartState;
import com.cydeo.enums.DiscountType;
import com.cydeo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class QueryDemo implements CommandLineRunner {

    private final AddressRepository addressRepository;
    private final BalanceRepository balanceRepository;
    private final CartItemRepository cartItemRepository;
    private final CartRepository cartRepository;
    private final CustomerRepository customerRepository;
    private final DiscountRepository discountRepository;
    private final ProductRepository productRepository;

    public QueryDemo(AddressRepository addressRepository, BalanceRepository balanceRepository, CartItemRepository cartItemRepository, CartRepository cartRepository, CustomerRepository customerRepository, DiscountRepository discountRepository, ProductRepository productRepository) {
        this.addressRepository = addressRepository;
        this.balanceRepository = balanceRepository;
        this.cartItemRepository = cartItemRepository;
        this.cartRepository = cartRepository;
        this.customerRepository = customerRepository;
        this.discountRepository = discountRepository;
        this.productRepository = productRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("-----------ADDRESS----------");
        System.out.println("DENEME:" + addressRepository.retrieveAllAddressWithId(7L));

        System.out.println("-----------BALANCE----------");
        //System.out.println("DENEME:" + balanceRepository.retrieveToLessThan(BigDecimal.valueOf(900)));

        System.out.println("-----------CARTITEM----------");
        //System.out.println("DENEME:" + cartItemRepository.retrieveStateName(CartState.SOLD,"Tomatoes"));

        System.out.println("-----------CART----------");
        System.out.println("DENEME:" + cartRepository.findByCustomerIdAndCartStateAndDiscountIdIsNotNull(40L,CartState.CREATED));


    }
}
