package com.lanaebk.library.portal;

/**
 * Created by JiwenZhang on 16/4/28.
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

public class Movies {
    //ID
    private String id;
    private String title;
    private String directorLName;
    private String directorFName;
    private String publisher;
    private int yearOfPublication;
    private String genre;
    private String format;
    private String actorFName;
    private String actorLName;
    private int rating;
    private String evaluation;
    private int expirationDate;
    private double owedFine;
    private double paidFine;
    private boolean doPayment;

    public Movies() {}

    public Movies(String title, String directorLName, String directorFName)
    {
        this.title = title;
        this.directorLName = directorLName;
        this.directorFName = directorFName;
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

    public String getDirectorLName()
    {
        return directorLName;
    }

    public void setDirectorLName(String authorLName)
    {
        this.directorLName = directorLName;
    }

    public String getDirectorFName()
    {
        return directorFName;
    }

    public void setDirectorFName(String directorFName)
    {
        this.directorFName = directorFName;
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

    public String getGenre() { return genre;}

    public void setGenre(String genre) {this.genre = genre;}

    public String getFormat() { return format;}

    public void setFormat(String format) {this.format = format;}

    public String getActorFName() {return actorFName;}

    public void setActorFName(String actorFName) {this.actorFName = actorFName;}

    public String getActorLName() {return actorLName;}

    public void setActorLName(String actorLName) {this.actorLName = actorLName;}

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public String getEvaluation()
    {
        return evaluation;
    }

    public void setEvaluation(String evaluation)
    {
        this.evaluation = evaluation;
    }

    private int getExpirationDate() {return expirationDate;}

    private void setExpirationDate(int expirationDate) {this.expirationDate = expirationDate;}

    private double getOwedFine() {return owedFine;}

    private void setOwedFine(double owedFine) {this.owedFine = owedFine;}

    private double getPaidFine() {return paidFine;}

    private void setPaidFine(double paidFine) {this.paidFine = paidFine;}

    public Boolean getPayment() {return doPayment;}

    public void setIsPhysical(Boolean doPayment) {this.doPayment = doPayment;}

    @Override
    public String toString()
    {
        return String.format(
                "Movies[id='%s', title='%s', directorLastName='%s', directorFirstName='%s']",
                id, title, directorLName, directorFName);
    }
}

