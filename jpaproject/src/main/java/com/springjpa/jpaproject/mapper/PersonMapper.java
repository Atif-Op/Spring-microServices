package com.springjpa.jpaproject.mapper;

import com.springjpa.jpaproject.entity.PersonEntity;
import com.springjpa.jpaproject.model.Person;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

    PersonEntity modelToEntity(Person Person);
}
