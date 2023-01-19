package com.onetomany.cartanditem.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private String name;
    private Long quantity;
    private Double price;
}
