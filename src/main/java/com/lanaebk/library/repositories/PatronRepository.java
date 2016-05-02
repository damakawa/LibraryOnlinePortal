package com.lanaebk.library.repositories;

/**
 * Created by JiwenZhang on 16/5/1.
 */
import com.lanaebk.library.portal.Patron;
import com.lanaebk.library.portal.Staffs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.awt.print.Book;
import java.util.List;

public interface PatronRepository {
    @Query("{'id' : ?0}")
    List<Patron> findByID (int id);

    @Query("{'LName' : ?0}")
    List<Patron> findByLastName (String LName);
}
