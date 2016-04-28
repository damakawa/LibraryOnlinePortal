package com.lanaebk.library.portal;

/**
 * Created by JiwenZhang on 16/4/28.
 */

public class Musics {
    //ID
    private String id;
    private String album;
    private String singerFName;
    private String singerLName;
    private String composerFName;
    private String composerLName;
    private String publisher;
    private int dateOfPublication;
    private String genre;
    private String format;
    private int rating;
    private String evaluation;
    private double owedFine;
    private double paidFine;
    private int expirationDate;
    private boolean doPayment;

    public Musics() {}

    public Musics(String album, String singerLName, String singerFName)
    {
        this.album = album;
        this.singerLName = singerLName;
        this.singerFName = singerFName;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getAlbum()
    {
        return album;
    }

    public void setAlbum(String album)
    {
        this.album = album;
    }

    public String getSingerLName()
    {
        return singerLName;
    }

    public void setSingerLName(String singerLName)
    {
        this.singerLName = singerLName;
    }

    public String getComposerFName()
    {
        return composerFName;
    }

    public void setComposerFName(String composerFName)
    {
        this.composerFName = composerFName;
    }

    public String getComposerLName()
    {
        return composerLName;
    }

    public void setComposerLName(String composerLName)
    {
        this.composerLName = composerLName;
    }

    public String getSingerFName()
    {
        return singerFName;
    }

    public void setSingerFName(String singerFName)
    {
        this.singerFName = singerFName;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public int getDateOfPublication()
    {
        return dateOfPublication;
    }

    public void setDateOfPublication(int dateOfPublication)
    {
        this.dateOfPublication = dateOfPublication;
    }

    public String getGenre() { return genre;}

    public void setGenre(String genre) {this.genre = genre;}

    public String getFormat() { return format;}

    public void setFormat(String format) {this.format = format;}


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
                "Musics[id='%s', album='%s', singerLastName='%s', singerFirstName='%s']",
                id, album, singerLName, singerFName);
    }
}