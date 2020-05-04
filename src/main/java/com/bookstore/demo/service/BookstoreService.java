package com.bookstore.demo.service;

import com.bookstore.demo.model.Bookstore;
import com.bookstore.demo.repository.BookstoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookstoreService {
    @Autowired
    BookstoreRepository repository;

    public Bookstore save(Bookstore bookstore) {
        return repository.save(bookstore);
    }


    @Transactional(readOnly = true)
    public List<Bookstore> findAll() {
        return repository.findAllWithEagerRelationships();
    }

    @Transactional(readOnly = true)
    public Optional<Bookstore> findOne(Long id) {
        return repository.findOneWithEagerRelationships(id);
    }

    public Page<Bookstore> findAllWithEagerRelationships(Pageable pageable) {
        return repository.findAllWithEagerRelationships(pageable);
    }


    public void delete(Long id) {
        repository.deleteById(id);
    }
}

