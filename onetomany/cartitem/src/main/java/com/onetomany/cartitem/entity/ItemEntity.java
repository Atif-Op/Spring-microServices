package com.onetomany.cartitem.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Items")
public class ItemEntity {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;
    private String itemName;
    private Long qnty;
    private double price;

    @OneToOne(mappedBy = "itemEntity")
    private CartEntity items;

//    @OneToOne
//    @JoinColumn(name="item_id")
//
//    @MapsId
//    private CartEntity cartEntity;

}
