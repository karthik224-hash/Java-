package Good_Code.ConcreteDevices;

import Good_Code.SmartComponent;

public class AirConditioner implements SmartComponent {
    public void turnOn() {
        System.out.println("AirConditioner is now turned ON");
    }
    public void turnOff() {
        System.out.println("AirConditioner is now turned OFF");
    }
}
