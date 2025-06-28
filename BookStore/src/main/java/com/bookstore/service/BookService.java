package com.bookstore.service;

import com.bookstore.entity.Book;
import java.util.List;

/**
 * Service interface for managing books.
 */
public interface BookService {

    /**
     * Retrieves all books.
     *
     * @return list of all books
     */
    List<Book> getAllBooks();

    /**
     * Retrieves a book by its ID.
     *
     * @param id the ID of the book
     * @return the book with given ID
     */
    Book getBookById(Long id);

    /**
     * Adds a new book to the database.
     *
     * @param book the book to be added
     * @return the saved book
     */
    Book addBook(Book book);

    /**
     * Updates an existing book.
     *
     * @param id    ID of the book to update
     * @param book  new book details
     * @return updated book
     */
    Book updateBook(Long id, Book book);

    /**
     * Deletes a book by ID.
     *
     * @param id the ID of the book to delete
     */
    void deleteBook(Long id);
}
