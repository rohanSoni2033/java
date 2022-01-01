package com.RohanSoni;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();
        groceryList.printInstructions();
        int choice;
        boolean exit = false;
        String itemName;
        while (!exit) {
            System.out.println("Enter the Instructions : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                boolean addingItems = true;
                while (addingItems) {
                    itemName = getItemName();
                    if (itemName.equals("x")) {
                        addingItems = false;
                    } else {
                        if (groceryList.check(itemName)){
                            System.out.println(itemName + " is already in your list");
                        }else {
                            groceryList.addGroceryItem(itemName);
                            System.out.println(itemName + " is added to your list");
                        }
                    }
                }
            } else if (choice == 2) {
                itemName = getItemName();
                if (groceryList.check(itemName)) {
                    groceryList.removeGroceryItem(itemName);
                    System.out.println(itemName + " is removed from your list");
                }
                else{
                    System.out.println(itemName + " not found in your list");
                }
            } else if (choice == 3) {
                itemName = getItemName();
                groceryList.modifyGroceryItem(getItemNumber() - 1, itemName);
            } else if (choice == 4) {
                itemName = getItemName();
                if (groceryList.searchGroceryItem(itemName)) {
                    System.out.println(itemName + " found");
                } else {
                    System.out.println("Item Not Found !!!");
                }
            } else if (choice == 5) {
                groceryList.printGroceryList();
            } else if (choice == 6) {
                exit = true;
            }
            else {
                System.out.println("Invalid Instruction!!");
                groceryList.printInstructions();
            }
        }
    }

    public static int getItemNumber() {
        System.out.println("Enter the item number : ");
        return scanner.nextInt();
    }

    public static String getItemName() {
        System.out.println("Enter the name of the item : ");
        return scanner.nextLine();
    }
}