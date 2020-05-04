package com.bookstore.demo.repository;

import com.bookstore.demo.model.Bookstore;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookstoreRepository extends JpaRepository<Bookstore, Long> {

    public List<Bookstore> findAllBookstores(List<Long> ids);
    @Query(value = "select distinct bookStore from Bookstore bookStore left join fetch bookStore.bookLists",
            countQuery = "select count(distinct bookStore) from Bookstore bookStore")
    Page<Bookstore> findAllWithEagerRelationships(Pageable pageable);

    @Query("select distinct bookStore from Bookstore bookStore left join fetch bookStore.bookLists")
    List<Bookstore> findAllWithEagerRelationships();

    @Query("select bookStore from Bookstore bookStore left join fetch bookStore.bookLists where bookStore.id =:id")
    Optional<Bookstore> findOneWithEagerRelationships(@Param("id") Long id);
}
