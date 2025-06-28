package com.bookstore.repository;

import com.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Book entity.
 * Provides CRUD operations using Spring Data JPA.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Additional custom queries (if any) can be added here
}
