package com.lanaebk.library.portal;

/*
 * Created by Lanae on 3/2/2016.
*/


import com.lanaebk.library.repositories.BookRepository;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

public class Book
{
    @Id
    private String id;

    private String title;
    private String authorLName;
    private String authorFName;
    private String publisher;
    private int yearOfPublication;
    private String subject;
    private String genre;
    private double deweyDecimal;
    private Boolean isDigital;
    private Boolean isPhysical;
    private int numAvailable;
    private int dueDate;
    private int expirationDate;
    private double owedFine;
    private double paidFine;

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

    public int getYearOfPublication()
    {
       return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication)
    {
        this.yearOfPublication = yearOfPublication;
    }

    public String getSubject() { return subject;}

    public void setSubject(String subject) {this.subject = subject;}

    public String getGenre() {return genre;}

    public void setGenre(String genre) {this.genre = genre;}

    public double getDeweyDecimal() {return deweyDecimal;}

    public void setDeweyDecimal(double deweyDecimal) {this.deweyDecimal = deweyDecimal;}

    public Boolean getIsDigital() {return isDigital;}

    public void setIsDigital(Boolean isDigital) {this.isDigital = isDigital;}

    public Boolean getIsPhysical() {return isPhysical;}

    public void setIsPhysical(Boolean isPhysical) {this.isPhysical = isPhysical;}

    private int getNumAvailable() {return numAvailable;}

    private void setNumAvailable(int numAvailable) {this.numAvailable = numAvailable;}

    private int getDueDate() {return dueDate;}

    private void setDueDate(int dueDate) {this.dueDate = dueDate;}

    private int getExpirationDate() {return expirationDate;}

    private void setExpirationDate(int expirationDate) {this.expirationDate = expirationDate;}

    private double getOwedFine() {return owedFine;}

    private void setOwedFine(double owedFine) {this.owedFine = owedFine;}

    private double getPaidFine() {return paidFine;}

    private void setPaidFine(double paidFine) {this.paidFine = paidFine;}

    @Override
    public String toString()
    {
        return String.format(
                "Book[id='%s', title='%s', authorLastName='%s', authorFirstName='%s']",
                id, title, authorLName, authorFName);
    }
}
