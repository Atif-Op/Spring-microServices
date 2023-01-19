package com.manytomany.repository;

import com.manytomany.entity.BookEntity;
import com.manytomany.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookAuthorRepository extends JpaRepository<BookEntity, Long> {

}
