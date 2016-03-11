package com.lanaebk.library;

/**
 * Created by Lanae on 3/2/2016.
 */
import com.lanaebk.library.portal.Book;
import com.lanaebk.library.repositories.BookRepository;
import com.lanaebk.library.config.SecurityConfig;
import com.lanaebk.library.config.SecurityWebApplicationInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ComponentScan
@EnableMongoRepositories
@EnableAutoConfiguration
public class Application
{
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(Application.class, args);
    }
}