package com.lanaebk.library.repositories;

import org.springframework.data.mongodb.repository.Query;

/** Created by Lanae on 3/2/2016.*/




import com.lanaebk.library.portal.Books;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@EnableMongoRepositories
public interface BooksRepository extends MongoRepository<Books, String>
{
    @Query("{'title' : ?0}")
    List<Books> findByTitle (String title);

    @Query("{'authorLName' : ?0}")
    List<Books> findByLastName (String authorLName);
}
