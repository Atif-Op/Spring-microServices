package com.userdetail.userdetail.repository;

import com.userdetail.userdetail.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UserRespository extends JpaRepository<UserEntity, Long> {
}
