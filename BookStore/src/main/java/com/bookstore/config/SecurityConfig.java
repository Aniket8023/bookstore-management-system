package com.bookstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable()) // Updated syntax for CSRF disabling
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/books", "/books/{id}", "/authors").permitAll() // GET requests allowed for everyone
                        .requestMatchers("/books", "/authors").authenticated() // POST requires authentication
                        .requestMatchers("/books/{id}").authenticated() // PUT requires authentication
                        .requestMatchers("/books/{id}").authenticated() // DELETE requires authentication
                )
                .httpBasic(httpBasic -> httpBasic.disable()) // Updated syntax for Basic authentication
                .build(); // Correct placement of .build() without duplication
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withUsername("aniket")
                .password("{noop}password") // "{noop}" prefix to avoid password encoding issues
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}
