package com.bookstore.demo.model;

import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book extends AbstractEntity {
    private String name;
    private String author;

    @ManyToOne
    private Category category;
    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY)
    private List<BookPrice> bookPriceList;
    @ManyToMany(mappedBy = "bookList")
    private List<Bookstore> bookstoreList;

    public Book() {
    }

    public Book(String name, String author, Category category, List<BookPrice> bookPriceList, List<Bookstore> bookstoreList) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.bookPriceList = bookPriceList;
        this.bookstoreList = bookstoreList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<BookPrice> getBookPriceList() {
        return bookPriceList;
    }

    public void setBookPriceList(List<BookPrice> bookPriceList) {
        this.bookPriceList = bookPriceList;
    }

    public List<Bookstore> getBookstoreList() {
        return bookstoreList;
    }

    public void setBookstoreList(List<Bookstore> bookstoreList) {
        this.bookstoreList = bookstoreList;
    }
}
