package com.lanaebk.library;

/**
 * Created by Lanae on 3/2/2016.
 */
import com.lanaebk.library.portal.Book;
//import com.lanaebk.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {

/*    @Autowired
    private BookRepository repository;*/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
/*
        repository.deleteAll();

        // save a couple of books
        repository.save(new Book("Ishmael", "Quinn", "Daniel"));
        repository.save(new Book("Hitchhiker's Guide to the Galaxy", "Adams", "Douglas"));

        // fetch all books
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Book book : repository.findAll()) {
            System.out.println(book);
        }
        System.out.println();

        // fetch an individual book
        System.out.println("Book found with findByFirstName('Douglas'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Douglas"));

        System.out.println("Book found with findByLastName('Quinn'):");
        System.out.println("--------------------------------");
        for (Book book : repository.findByLastName("Quinn")) {
            System.out.println(book);
        }*/

    }

}