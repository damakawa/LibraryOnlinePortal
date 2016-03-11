package com.lanaebk.library.portal;

/*
 * Created by Lanae on 3/2/2016.
*/


import com.lanaebk.library.repositories.BookRepository;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Book
{
    @Id
    private String id;

    private String title;
    private String authorLName;
    private String authorFName;
    private String publisher;
    private Integer yearOfPublication;


    public Book() {}

    public Book(String title, String authorLName, String authorFName)
    {
        this.title = title;
        this.authorLName = authorLName;
        this.authorFName = authorFName;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthorLName()
    {
        return authorLName;
    }

    public void setAuthorLName(String authorLName)
    {
        this.authorLName = authorLName;
    }

    public String getAuthorFName()
    {
        return authorFName;
    }

    public void setAuthorFName(String authorFName)
    {
        this.authorFName = authorFName;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public Integer getYearOfPublication()
    {
       return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication)
    {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString()
    {
        return String.format(
                "Book[id='%s', title='%s', authorLastName='%s', authorFirstName='%s']",
                id, title, authorLName, authorFName);
    }
}
