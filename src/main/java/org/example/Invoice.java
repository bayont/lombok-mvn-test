package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Invoice {
    private String product_number, product_description;
    private int quantity;
    private double pricePerItem;

    public double amount() {
        if(pricePerItem < 1 || quantity < 1)
            return 0;
        return quantity * pricePerItem;
    }
}