package com.bookstore.demo.repository;

import com.bookstore.demo.model.City;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
