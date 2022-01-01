package com.RohanSoni;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // create a new contact {Name, Phone Number, [Tag(optional)], (email(optional))}
        // remove any existed contact by name or phone number
        // change name or phone number of any existed contact
        // delete any contact by name
        // search any contact by name or phone number
        // show all contacts that are available in contact list

        MobilePhone mobilePhone = new MobilePhone();
        boolean quit = false;
        printInstructions();

        while (!quit) {
            System.out.println("Enter the instructions : ");
            int instructionNumber = s.nextInt();
            s.nextLine();

            if (instructionNumber == 1) {
                String name = getName();
                String phoneNumber = getPhoneNumber();
                String tag = getTag();
                String emailAddress = getEmailAddress();
                if (mobilePhone.addNewContact(Contacts.createNewContact(name, phoneNumber, tag, emailAddress))) {
                    System.out.println("new contact added successfully\n" +
                            "Name : " + name + "\nphone number : " + phoneNumber);
                } else {
                    System.out.println(name + " is already is exits in Contacts");
                }
            } else if (instructionNumber == 2) {
                // delete contact
                String name = getName();
                if (mobilePhone.deleteContact(name)) {
                    System.out.println(name + " is deleted form Contact list");
                } else {
                    System.out.println(name + " is not found in Contact list");
                }
            } else if (instructionNumber == 3) {
                // change name
                String currentName = getName();
                String newName = getName();
                if (mobilePhone.changeName(currentName, newName)) {
                    System.out.println(currentName + " changed to " + newName + " successfully");
                } else {
                    System.out.println(currentName + " is not found in Contact list");
                }
            } else if (instructionNumber == 4) {
                // change phone number
                String name = getName();
                String newPhoneNumber = getPhoneNumber();
                if (mobilePhone.changePhoneNumber(name, newPhoneNumber)) {
                    System.out.println("mobile number of " + name + " is successfully changed to " + newPhoneNumber);
                } else {
                    System.out.println(name + " is not found in Contact list");
                }
            } else if (instructionNumber == 5) {
                // change tag
                String name = getName();
                String newTag = getTag();
                if (mobilePhone.changeTag(name, newTag)) {
                    System.out.println("tag of " + name + " is successfully changed to " + newTag);
                } else {
                    System.out.println(name + " is not found is Contact list");
                }
            } else if (instructionNumber == 6) {
                String name = getName();
                String newEmailAddress = getEmailAddress();
                if (mobilePhone.changeEmailAddress(name, newEmailAddress)) {
                    System.out.println("email address of " + name + " is successfully changed to " + newEmailAddress);
                } else {
                    System.out.println(name + " is not found in Contact list");
                }
            } else if (instructionNumber == 7) {
                String name = getName();
                mobilePhone.searchContactByName(name);
            } else if (instructionNumber == 8) {
                String phoneNumber = getPhoneNumber();
                mobilePhone.searchContactByNumber(phoneNumber);
            } else if (instructionNumber == 9) {
                printInstructions();
            } else if (instructionNumber == 10) {
                mobilePhone.printContactList();
            } else if (instructionNumber == 11) {
                quit = true;
            } else {
                System.out.println("invalid instructions entered !!");
            }
        }
    }

    private static String getName() {
        System.out.println("Enter the contact name : ");
        return s.nextLine();
    }

    public static String getPhoneNumber() {
        System.out.println("Enter the mobile number : ");
        return s.nextLine();
    }

    public static String getTag() {
        System.out.println("Enter the tag for the contact : ");
        return s.nextLine();
    }

    public static String getEmailAddress() {
        System.out.println("Enter the email address : ");
        return s.nextLine();
    }

    private static void printInstructions() {
        System.out.println("Available Instructions");
        System.out.println("1. Add new contact =>\n" +
                "2. Delete existing contact =>\n" +
                "3. Change name =>\n" +
                "4. Change phone number =>\n" +
                "5. Change tag =>\n" +
                "6. Change email address =>\n" +
                "7. Find contact by name =>\n" +
                "8. Find contact by mobile number\n" +
                "9. Print the instructions again =>\n" +
                "10. print the contact list\n" +
                "11. Quit the application");
    }
}
