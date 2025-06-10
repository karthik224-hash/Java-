package Good_Code.ClientCode;

import Good_Code.CompositeClass.CompositeSmartComponent;
import Good_Code.ConcreteDevices.AirConditioner;
import Good_Code.ConcreteDevices.SmartLight;
import Good_Code.SmartComponent;

public class SmartHomeController {
    public static void main(String[] args) {
        SmartComponent airConditioner = new AirConditioner();
        SmartComponent smartLight = new SmartLight();

        CompositeSmartComponent room1 = new CompositeSmartComponent();
        room1.addComponent(airConditioner);
        room1.addComponent(smartLight);

        CompositeSmartComponent room2 = new CompositeSmartComponent();
        room2.addComponent(new AirConditioner());
        room2.addComponent(new SmartLight());

        CompositeSmartComponent floor = new CompositeSmartComponent();
        floor.addComponent(room1);
        floor.addComponent(room2);

        CompositeSmartComponent house = new CompositeSmartComponent();
        house.addComponent(floor);

        System.out.println("Turning ON all the devices in the house.");
        house.turnOn();
        System.out.println("Turning OFF all the devices in the house");
        house.turnOff();

        System.out.println("Turning ON all the devices on the first floor");
        floor.turnOn();
        System.out.println("Turning OFF all the devices on the first floor");
        floor.turnOff();

        System.out.println("Turning ON all the devices in the first room");
        room1.turnOn();
        System.out.println("Turning OFF all the devices in the first room");
        room1.turnOff();
    }
}
