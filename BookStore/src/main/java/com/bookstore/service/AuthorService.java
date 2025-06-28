package com.bookstore.service;

import com.bookstore.entity.Author;
import java.util.List;

/**
 * Service interface for managing authors.
 */
public interface AuthorService {

    /**
     * Retrieves all authors.
     *
     * @return list of authors
     */
    List<Author> getAllAuthors();

    /**
     * Adds a new author.
     *
     * @param author the author to be added
     * @return saved author
     */
    Author addAuthor(Author author);
}
