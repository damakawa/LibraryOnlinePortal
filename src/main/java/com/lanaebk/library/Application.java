package com.lanaebk.library;

/**
 * Created by Lanae on 3/2/2016.
 */
import com.lanaebk.library.portal.Book;
import com.lanaebk.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner
{
    @Autowired
    private BookRepository bookRepo;

    public static void main (String[] args ) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String...args) throws Exception {

        // fetch all entries in book collection
        System.out.println("Books found with findAll():");
        System.out.println("---------------------------");
        for (Book book : bookRepo.findAll())
        {
            System.out.println(book);
        }

        // fetch book by title
        System.out.println("Books found with findByTitle('Kushiel's Dart'):");
        System.out.println("-----------------------------------------------");
        for (Book book : bookRepo.findByTitle("Kushiel's Dart"))
        {
            System.out.println(book);
        }
    }
}