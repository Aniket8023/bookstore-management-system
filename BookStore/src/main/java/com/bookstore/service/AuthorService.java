package com.bookstore.service;

import com.bookstore.entity.Author;
import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthors();
    Author addAuthor(Author author);
}
