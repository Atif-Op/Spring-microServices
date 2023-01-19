package com.onetomany.cart_items.service;

import com.onetomany.cart_items.Repository.CartRepository;
import com.onetomany.cart_items.enitity.ItemEntity;
import com.onetomany.cart_items.mapper.CartMapper;
import com.onetomany.cart_items.enitity.CartEntity;
import com.onetomany.cart_items.model.Cart;
import com.onetomany.cart_items.model.CartResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CartMapper cartMapper;


    public CartResponse addItem(Cart cart) {
        log.info(cart.getCartName());


        CartResponse cartResponse = new CartResponse();
        ItemEntity itemEntity = new ItemEntity();
        CartEntity cartEntity = new CartEntity();
        CartEntity cartEntit1 = cartMapper.modelToEntity(cart);
        cartRepository.save(cartEntit1);
        cartResponse.setCartId(cartEntity.getId());
        log.info(cartResponse.getCartId());
        return cartResponse;
    }
}
