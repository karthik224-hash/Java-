package Good_Code.ConcreteDevices;

import Good_Code.SmartComponent;

public class SmartLight implements SmartComponent {
    public void turnOn() {
        System.out.println("SmartLight is turned ON");
    }
    public void turnOff() {
        System.out.println("SmartLight is turned OFF");
    }
}
