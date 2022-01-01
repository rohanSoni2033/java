package com.RohanSoni;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contacts> contactDetails = new ArrayList<>();

    public boolean addNewContact(Contacts contact) {
        if (findContactByName(contact.getName()) >= 0) {
            return false;
        } else {
            contactDetails.add(contact);
            return true;
        }
    }

    public boolean deleteContact(String name) {
        if (findContactByName(name) >= 0) {
            contactDetails.remove(findContactByName(name));
            return true;
        } else {
            System.out.println(findContactByName(name));
            return false;
        }
    }

    public boolean changeName(String currentName, String newName) {
        if (!(findContactByName(newName)>=0)) {
            if (findContactByName(currentName) >= 0) {
                contactDetails.get(findContactByName(currentName)).setName(newName);
                return true;
            }  else return false;
        }
        else return false;
    }

    public boolean changePhoneNumber(String name, String newPhoneNumber) {
        if (findContactByName(name) >= 0) {
            contactDetails.get(findContactByName(name)).setName(newPhoneNumber);
            return true;
        } else return false;
    }

    public boolean changeTag(String name, String newTag) {
        if (findContactByName(name) >= 0) {
            contactDetails.get(findContactByName(name)).setTag(newTag);
            return true;
        } else return false;
    }

    public boolean changeEmailAddress(String name, String newEmailAddress) {
        if (findContactByName(name) >= 0) {
            contactDetails.get(findContactByName(name)).setEmailAddress(newEmailAddress);
            return true;
        } else return false;
    }

    public void searchContactByName(String name) {
        int i = findContactByName(name);
        if (i >= 0) {
            System.out.println("Contact found in list");
            System.out.println((i + 1) + ". " + contactDetails.get(i).getName() + "[" + contactDetails.get(i).getTag() + "]"
                    + " : " + contactDetails.get(i).getPhoneNumber() + " (" + contactDetails.get(i).getEmailAddress() + ")");
        } else {
            System.out.println("contact not found in list");
        }
    }

    public void searchContactByNumber(String phoneNumber) {
        int i = findContactByNumber(phoneNumber);
        if (i >= 0) {
            System.out.println("Contact found in list");
            System.out.println((i + 1) + ". " + contactDetails.get(i).getName() + "[" + contactDetails.get(i).getTag() + "]"
                    + " : " + contactDetails.get(i).getPhoneNumber() + " (" + contactDetails.get(i).getEmailAddress() + ")");
        } else {
            System.out.println("contact not found in list");
        }
    }

    private int findContactByName(String name) {
        for (int i = 0; i < contactDetails.size(); i++) {
            Contacts contacts = contactDetails.get(i);
            if ((contacts.getName()).equals(name)) {
                return i;
            }
        }
        return -1;
    }


    private int findContactByNumber(String phoneNumber) {
        for (int i = 0; i < contactDetails.size(); i++) {
            if ((contactDetails.get(i).getPhoneNumber()).equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }

    public void printContactList() {
        System.out.println("Contacts (total contact : " + contactDetails.size() + ")");
        for (int i = 0; i < contactDetails.size(); i++) {
            System.out.println((i + 1) + ". " + contactDetails.get(i).getName() + "[" + contactDetails.get(i).getTag()
                    + "]" + " : " + contactDetails.get(i).getPhoneNumber() + " (" +
                    contactDetails.get(i).getEmailAddress() + ")");
        }
    }

}
