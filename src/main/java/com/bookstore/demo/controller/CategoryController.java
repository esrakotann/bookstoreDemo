package com.bookstore.demo.controller;

import com.bookstore.demo.model.Category;
import com.bookstore.demo.service.CategoryService;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/categories")
    public Category createCategory(@RequestBody Category category)  {
        Category result = categoryService.save(category);
        return result;
    }

    @PutMapping("/categories")
    public Category updateCategory(@RequestBody Category category)  {
        Category result = categoryService.save(category);
        return result;
    }

    @GetMapping("/categories/{id}")
    public Category getCategory(@PathVariable Long id) {
        Optional<Category> category = categoryService.findOne(id);
        return category.get();
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.delete(id);
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.findAll();
    }




}
