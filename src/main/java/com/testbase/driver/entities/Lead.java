package com.testbase.driver.entities;

import java.util.Calendar;

/**
 * Created by Denton on (018) 18.03.16.
 */
public class Lead {
    private String name = "";
    private String lastName = "";
    private String companyName = "";
    private String title = "";
    private String email = "";
    private String phoneMobile = "";
    private String phoneWork = "";
    private String address = "";
    private String city = "";
    private String zipCode = "";
    private String state = "";

    public Lead() {
        lastName = "defaultLastName - " + Calendar.getInstance().getTime();
    }

    public Lead(Lead lead) {
        name = lead.getName();
        lastName = lead.getLastName();
        companyName = lead.getCompanyName();
        title = lead.getTitle();
        email = lead.getEmail();
        phoneMobile = lead.getPhoneMobile();
        phoneWork = lead.getPhoneWork();
        address = lead.getAddress();
        city = lead.getCity();
        zipCode = lead.getZipCode();
        state = lead.getState();
    }

    public void copyTo(Lead lead) {
        lead.setName(name);
        lead.setLastName(lastName);
        lead.setCompanyName(companyName);
        lead.setTitle(title);
        lead.setEmail(email);
        lead.setPhoneMobile(phoneMobile);
        lead.setPhoneWork(phoneWork);
        lead.setAddress(address);
        lead.setCity(city);
        lead.setZipCode(zipCode);
        lead.setState(state);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public String getPhoneWork() {
        return phoneWork;
    }

    public void setPhoneWork(String phoneWork) {
        this.phoneWork = phoneWork;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
