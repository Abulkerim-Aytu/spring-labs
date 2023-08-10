package com.cydeo.model;

import com.cydeo.model.QuantityType;
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
    private String quantity;
    private QuantityType quantityType;
}
