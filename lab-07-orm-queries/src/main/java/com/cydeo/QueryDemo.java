package com.cydeo;
import com.cydeo.enums.CartState;
import com.cydeo.enums.DiscountType;
import com.cydeo.enums.PaymentMethod;
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
    private final CategoryRepository categoryRepository;
    private final OrderRepository orderRepository;


    public QueryDemo(AddressRepository addressRepository, BalanceRepository balanceRepository, CartItemRepository cartItemRepository, CartRepository cartRepository, CustomerRepository customerRepository, DiscountRepository discountRepository, ProductRepository productRepository, CategoryRepository categoryRepository, OrderRepository orderRepository) {
        this.addressRepository = addressRepository;
        this.balanceRepository = balanceRepository;
        this.cartItemRepository = cartItemRepository;
        this.cartRepository = cartRepository;
        this.customerRepository = customerRepository;
        this.discountRepository = discountRepository;
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.orderRepository = orderRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("-----------ADDRESS----------");
        //System.out.println("DENEME:" + addressRepository.retrieveAllAddressWithId(7L));

        System.out.println("-----------BALANCE----------");
        //System.out.println("DENEME:" + balanceRepository.retrieveToLessThan(BigDecimal.valueOf(900)));

        System.out.println("-----------CARTITEM----------");
        System.out.println("DENEME:" + cartItemRepository.retrieveAllCartIDiscountType(CartState.CREATED, DiscountType.RATE_BASED));

        System.out.println("-----------CART----------");
        System.out.println("DENEME:" + cartRepository.retrieveDiscountIdIsNotNull(40L,CartState.CREATED));

        System.out.println("-----------CATEGORY----------");
        //System.out.println("DENEME:" + categoryRepository.findTop3CategoryOrderByNameDesc());

        System.out.println("-----------CUSTOMER----------");
        //System.out.println("DENEME:" + customerRepository.fi("cmulqueeny1@networkadvertising.org"));

        System.out.println("-----------DISCOUNT----------");
        //System.out.println("DENEME:" + discountRepository.retrieveBetween(BigDecimal.ONE,BigDecimal.valueOf(25.00)));

        System.out.println("-----------PRODUCT----------");
        //System.out.println("DENEME:" + productRepository.retrieveSpecific(4L, BigDecimal.valueOf(50.00)));

        System.out.println("-----------ORDER----------");
        //System.out.println("DENEME:" + orderRepository.retrieveByName("Tomatoes"));
    }
}
