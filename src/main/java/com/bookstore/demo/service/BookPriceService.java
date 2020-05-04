package com.bookstore.demo.service;

import com.bookstore.demo.model.BookPrice;
import com.bookstore.demo.repository.BookPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookPriceService {
    @Autowired
    BookPriceRepository repository;

    public BookPrice save(BookPrice bookPrice) {
        return repository.save(bookPrice);
    }

    @Transactional(readOnly = true)
    public List<BookPrice> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<BookPrice> findOne(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }


}
