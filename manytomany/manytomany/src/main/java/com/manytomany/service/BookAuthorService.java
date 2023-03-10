package com.manytomany.service;

import com.manytomany.entity.BookEntity;
import com.manytomany.model.Author;
import com.manytomany.model.mapper.BookAuthorMapper;
import com.manytomany.model.Book;
import com.manytomany.repository.BookAuthorRepository;
import com.manytomany.resposne.BookAuthorResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
public class BookAuthorService {
    private final BookAuthorMapper bookAuthorMapper;
    private final BookAuthorRepository bookAuthorRepository;

    public BookAuthorService(BookAuthorMapper bookAuthorMapper, BookAuthorRepository bookAuthorRepository) {
        this.bookAuthorMapper = bookAuthorMapper;
        this.bookAuthorRepository = bookAuthorRepository;
    }

    public BookAuthorResponse addBooks(Book book) {
        new BookEntity();
        BookEntity bookEntity;
        bookEntity = bookAuthorMapper.modelTOEntity(book);
        bookAuthorRepository.save(bookEntity);
        log.info("book details saved in database");
        BookAuthorResponse bookAuthorResponse = new BookAuthorResponse();
        bookAuthorResponse.setId(bookEntity.getId());
        return bookAuthorResponse;
    }


    public Book getBooks(Long id) throws Exception {
        Optional<BookEntity> bookEntityOptional = bookAuthorRepository.findById(id);
        Book book = new Book();
        if (bookEntityOptional.isPresent()) {
            BookEntity bookEntity = bookEntityOptional.get();
            book = bookAuthorMapper.entityToModel(bookEntity);
            log.info("Book with the id {} found", id);
        } else {
            log.info("No book found with the id {}", id);
        }
        return book;
    }



}
