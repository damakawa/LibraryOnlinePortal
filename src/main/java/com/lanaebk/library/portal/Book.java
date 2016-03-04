package com.lanaebk.library.portal;

/**
 * Created by Lanae on 3/2/2016.
 */

import org.springframework.data.annotation.Id;

public class Book
{
    @Id
    private String id;

    private String title;
    private String authorLastName;
    private String authorFirstName;

    public Book() {}

    public Book(String title, String authorLastName, String authorFirstName)
    {
        this.title = title;
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
    }

    @Override
    public String toString()
    {
        return String.format(
                "Book[id='%s', title='%s', authorLastName='%s', authorFirstName='%s']",
                id, title, authorLastName, authorFirstName);
    }
}
