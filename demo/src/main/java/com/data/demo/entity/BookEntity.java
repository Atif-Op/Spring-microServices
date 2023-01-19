package com.data.demo.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class BookEntity {
    public void setId(int id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int id;
    private String bookName;
    private int price;

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPrice() {
        return price;
    }
}
