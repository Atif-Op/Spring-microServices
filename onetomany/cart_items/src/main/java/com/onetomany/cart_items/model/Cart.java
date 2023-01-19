package com.onetomany.cart_items.model;

import com.onetomany.cart_items.enitity.ItemEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Cart {
    private String cartName;
    private List<Item> item;
}
