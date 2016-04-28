package com.lanaebk.library;

import com.lanaebk.library.config.Mongo;
import com.lanaebk.library.portal.Books;
import com.lanaebk.library.portal.Movies;
import com.lanaebk.library.portal.Musics;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;
import java.util.ArrayList;

/*
 * Created by Lanae on 3/3/2016.
*/


@Controller
public class PortalController
{
/*    @Autowired
    BooksRepository bookRepo;*/

    @RequestMapping(value="/test", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello()
    {
        return "Hello";
    }

    @RequestMapping(value="books/title/{title}", method = RequestMethod.GET)
    @ResponseBody
    public Books findBookByTitle(@PathVariable("title") String title)
    {
        Books book = new Books();
        ArrayList<Books> bookColl = new ArrayList<Books>();
        Books kd = new Books("Kushiel's Dart", "Carey", "Jacqueline");
        Books nine84 = new Books("1984", "Orwell", "George");
        Books fool = new Books("Fool", "Moore", "Christopher");
        bookColl.add(kd);
        bookColl.add(nine84);
        bookColl.add(fool);

        for (int i = 0; i < bookColl.size(); i++)
        {
            if (title.equals(bookColl.get(i).getTitle()))
            {
                book = bookColl.get(i);
            }
        }
        return book;
    }

    @RequestMapping(value="movies/title/{title}", method = RequestMethod.GET)
    @ResponseBody
    public Movies findMovieByTitle(@PathVariable("title") String title)
    {
        Movies movie = new Movies();
        ArrayList<Movies> movieColl = new ArrayList<Movies>();
        Movies hunger = new Movies("The Hunger Games", "Ross", "Gary");
        Movies v = new Movies("V for Vendetta", "McTeigue", "James");
        Movies fight = new Movies("Fight Club", "Fincher", "David");
        movieColl.add(hunger);
        movieColl.add(v);
        movieColl.add(fight);

        for (int i = 0; i < movieColl.size(); i++)
        {
            if (title.equals(movieColl.get(i).getTitle()))
            {
                movie = movieColl.get(i);
            }
        }
        return movie;
    }

    @RequestMapping(value="music/album/{album}", method = RequestMethod.GET)
    @ResponseBody
    public Musics findByAlbum(@PathVariable("album") String album)
    {
        Musics music = new Musics();
        ArrayList<Musics> musicColl = new ArrayList<Musics>();
        Musics hunger = new Musics("Emily's D+Evolution", "Spalding", "Esperanza");
        Musics v = new Musics("Fever to Tell", "Yeah Yeah Yeahs", "");
        Musics fight = new Musics("Phase", "Garratt", "Jack");
        musicColl.add(hunger);
        musicColl.add(v);
        musicColl.add(fight);

        for (int i = 0; i < musicColl.size(); i++)
        {
            if (album.equals(musicColl.get(i).getAlbum()))
            {
                music = musicColl.get(i);
            }
        }
        return music;
    }
}


