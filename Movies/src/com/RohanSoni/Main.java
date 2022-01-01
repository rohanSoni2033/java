package com.RohanSoni;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String Actor() {
        return "unknown actor";
    }

    public String getName() {
        return name;
    }

}

class IronMan extends Movie {
    public IronMan() {
        super("iron man");
    }

    @Override
    public String Actor() {
        return "robert downey jr.";
    }
}


class TheMartian extends Movie {
    public TheMartian() {
        super("the martain");
    }

    @Override
    public String Actor() {
        return "Matt demon";
    }
}

class Thor extends Movie {
    public Thor() {
        super("thor");
    }

    @Override
    public String Actor() {
        return "chris hemsworth";
    }
}

class Inception extends Movie {
    public Inception() {
        super("inception");
    }

    @Override
    public String Actor() {
        return "leonardo dicaprio";
    }
}
class Unknown extends Movie{
    public Unknown(){
        super("unknown");
    }
    public String Actor(){
        return "unknown";
    }
}

public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie("unknown movie");
        System.out.println(movie.getName());
        System.out.println(movie.Actor());

//        Inception inception = new Inception();
//        System.out.println(inception.getName());
//        System.out.println(inception.Actor());
//        Inception in = inceptionMovie();
////        System.out.println(in.Actor());
////        System.out.println(randomNumber());

        Movie in = randomNumber();
        System.out.println(in.getName() +", " + in.Actor());
    }

    public static Movie randomNumber() {
        int randomNumber = (int) ((Math.random() * 4) + 1);
        if (randomNumber==1){
            return new IronMan();
        }
        else if (randomNumber==2){
            return new TheMartian();
        }
        else if (randomNumber==3){
            return new IronMan();
        }
        else if (randomNumber==4){
            return new Inception();
        }
        else{
            return  new Movie("unknow");
        }
    }

    public static Inception inceptionMovie() {
        return new Inception();
    }
}
