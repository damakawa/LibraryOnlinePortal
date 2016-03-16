package com.lanaebk.library.repositories;
/*
 * Created by Lanae on 3/2/2016.
*/


import com.lanaebk.library.portal.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.io.Serializable;
import java.util.List;

public interface BookRepository extends MongoRepository<String, Book>
{

    //Book findByTitle(String title);

    @Query(value="{'title' : ?0}")
    Book findByTitle (String title);

    @Query(value = "{'authorLName' : ?0}")
    List<Book> findByLastName (String authorLName);

    @Query(value = "{'authorFName' : ?0}")
    List<Book> findByFirstName (String authorFName);


}
