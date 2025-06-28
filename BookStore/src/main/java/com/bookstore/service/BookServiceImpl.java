package com.bookstore.service;

import com.bookstore.entity.Book;
import com.bookstore.exception.ResourceNotFoundException;
import com.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of BookService.
 */
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    /**
     * Constructor-based dependency injection.
     *
     * @param bookRepository the book repository
     */
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Book not found with id: " + id));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Book updateBook(Long id, Book bookDetails) {
        Book book = getBookById(id);

        book.setTitle(bookDetails.getTitle());
        book.setDescription(bookDetails.getDescription());
        book.setPrice(bookDetails.getPrice());
        book.setPublishedDate(bookDetails.getPublishedDate());

        // Uncomment below line if author updates are allowed
        // book.setAuthor(bookDetails.getAuthor());

        return bookRepository.save(book);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
