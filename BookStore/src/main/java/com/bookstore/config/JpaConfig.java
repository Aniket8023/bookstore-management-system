package com.bookstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * JPA Configuration class for setting up EntityManagerFactory.
 */
@Configuration
@EnableTransactionManagement
public class JpaConfig {

    /**
     * Configures the EntityManagerFactory bean.
     *
     * @param dataSource       injected data source
     * @param jpaVendorAdapter JPA vendor adapter (Hibernate)
     * @return entity manager factory bean
     */
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            DataSource dataSource,
            JpaVendorAdapter jpaVendorAdapter) {

        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setPackagesToScan("com.bookstore"); // Scan entity classes
        return factoryBean;
    }
}
