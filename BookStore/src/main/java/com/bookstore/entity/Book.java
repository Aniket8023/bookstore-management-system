package com.bookstore.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

/**
 * Represents a Book entity in the bookstore.
 * Contains details like title, description, price, publish date, and associated author.
 */
@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    /**
     * Unique identifier for the book.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Title of the book.
     */
    private String title;

    /**
     * Description of the book content.
     */
    private String description;

    /**
     * Price of the book.
     */
    private Double price;

    /**
     * Date when the book was published.
     */
    @Column(name = "published_date")
    private LocalDate publishedDate;

    /**
     * Author of the book.
     */
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
