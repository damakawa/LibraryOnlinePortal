package com.lanaebk.library.repositories;

/**
 * Created by JiwenZhang on 16/4/28.
 */
import com.lanaebk.library.portal.Musics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;
public interface MusicsRepository {
    @Query("{'title' : ?0}")
    List<Musics> findByTitle(String title);

    @Query("{'singerLName' : ?0}")
    List<Musics> findBySingerLastName(String singerLName);

    @Query("{'rating : ?0}")
    List<Musics> findByRating(int rating);

    @Query("{'singerFName' : ?0}")
    List<Musics> findBySingerFirstName(String singerFName);

    @Query("{'dateOfPublication' : ?0}")
    List<Musics> findByYear(int dateOfPublication);

}
