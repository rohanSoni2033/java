package com.RohanSoni;

import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
        Resolution resolution = new Resolution(10, 12);
        Display display = new Display("ips full hd", 15.6, resolution);
        Laptop laptop = new Laptop(display);
//        System.out.println(display);
//        System.out.println(laptop);
//        System.out.println(resolution);

//        System.out.println(laptop.display());
        laptop.display().getResolution().draw(12, 50, "red");


    }
}
