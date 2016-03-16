package com.lanaebk.library;

import com.lanaebk.library.portal.Book;
import com.lanaebk.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * Created by Lanae on 3/3/2016.
*/

@Controller
public class PortalController
{
    @Autowired
    BookRepository bookRepo;

    @RequestMapping("/query")
    public String query(@RequestParam(value = "title", required = true) String title,
                        /*@RequestParam(value = "authorLName", required = false) String authorLName,
                        @RequestParam(value = "authorFName", required = false) String authorFName,
                        @RequestParam(value = "publisher", required = false) String publisher,
                        @RequestParam(value = "yearOfPublication", required = false) String yearOfPublication,*/
                        Model model)
    {
        Book book = bookRepo.findByTitle(title);
        model.addAttribute("title", book.getTitle());
        model.addAttribute("authorLName", book.getAuthorLName());
        model.addAttribute("authorFName", book.getAuthorFName());
        model.addAttribute("publisher", book.getPublisher());
        model.addAttribute("yearOfPublication", book.getYearOfPublication());

        return "query";
    }

}




//making a change to test out git push functionality
