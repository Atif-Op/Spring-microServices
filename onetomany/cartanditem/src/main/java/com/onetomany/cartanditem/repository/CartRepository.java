package com.onetomany.cartanditem.repository;

import com.onetomany.cartanditem.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<CartEntity,Long> {
}
