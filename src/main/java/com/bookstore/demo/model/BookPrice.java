package com.bookstore.demo.model;


import org.hibernate.annotations.Entity;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class BookPrice extends AbstractEntity {
    private Double price;
    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;

    public BookPrice() {
    }

    public BookPrice(Double price, Book book) {
        this.price = price;
        this.book = book;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
