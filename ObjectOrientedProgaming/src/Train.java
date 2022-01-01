public class Train extends Vehicle {
    private int numberOfCoaches;
    private boolean hasPantryCar;
    private String departureStation;
    private String arrivalStation;
    private int timeInHours;
    private int numberOfHalts;
    private String foodName;
    private boolean vegetarian;
    private int timeToCookInMIN;

    public Train() {
        System.out.println("Train's constructor");
    }

    public Train(String name,String typeOfVehicle,boolean hasWheels,boolean isCostly,String distance,
                 int numberOfCoaches, boolean hasPantryCar, String departureStation, String arrivalStation,
                 int timeInHours, int numberOfHalts, String foodName, boolean vegetarian, int timeToCookInMIN) {

        super(name,typeOfVehicle,hasWheels,isCostly,distance);

        this.numberOfCoaches = numberOfCoaches;
        this.hasPantryCar = hasPantryCar;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.timeInHours = timeInHours;
        this.numberOfHalts = numberOfHalts;
        this.foodName = foodName;
        this.vegetarian = vegetarian;
        this.timeToCookInMIN = timeToCookInMIN;
    }

    public static void printIndia() {
        System.out.println("India is a great country");
    }

    public void trainSpeed(int speed) {
        System.out.println("Train is running at " + speed + " km/h");
    }

    @Override
    public void favouriteFood(String foodName, boolean vegetarian, int timeToCookInMIN) {
        super.favouriteFood(foodName, vegetarian, timeToCookInMIN);
        System.out.println("this is train.favouriteFood()");
//        if (vegetarian==false) {
//            System.out.println(foodName + " is non-vegetarian, and it will take "+timeToCookInMIN+" min to cooks");
//        }
//        else{
//            System.out.println(foodName + " is vegetarian dish, and it will take "+timeToCookInMIN+" min to cooks");
//        }
    }


}
