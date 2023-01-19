package com.mongodb.sampleproject.repository;
import com.mongodb.sampleproject.document.PersonDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<PersonDocument,Long> {

    @Query("{name:'?0'}")
    PersonDocument findItemByName(String name);
}
