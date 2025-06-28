package com.bookstore.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

/**
 * Represents an Author entity in the bookstore.
 * Contains author details like name, bio, and date of birth.
 */
@Entity
@Table(name = "author")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {

    /**
     * Unique identifier for the author.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Full name of the author.
     */
    private String name;

    /**
     * Short biography of the author.
     */
    private String bio;

    /**
     * Date of birth of the author.
     */
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
}
