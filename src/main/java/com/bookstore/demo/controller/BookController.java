package com.bookstore.demo.controller;


import com.bookstore.demo.model.Book;
import com.bookstore.demo.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {
    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book)  {
        Book result = bookService.save(book);
        return result;
    }
    @PutMapping("/book")
    public Book updateBook(@RequestBody Book book)  {
        Book result = bookService.save(book);
        return result;
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable Long id) {
        Optional<Book> book = bookService.findOne(id);
        return book.get();
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.delete(id);
    }

    @GetMapping("/book")
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }

}



