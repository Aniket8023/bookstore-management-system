package com.bookstore;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Entry point for the Bookstore Management System application.
 */
@Slf4j
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.bookstore")
public class BookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
		log.info("✅ Bookstore Application started successfully!");
	}
}
