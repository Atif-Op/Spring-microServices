package com.onetomany.cart_items.mapper;

import com.onetomany.cart_items.enitity.CartEntity;
import com.onetomany.cart_items.model.Cart;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartMapper {

   CartEntity modelToEntity (Cart cart);
}
