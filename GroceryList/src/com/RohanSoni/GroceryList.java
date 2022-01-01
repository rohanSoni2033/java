package com.RohanSoni;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void removeGroceryItem(String item) {
        groceryList.remove(item);
    }

    public void modifyGroceryItem(int item, String modifiedName) {
        groceryList.set(item, modifiedName);
        System.out.println("Item at " + (item + 1) + " is modified to " + modifiedName);
    }

    public boolean searchGroceryItem(String itemName) {
        return groceryList.contains(itemName);
    }

    public void printGroceryList() {
        if (groceryList.size() > 0) {
            System.out.println("You have " + groceryList.size() + " Items in Your List");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println(i + 1 + ". " + groceryList.get(i));
            }
        } else {
            System.out.println("Your Shopping List is Empty");
        }
    }

    public void printInstructions() {
        System.out.println("1. add item to your list");
        System.out.println("2. remove item form your list");
        System.out.println("3. modify item in your list");
        System.out.println("4. search item from list");
        System.out.println("5. print the list of your all items");
        System.out.println("6. exit the application");
    }

    public boolean check(String itemName){
        return groceryList.contains(itemName);
    }
}

