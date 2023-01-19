package com.onetomany.cartanditem.service;

import com.onetomany.cartanditem.entity.CartEntity;
import com.onetomany.cartanditem.mapper.CartMapper;
import com.onetomany.cartanditem.model.Cart;
import com.onetomany.cartanditem.model.CartResponse;
import com.onetomany.cartanditem.repository.CartRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartMapper cartMapper;

    public CartResponse createItems(Cart cart) {
        CartResponse cartResponse = new CartResponse();
        CartEntity cartEntity = cartMapper.modelToEntity(cart);
        cartRepository.save(cartEntity);
        log.info("Item has been added successfully in your cart");
        cartResponse.setCartId(cartEntity.getCartId());
        return cartResponse;
    }

    public Cart getCart(Long id) {
        Cart cart = new Cart();
        Optional<CartEntity> optionalCartEntity = cartRepository.findById(id);
        if (optionalCartEntity.isPresent()) {
            CartEntity cartEntity = optionalCartEntity.get();
            cart = cartMapper.entityToModel(cartEntity);
        } else {
            log.info("Not item found");
        }
        return cart;
    }

    public List<Cart> getAllItems() {
        List<CartEntity> cartEntities = cartRepository.findAll();
        List<Cart> carts = cartMapper.listEntityToListModel(cartEntities);
        log.info("Items found" + carts);
        return carts;
    }

}
