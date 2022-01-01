public class Vehicle {
    private String name;
    private String typeOfVehicle;
    private boolean hasWheels;
    private boolean isCostly;
    private String distance;

    public Vehicle(){
    this("unknown","unknown",false,false,"unknown");
    // this constructor calls the second constructor
    }


    public Vehicle(String name,String typeOfVehicle,boolean hasWheels){
    this(name,typeOfVehicle,false,false,"unknown");
    // this constructor calls the third constructor
    }

    public Vehicle(String name,String typeOfVehicle,boolean hasWheels,
                   boolean isCostly,String distance){
        this.name=name;
        this.typeOfVehicle=typeOfVehicle;
        this.hasWheels=hasWheels;
        this.isCostly=isCostly;
        this.distance=distance;
        // this constructor always initialize the fields of this class
    }

    public String getName(){
        return name;
    }
    public String getTypeOfVehicle(){
        return typeOfVehicle;
    }
    public boolean getHasWheels(){
        return hasWheels;
    }
    public boolean getIsCostly(){
        return isCostly;
    }
    public String getDistance(){
        return distance;
    }


    // static method

    public void printName(String name){
        System.out.println("your name is : "+name);
    }

    public static void printAge(int age){
        System.out.println("Your Age is "+age);
    }

    public void favouriteFood(String foodName,boolean vegetarian,int timeToCookInMIN){
        System.out.println("this is vehicle.favouriteFood()");
        if (vegetarian==false) {
            System.out.println(foodName + " is non-vegetarian, and it will take "+timeToCookInMIN+" min to cooks");
        }
        else{
            System.out.println(foodName + " is vegetarian dish, and it will take "+timeToCookInMIN+" min to cooks");
        }
    }


}
