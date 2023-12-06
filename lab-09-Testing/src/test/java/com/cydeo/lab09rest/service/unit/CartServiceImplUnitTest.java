package com.cydeo.lab09rest.service.unit;

import com.cydeo.lab09rest.entity.Customer;
import com.cydeo.lab09rest.entity.Product;
import com.cydeo.lab09rest.repository.ProductRepository;
import com.cydeo.lab09rest.service.impl.CartServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

// Unit Testing Works with Mock Data. So instead of using real data we use Mockito to Mock the DATA.
// Integration Testing works with Real Data.

// To be able to mock some services and repositories and all other parties we need to this class.
@ExtendWith(MockitoExtension.class)
public class CartServiceImplUnitTest {

    @Mock
    private ProductRepository productRepository;

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
        Product product = new Product();
        product.setRemainingQuantity(10);

        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
        Throwable throwable = catchThrowable(() -> cartService.addToCart(new Customer(),1L,15));
        assertThat(throwable).isInstanceOf(RuntimeException.class);
        assertThat(throwable).hasMessage("Not enough stock");
    }

}
