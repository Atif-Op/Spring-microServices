package com.onetomany.cartanditem.mapper;

import com.onetomany.cartanditem.entity.CartEntity;
import com.onetomany.cartanditem.model.Cart;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartEntity modelToEntity(Cart cart);

    Cart entityToModel(CartEntity cartEntity);

   List<Cart>listEntityToListModel (List<CartEntity> cartEntity);

}
