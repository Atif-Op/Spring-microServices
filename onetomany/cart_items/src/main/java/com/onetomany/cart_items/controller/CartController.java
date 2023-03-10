package com.onetomany.cart_items.controller;

import com.onetomany.cart_items.model.Cart;
import com.onetomany.cart_items.model.CartResponse;
import com.onetomany.cart_items.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping(value = "/carts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CartResponse> addItem(@RequestBody Cart cart) {
        CartResponse cartResponse = cartService.addItem(cart);
        return new ResponseEntity<>(cartResponse, HttpStatus.OK);
    }

}
