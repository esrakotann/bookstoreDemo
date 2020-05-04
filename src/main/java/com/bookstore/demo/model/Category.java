package com.bookstore.demo.model;


import org.hibernate.annotations.Entity;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Category extends AbstractEntity{

    private String categoryName;

    @OneToMany(mappedBy= "category", fetch = FetchType.LAZY)
    private List<Book> bookList;

    public Category() {
    }

    public Category(String categoryName, List<Book> bookList) {
        this.categoryName = categoryName;
        this.bookList = bookList;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
