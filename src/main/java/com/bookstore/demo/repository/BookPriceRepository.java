package com.bookstore.demo.repository;

import com.bookstore.demo.model.BookPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPriceRepository extends JpaRepository<BookPrice, Long> {
}
