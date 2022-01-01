package com.RohanSoni;

public class Main {

    public static void main(String[] args) {
//    Wall object=new Wall(5,7);
//        double area = object.getArea();
//        System.out.println(area);
//
//        object.setHeight(-1);
//        System.out.println(object.getWidth());
//        System.out.println(object.getHeight());
//        System.out.println(object.getArea());

        Floor floor=new Floor(2,3);
        System.out.println(floor.getArea());
       // Floor floor1=new Floor(-3,5);
        // System.out.println(floor1.getArea());

        Carpet carpet=new Carpet(800);
        //Carpet carpet1=new Carpet((-80));
        System.out.println(carpet.getCost());
        //System.out.println(carpet1.getCost());

//        Calculator calculator =new Calculator(floor.getArea(),carpet.getCost());

//        calculator.getTotalCost();
//        System.out.println(calculator.getTotalCost());

    }
}
