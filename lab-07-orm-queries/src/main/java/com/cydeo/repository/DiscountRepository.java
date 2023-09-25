package com.cydeo.repository;

import com.cydeo.entity.Discount;
import com.cydeo.enums.DiscountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface DiscountRepository extends JpaRepository<Discount,Long> {
    //Write a derived query to get discount by name
    Discount findByName(String name);
    Discount findFirstByName(String name);

    //Write a derived query to get all discounts greater than discount amount
    List<Discount> findByDiscountGreaterThan(BigDecimal discount);
    //Write a derived query to get all discounts by specific discount type
    List<Discount> findByDiscountType(DiscountType discountType);
    //Write a JPQL query to get all discounts amount between range of discount amount
    @Query("SELECT e FROM Discount e WHERE e.discount BETWEEN ?1 AND ?2")
    List<Discount> retrieveBetween(BigDecimal v1, BigDecimal v2);
}
