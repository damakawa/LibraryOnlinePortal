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
    public String query(@RequestParam(value = "title", required = false) String title,
                        @RequestParam(value = "authorLName", required = false) String authorLName,
                        @RequestParam(value = "authorFName", required = false) String authorFName,
                        @RequestParam(value = "publisher", required = false) String publisher,
                        @RequestParam(value = "yearOfPublication", required = false) Integer yearOfPublication,
                        Model model)
    {
        Book book = bookRepo.findByTitle(title);
        model.addAttribute("title", title);
        model.addAttribute("authorLName", authorLName);
        model.addAttribute("authorFName", authorFName);
        model.addAttribute("publisher", publisher);
        model.addAttribute("yearOfPublication", yearOfPublication);

        return "query";
    }

}
