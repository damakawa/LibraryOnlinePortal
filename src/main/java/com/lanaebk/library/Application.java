package com.lanaebk.library;

/**
 * Created by Lanae on 3/2/2016.
 */
import com.lanaebk.library.portal.Books;
import com.lanaebk.library.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ComponentScan
@EnableMongoRepositories
@SpringBootApplication
public class Application
{

    public static void main (String[] args ) {
        SpringApplication.run(Application.class, args);
    }

/*    @Override
    public void run(String...args) throws Exception {

        // fetch all entries in book collection
        System.out.println("Books found with findAll():");
        System.out.println("---------------------------");
        for (Books books : bookRepo.findAll())
        {
            System.out.println(books);
        }

        // fetch book by title
        System.out.println("Books found with findByTitle('Kushiel's Dart'):");
        System.out.println("-----------------------------------------------");
        for (Books books : bookRepo.findByTitle("Kushiel's Dart"))
        {
            System.out.println(books);
        }
    }*/
}