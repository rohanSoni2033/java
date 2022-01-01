import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        System.out.println(vehicle.getName());
        System.out.println(vehicle.getTypeOfVehicle());
        System.out.println(vehicle.getHasWheels());
        System.out.println(vehicle.getIsCostly());
        System.out.println(vehicle.getDistance());

        Vehicle bus=new Vehicle("Bus","Land",
                true,false,"short or long both");

        System.out.println("Vehicle Name : "+bus.getName());
        System.out.println(bus.getTypeOfVehicle()+" Type Vehicles");
        System.out.println("Vehicle has Wheels : "+bus.getHasWheels());
        System.out.println("Vehicle is Costly : " +bus.getIsCostly());
        System.out.println(bus.getDistance()+" Distance(s) can be Covered by the "+bus.getName());

        vehicle.favouriteFood("matar-panner",true,40);

    
        vehicle.printName("rohan");

        Vehicle.printAge(18);

     
        printName("rohan soni");
        printName();

        Train.printIndia();

        Train train=new Train();
        train.favouriteFood("chicken-biryani",false,80);
    }

    // static method
    public static void printName(String name){
        System.out.println("Your Name is : "+name);
    }
    public static void printName(){
        System.out.println("Your Name is Unknown");
    }

    // instance method
    public void printAge(int age){
        System.out.println("Your age is : "+age);
    }
}
