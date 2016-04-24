package com.lanaebk.library;

import com.lanaebk.library.config.Mongo;
import com.lanaebk.library.portal.Books;
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

/*    @RequestMapping(value = "/title/{title}", method = RequestMethod.GET)
    @ResponseBody
    public DBObject getBookByTitle(@PathVariable("title") String title) throws UnknownHostException
    {
        Mongo mongo = new Mongo();
        DBCollection books = mongo.getCollection("books");
        DBObject firstBook = books.findOne();
        return firstBook;
    }*/

    @RequestMapping(value="/title/{title}", method = RequestMethod.GET)
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
}


