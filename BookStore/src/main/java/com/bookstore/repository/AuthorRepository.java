package com.bookstore.repository;

import com.bookstore.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Author entity.
 * Provides CRUD operations using Spring Data JPA.
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Additional custom queries (if any) can be added here
}
