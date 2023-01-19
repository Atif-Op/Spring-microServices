package com.onetomany.cart_items.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Item {
    private String itemName;
    private Double price;
    private Long quantity;
}
