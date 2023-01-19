package com.userdetail.userdetail.service;

import com.userdetail.userdetail.mapper.UserMapper;
import com.userdetail.userdetail.model.UserResponse;
import com.userdetail.userdetail.entity.UserEntity;
import com.userdetail.userdetail.model.UserDetail;
import com.userdetail.userdetail.repository.UserRespository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class UserService {


    private final UserMapper userMapper;
    private final UserRespository userRespository;

    public UserService(UserMapper userMapper, UserRespository userRespository) {
        this.userMapper = userMapper;

        this.userRespository = userRespository;
    }

    public UserResponse createUser(UserDetail userDetail) {
        log.info("userDetail" + userDetail.getFirstName());
        UserResponse userResponse = new UserResponse();
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userDetail.getFirstName());
        userEntity.setLastName(userDetail.getLastName());
        userEntity.setEmailId(userDetail.getEmailId());
        userEntity.setPhone(userDetail.getPhone());
        userEntity.setDob(userDetail.getDob());
        //UserEntity userEntity1 = userMapper.modelToEntity(userDetail);
        userRespository.save(userEntity);
        userResponse.setUserId(userEntity.getId());
        log.info(userResponse.getUserId());
        return userResponse;
    }

}
