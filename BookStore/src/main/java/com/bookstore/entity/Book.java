package com.bookstore.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double price;

    @Column(name = "published_date")
    private LocalDate publishedDate;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
