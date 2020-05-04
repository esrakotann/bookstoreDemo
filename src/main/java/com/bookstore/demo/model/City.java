package com.bookstore.demo.model;

import org.hibernate.annotations.Entity;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class City extends AbstractEntity {

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Bookstore bookstore;

    public City() {
    }

    public City(String name, Bookstore bookstore) {
        this.name = name;
        this.bookstore = bookstore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bookstore getBookstore() {
        return bookstore;
    }

    public void setBookstore(Bookstore bookstore) {
        this.bookstore = bookstore;
    }
}
