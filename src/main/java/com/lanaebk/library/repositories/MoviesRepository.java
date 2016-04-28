package com.lanaebk.library.repositories;

/**
 * Created by JiwenZhang on 16/4/28.
 */

import com.lanaebk.library.portal.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

public interface MoviesRepository {
    @Query("{'title' : ?0}")
    List<Movies> findByTitle(String title);

    @Query("{'directorLName' : ?0}")
    List<Movies> findByDirectorLastName(String directorLName);

    @Query("{'rating : ?0}")
    List<Movies> findByRating(int rating);

    @Query("{'actorLName' : ?0}")
    List<Movies> findByActorLastName(String actorLName);

    @Query("{'yearOfPublication' : ?0}")
    List<Movies> findByYear(int yearOfPublication);
}
