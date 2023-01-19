package com.onetomany.cartanditem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Access;
import java.util.List;

@Getter
@Setter
public class Cart {
    private String cartName;
    private List<Item> items;
}
