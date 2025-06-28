package com.bookstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Security configuration class for handling HTTP security and in-memory authentication.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    /**
     * Defines the security filter chain to authorize HTTP requests.
     *
     * @param http the HttpSecurity object
     * @return configured SecurityFilterChain
     * @throws Exception in case of configuration errors
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable()) // Disable CSRF for development/testing
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/books", "/books/{id}", "/authors").permitAll() // Allow public access to GET
                        .requestMatchers("/books", "/authors").authenticated() // POST endpoints require auth
                        .requestMatchers("/books/{id}").authenticated() // PUT/DELETE require auth
                )
                .httpBasic(httpBasic -> httpBasic.disable()) // Disable basic auth (can be enabled if needed)
                .build();
    }

    /**
     * Defines in-memory authentication for testing.
     *
     * @return user details service with demo user
     */
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withUsername("aniket")
                .password("{noop}password") // NoOp encoder for plain password
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}
