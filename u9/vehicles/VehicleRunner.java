package vehicles;
public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----

        Bicycle b1 = new Bicycle("Aima", 2, 20);
        System.out.println(b1.getName());
        System.out.println(b1.getWheels());
        System.out.println(b1.getGearCount());
        b1.move(12);
        b1.turn();
        b1.brake();
        b1.ringBell();

        // ---- TRAIN TEST ----
        Train t1 = new Train("MTA", 80, 10);
        System.out.println(t1.getName());
        System.out.println(t1.getWheels());
        System.out.println(t1.getCarts());
        t1.move(100);
        t1.turn();
        t1.brake();
        t1.announceDelay();
        t1.announceStop("36th Street");

    }
}