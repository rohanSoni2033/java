package com.RohanSoni;

public class Main {

    public static void main(String[] args) {
        Person person=new Person();
        person.setFirstName("rohan");
        person.setLastName("");
        System.out.println(person.getFullName());
        person.setAge(-5);
        System.out.println(person.getAge());
        System.out.println(person.isTeen());

        person.setFirstName("rohan");
        person.setLastName("soni");
        person.setAge(19);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());
    }
}
