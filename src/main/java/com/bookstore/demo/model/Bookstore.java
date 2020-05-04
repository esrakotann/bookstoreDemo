package com.bookstore.demo.model;

import org.hibernate.annotations.Entity;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Bookstore extends AbstractEntity {

    private String bookstoreName;

    @OneToMany(mappedBy="bookstore", fetch = FetchType.LAZY)
    private List<City> cityList;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Book> bookList;

    public Bookstore() {
    }

    public Bookstore(String bookstoreName, List<City> cityList, List<Book> bookList) {
        this.bookstoreName = bookstoreName;
        this.cityList = cityList;
        this.bookList = bookList;
    }

    public String getBookstoreName() {
        return bookstoreName;
    }

    public void setBookstoreName(String bookstoreName) {
        this.bookstoreName = bookstoreName;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
