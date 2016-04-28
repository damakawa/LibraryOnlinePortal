package com.lanaebk.library.portal;

/**
 * Created by JiwenZhang on 16/4/28.
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

public class Staffs {
    //ID
    private int id;
    private String FName;
    private String LName;
    private String address1;
    private String address2;
    private String street;
    private String city;
    private String state;
    private int zip;
    private int accountNum;
    private String emailAdd;
    private int phoneNum;
    private int birthday;
    private double workHours;

    public Staffs() {}

    public Staffs(int id, String LName, String FName)
    {
        this.id = id;
        this.LName = LName;
        this.FName = FName;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getLName()
    {
        return LName;
    }

    public void setLName(String LName)
    {
        this.LName = LName;
    }

    public String getFName()
    {
        return FName;
    }

    public void setFName(String authorFName)
    {
        this.FName = FName;
    }

    public String getAddress1()
    {
        return address1;
    }

    public void setAddress1(String address1)
    {
        this.address1 = address1;
    }

    public String getAddress2() { return address2;}

    public void setAddress2(String address2) {this.address2 = address2;}

    public String getState() { return state;}

    public void setState(String state) {this.state = state;}

    public String getStreet() {return street;}

    public void setStreet(String street) {this.street = street;}

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    private int getPhoneNum() {return phoneNum;}

    private void setPhoneNum(int phoneNum) {this.phoneNum = phoneNum;}

    private int getZip() {return zip;}

    private void setZip(int zip) {this.zip = zip;}

    private int getAccountNum() {return accountNum;}

    private void setAccountNum(int accountNum) {this.accountNum = accountNum;}

    private int getBirthday() {return birthday;}

    private void setBirthday(int birthday) {this.birthday = birthday;}

    private String getEmailAdd() {return emailAdd;}

    private void setEmailAdd(String emailAdd) {this.emailAdd = emailAdd;}


    private double getWorkHours() {return workHours;}

    private void setWorkHours(double workHours) {this.workHours = workHours;}

    @Override
    public String toString()
    {
        return String.format(
                "Staffs[id='%s', StaffLastName='%s', StaffFirstName='%s']",
                id, LName, FName);
    }
}
