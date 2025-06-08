package Good_Code;

import Good_Code.ConcreteVehicles.Bike;
import Good_Code.ConcreteVehicles.Car;
import Good_Code.ConcreteVehicles.Truck;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equals("Car")) {
            return new Car();
        } else if (vehicleType.equals("Truck")) {
            return new Truck();
        } else if  (vehicleType.equals("Bike")) {
            return new Bike();
        } else {
            throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
