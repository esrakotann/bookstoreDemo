package com.bookstore.demo.service;

import com.bookstore.demo.model.Category;
import com.bookstore.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Category save(Category category) {
        return categoryRepository.save(category);
    }


    @Transactional(readOnly = true)
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Category> findOne(Long id) {
        return categoryRepository.findById(id);
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}
