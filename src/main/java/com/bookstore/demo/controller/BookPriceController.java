package com.bookstore.demo.controller;

import com.bookstore.demo.model.BookPrice;
import com.bookstore.demo.model.City;
import com.bookstore.demo.service.BookPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookPriceController {

    @Autowired
    BookPriceService service;

    @PostMapping("/bookPrices")
    public ResponseEntity<BookPrice> createBookPrices(@RequestBody BookPrice bookPrice) {
        BookPrice result = service.save(bookPrice);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/bookPrices")
    public BookPrice updateBookPrices(@RequestBody BookPrice bookPrice) {
        BookPrice result = service.save(bookPrice);
        return result;
    }

    @GetMapping("/bookPrices/{id}")
    public BookPrice getBookPrice(@PathVariable Long id) {
        Optional<BookPrice> bookPrice = service.findOne(id);
        return bookPrice.get();
    }

    @DeleteMapping("/bookPrices/{id}")
    public void deleteBookPrice(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/bookPrices")
    public List<BookPrice> getAllBookPrices() {
        return service.findAll();
    }

}
