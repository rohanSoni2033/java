package com.RohanSoni;

public class Contacts {
    private String name;
    private String phoneNumber;
    private String tag;
    private String emailAddress;

    public Contacts(String name, String phoneNumber, String tag, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.tag = tag;
        this.emailAddress = emailAddress;
    }

    public static Contacts createNewContact(String name, String phoneNumber, String tag, String emailAddress) {
        return new Contacts(name, phoneNumber, tag, emailAddress);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
