package com.bookstore.demo.controller;

import com.bookstore.demo.model.Bookstore;
import com.bookstore.demo.model.Category;
import com.bookstore.demo.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookstoreController {

    @Autowired
    BookstoreService service;


    @PostMapping("/bookstores")
    public Bookstore createBookstories(@RequestBody Bookstore bookstore)  {
        Bookstore result = service.save(bookstore);
        return result;
    }
    @PutMapping("/bookstores")
    public Bookstore updateBookstories(@RequestBody Bookstore bookstore)  {
        Bookstore result = service.save(bookstore);
        return result;
    }

    @GetMapping("/bookstores/{id}")
    public Bookstore getBookstore(@PathVariable Long id) {
        Optional<Bookstore> bookstore = service.findOne(id);
        return bookstore.get();
    }
    @DeleteMapping("/bookstores/{id}")
    public void deleteBookstore(@PathVariable Long id) {
        service.delete(id);
    }
    @GetMapping("/bookstores")
    public List<Bookstore> getAllBookstores() {
        return service.findAll();
    }
}
