package com.lanaebk.library.repositories;
/*
 * Created by Lanae on 3/2/2016.
*/


import com.lanaebk.library.portal.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String>
{

    Book findByTitle(String Title);

    @Query(value = "{'authorLName' : ?0}")
    List<Book> findByLastName (String authorLName);

    @Query(value = "{'authorFName' : ?0}")
    List<Book> findByFirstName (String authorFName);


}
