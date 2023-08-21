package com.cydeo.model;

import com.cydeo.enums.QuantityType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@Component
public class Ingredients {
    private String name;
    private int quantity;
    private QuantityType quantityType;
}
