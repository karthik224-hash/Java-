package Good_Code.ConcreteVehicles;

import Good_Code.Vehicle;

public class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}
