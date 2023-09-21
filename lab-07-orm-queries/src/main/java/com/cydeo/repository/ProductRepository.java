package com.cydeo.repository;

import com.cydeo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    //Write a derived query to get top 3 product order by price desc
    //List<Product>  findFirst3ByOrderByPriceDesc();

    //Write a derived query to get product by specific name
    List<Product> findByName(String name);

    //Write a derived query to get product by specific category
    //List<Product> findByCategoryId(Long id);

    //Write a derived query to get count by price greater than specific amount
    Integer countByPriceGreaterThan(BigDecimal price);

    //Write a derived query to get all product by quantity greater than or equal specific count
    //List<Product> findByQuantityGreaterThanEqual(int count);

    //Write a native query to get all product by price greater than specific amount and quantity lower than specific count
    //List<Product>

    //Write a native query to get all product by specific categoryId
    List<Product> findByCategoryId(Long id);

    //Write a native query to get all product by specific categoryId and price greater than specific amount
    //@Query(value = "SELECT * FROM Product WHERE ")
    //List<Product> retrieveSpecific();
}
