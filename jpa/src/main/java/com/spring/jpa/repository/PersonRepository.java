package com.spring.jpa.repository;

import com.spring.jpa.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
