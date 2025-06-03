package com.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.bookstore") // ✅ Added
public class BookStoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
		System.out.println("Application Successfully started!");
	}
}
