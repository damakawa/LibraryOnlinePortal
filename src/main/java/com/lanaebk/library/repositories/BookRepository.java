package com.lanaebk.library.repositories;
/*
 * Created by Lanae on 3/2/2016.
*/


import com.lanaebk.library.portal.Book;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableMongoRepositories
@Repository
public interface BookRepository extends MongoRepository<Book, String>
{
    List<Book> findByTitle (String title);

    List<Book> findByLastName (String authorLName);

    List<Book> findAll();
}
