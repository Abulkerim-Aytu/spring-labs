package com.cydeo.lab09rest.service.unit;

import com.cydeo.lab09rest.entity.Cart;
import com.cydeo.lab09rest.entity.CartItem;
import com.cydeo.lab09rest.entity.Customer;
import com.cydeo.lab09rest.entity.Product;
import com.cydeo.lab09rest.enums.CartState;
import com.cydeo.lab09rest.repository.CartItemRepository;
import com.cydeo.lab09rest.repository.CartRepository;
import com.cydeo.lab09rest.repository.ProductRepository;
import com.cydeo.lab09rest.service.impl.CartServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

// Unit Testing Works with Mock Data. So instead of using real data we use Mockito to Mock the DATA.
// Integration Testing works with Real Data.

// To be able to mock some services and repositories and all other parties we need to this class.
@ExtendWith(MockitoExtension.class)
public class CartServiceImplUnitTest {

    @Mock
    private ProductRepository productRepository;

    @Mock
    private CartRepository cartRepository;

    @Mock
    private CartItemRepository cartItemRepository;

//    This annotation help us to Wiring bean, just like constructor in the Service/Impl ' classes.
    @InjectMocks
    private CartServiceImpl cartService;

//    Every test method needs to have VOID return type.
//    Try to write every methods name with "_", help reader to read easily.
    @Test
    public void should_not_add_to_cart_when_product_does_not_exist(){
        when(productRepository.findById(1L)).thenReturn(Optional.empty());
        Throwable throwable = catchThrowable(() -> cartService.addToCart(new Customer(),1L,10));
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }

    @Test
    public void should_throw_exception_when_product_remaining_quantity_is_less_than_quantity(){
//        These are The dummy Data that we use with Mock repositories, services methods.
        Product product = new Product();
        product.setRemainingQuantity(10);

        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
        Throwable throwable = catchThrowable(() -> cartService.addToCart(new Customer(),1L,15));
        assertThat(throwable).isInstanceOf(RuntimeException.class);
        assertThat(throwable).hasMessage("Not enough stock");
    }

    @Test
    public void should_add_item_to_cart_when_cart_exists_and_cart_item_exists_in_the_cart(){
        // Given
        Product product = new Product();
        product.setId(1L);
        product.setRemainingQuantity(10);

        Cart cart = new Cart();
        cart.setCartState(CartState.CREATED);
        List<Cart> cartList = new ArrayList<>();
        cartList.add(cart);

        CartItem cartItem = new CartItem();
        cartItem.setProduct(product);
        cartItem.setCart(cart);
        cartItem.setQuantity(2);

        Customer customer = new Customer();
        customer.setId(1L);

        // When
        when(productRepository.findById(product.getId())).thenReturn(Optional.of(product));
        when(cartRepository.findAllByCustomerIdAndCartState
                (customer.getId(), CartState.CREATED)).thenReturn(cartList);
        when(cartItemRepository.findAllByCartAndProduct(cart, product)).thenReturn(cartItem);
        // Then
        boolean result = cartService.addToCart(customer, product.getId(), 8);
        assertTrue(result);
        assertThat(cartItem.getQuantity()).isEqualTo(10);
    }


    @Test
    public void should_throw_an_exception_when_cart_list_size_is_two(){
        Product product = new Product();
        product.setId(1L);
        product.setRemainingQuantity(10);

        Cart cart = new Cart();
        cart.setCartState(CartState.CREATED);

        Cart cart2 = new Cart();
        cart2.setCartState(CartState.CREATED);

        List<Cart> cartList = new ArrayList<>();
        cartList.add(cart);
        cartList.add(cart2);

        Customer customer = new Customer();
        customer.setId(1L);

        when(productRepository.findById(product.getId())).thenReturn(Optional.of(product));
        when(cartRepository.findAllByCustomerIdAndCartState
                (customer.getId(), CartState.CREATED)).thenReturn(cartList);

        Throwable throwable = catchThrowable(() ->
                cartService.addToCart(customer, 1L, 8));
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }

    // homework
    // write unit test for scenarios
    // scenario 1 -> cart doesn't exist for customer or cart list is null (new Arraylist or null)
    // scenario 2 -> cart exist but cart item doesn't exist


}
