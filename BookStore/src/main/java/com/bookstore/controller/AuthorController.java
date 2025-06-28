package com.bookstore.controller;

import com.bookstore.entity.Author;
import com.bookstore.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for handling author-related operations.
 */
@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    /**
     * Constructor injection for AuthorService.
     *
     * @param authorService the author service implementation
     */
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    /**
     * Get all authors in the system.
     *
     * @return list of authors
     */
    @GetMapping
    public ResponseEntity<List<Author>> getAllAuthors() {
        List<Author> authors = authorService.getAllAuthors();
        return ResponseEntity.ok(authors);
    }

    /**
     * Add a new author to the system.
     *
     * @param author the author object to add
     * @return the created author
     */
    @PostMapping
    public ResponseEntity<Author> addAuthor(@RequestBody Author author) {
        Author savedAuthor = authorService.addAuthor(author);
        return ResponseEntity.ok(savedAuthor);
    }
}
