package com.RohanSoni;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    Scanner scanner = new Scanner(System.in);
    private int numberOfShelves;
    private int numberOfBooks;
    private ArrayList<String> library = new ArrayList<>();

    public ArrayList getBook(){
        return library;
    }

    public Library(int numberOfShelves, int numberOfBooks) {
        this.numberOfShelves = numberOfShelves;
        this.numberOfBooks = numberOfBooks;
    }

    public void addNewBookToLibrary() {
        System.out.println("Enter the books name : ");
        String bookName = scanner.nextLine();
        library.add(bookName);
        System.out.println(bookName + " is added to your library");
    }

    public void removeBookFromLibrary() {
        System.out.println("Enter the book name : ");
        String bookName = scanner.nextLine();
        library.remove(bookName);
        System.out.println(bookName + " is removed from your library");
    }

    public void bookList() {
        for (int i = 0; i < library.size(); i++) {
            System.out.println((i+1) + ". "+library.get(i));
        }
    }
    public void searchForReading(){
        System.out.println("Enter the book name : ");
        String bookName = scanner.nextLine();
        if (library.contains(bookName)){
            System.out.println(bookName + " is available for reading in your library");
        } else{
            System.out.println(bookName + " not found in your library");
        }
    }
}
