package com.bookstore.service;

import com.bookstore.entity.Author;
import com.bookstore.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of AuthorService.
 */
@RequiredArgsConstructor
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }
}
