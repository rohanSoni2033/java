package com.RohanSoni;

public class Customer {

    private String name;
    private String accountNumber;
    private String emailAddress;
    private String phoneNumber;
    private String address;
    private double balance;

    public Customer(){
        this("unknown","91xxxxxxxxxx",
                "myemail@123gmail.com",
                "0123456789",
                "unknown",0);
        System.out.println("empty constructor called");
    }

    public Customer(String name,String accountNumber,String emailAddress,
                    String phoneNumber,String address,double balance){
        System.out.println("constructor with parameters called");
        this.name=name;
        this.accountNumber=accountNumber;
        this.emailAddress=emailAddress;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.balance=balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount >= 0) {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal of " + withdrawalAmount + " successeded," +
                    "remaining balance " + this.balance);
        } else {
            System.out.println("insufficient balance!!" +
                    " withdrawal of " + withdrawalAmount + " failed," +
                    "available balance " + this.balance);
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("invalid deposit amount");
        } else {
            this.balance += depositAmount;
            System.out.println("deposit of " + depositAmount + " successfully" +
                    "available balance " + this.balance);
        }
    }
}
