package com.lanaebk.library.portal;


import java.util.concurrent.atomic.AtomicLong;
//import com.lanaebk.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lanae on 3/3/2016.
 */

@RestController
public class GreetingController
{
    private static final String template = "Hello, %s, %s of %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name,
                             @RequestParam(value="title", defaultValue="peon") String title,
                             @RequestParam(value="nouns", defaultValue="sheep") String nouns,
                             Model model)
    {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name, title, nouns));
    }
}