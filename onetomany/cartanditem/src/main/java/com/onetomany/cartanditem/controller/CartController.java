package com.onetomany.cartanditem.controller;

import com.onetomany.cartanditem.model.Cart;
import com.onetomany.cartanditem.model.CartResponse;
import com.onetomany.cartanditem.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping(path = "/carts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CartResponse> createItems(@RequestBody Cart cart) {
        CartResponse cartResponse = cartService.createItems(cart);
        return new ResponseEntity<>(cartResponse, HttpStatus.OK);
    }
    @GetMapping(path = "/carts/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cart> getCart(@PathVariable Long id){
       Cart cart= cartService.getCart(id);
       return new ResponseEntity<>(cart,HttpStatus.OK);
    }

    @GetMapping(path = "/carts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Cart>> getAllCarts() {
        List<Cart> cart = cartService.getAllItems();
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }
}
