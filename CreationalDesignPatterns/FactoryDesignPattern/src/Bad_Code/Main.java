package Bad_Code;

import Bad_Code.ConcreteVehicles.Bike;
import Bad_Code.ConcreteVehicles.Car;
import Bad_Code.ConcreteVehicles.Truck;

public class Main {
    public static void main(String[] args) {
        String vehicleType = "Truck"; // Imagine this value is dynamic
        Vehicle vehicle;
        if (vehicleType.equals("Car")) {
            vehicle = new Car();
        } else if (vehicleType.equals("Truck")) {
            vehicle = new Truck();
        } else if (vehicleType.equals("Bike")) {
            vehicle = new Bike();
        } else {
            throw new IllegalArgumentException("Unknown vehicle type");
        }
        vehicle.start();
        vehicle.stop();
    }
}