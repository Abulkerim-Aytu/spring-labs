package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Product extends BaseEntity{
    private String name;
    private BigDecimal price;
    private int quantity;
    private int remainingQuantity;

    @ManyToMany
    @JoinTable(name = "ProductCategoryRel",
            joinColumns = @JoinColumn(name = "p_id"),
            inverseJoinColumns = @JoinColumn(name = "c_id"))
    private List<Category> category;

    public Product(String name, BigDecimal price, int quantity, int remainingQuantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.remainingQuantity = remainingQuantity;
    }
}
