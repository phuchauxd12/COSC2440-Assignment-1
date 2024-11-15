package models.person;

import models.storage.StorageItem;

import java.util.Date;

public class Person implements StorageItem {
    protected String id;
    protected String fullName;
    protected Date dateOfBirth;
    protected String contactInfo;

    public Person() {
        this.id ="Default";
        this.fullName = "Default";
        this.dateOfBirth = new Date();
        this.contactInfo = "Default";
    }

    public Person(String id, String fullName, Date dateOfBirth, String contactInfo) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.contactInfo = contactInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}
