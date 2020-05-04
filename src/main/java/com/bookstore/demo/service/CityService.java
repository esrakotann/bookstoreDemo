package com.bookstore.demo.service;

import com.bookstore.demo.model.City;
import com.bookstore.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CityService {

    @Autowired
    CityRepository repository;

    public City save(City city) {
        return repository.save(city);
    }


    @Transactional(readOnly = true)
    public List<City> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<City> findOne(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
