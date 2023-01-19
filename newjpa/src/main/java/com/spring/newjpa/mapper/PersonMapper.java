package com.spring.newjpa.mapper;

import com.spring.newjpa.entity.PersonEntity;
import com.spring.newjpa.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonEntity modelToEntity(Person person);

    Person entityToModel(PersonEntity personEntity);
}
