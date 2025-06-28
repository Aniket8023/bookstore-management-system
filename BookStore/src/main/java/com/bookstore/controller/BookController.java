package com.bookstore.controller;

import com.bookstore.entity.Book;
import com.bookstore.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for handling book-related operations.
 */
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    /**
     * Constructor injection for BookService.
     *
     * @param bookService the book service implementation
     */
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /**
     * Get all books in the system.
     *
     * @return list of books
     */
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }

    /**
     * Get a specific book by ID.
     *
     * @param id the ID of the book
     * @return the book with the specified ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    /**
     * Add a new book to the system.
     *
     * @param book the book object to add
     * @return the created book
     */
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = bookService.addBook(book);
        return ResponseEntity.ok(savedBook);
    }

    /**
     * Update an existing book.
     *
     * @param id   the ID of the book to update
     * @param book the updated book object
     * @return the updated book
     */
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book updatedBook = bookService.updateBook(id, book);
        return ResponseEntity.ok(updatedBook);
    }

    /**
     * Delete a book by ID.
     *
     * @param id the ID of the book to delete
     * @return success message
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok("✅ Book deleted successfully!");
    }
}
