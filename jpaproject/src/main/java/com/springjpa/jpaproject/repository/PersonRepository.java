package com.springjpa.jpaproject.repository;

import com.springjpa.jpaproject.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface PersonRepository extends JpaRepository<PersonEntity,Long> {
}
