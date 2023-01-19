package com.userdetail.userdetail.mapper;

import com.userdetail.userdetail.entity.UserEntity;
import com.userdetail.userdetail.model.UserDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity modelToEntity(UserDetail userDetail);
}
