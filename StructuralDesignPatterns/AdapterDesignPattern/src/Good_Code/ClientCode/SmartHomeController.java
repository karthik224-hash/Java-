package Good_Code.ClientCode;

import Good_Code.ConcreteAdapters.CoffeeMachineAdapter;
import Good_Code.ConcreteAdapters.SmartLightAdapter;
import Good_Code.ConcreteDevices.AirConditioner;
import Good_Code.ConcreteDevices.CoffeeMachine;
import Good_Code.ConcreteAdapters.AirConditionerAdapter;
import Good_Code.ConcreteDevices.SmartLight;
import Good_Code.SmartDevice;

public class SmartHomeController {
    public static void main(String[] args) {
        SmartDevice airConditioner = new AirConditionerAdapter(new AirConditioner());
        SmartDevice smartLight = new SmartLightAdapter(new SmartLight());
        SmartDevice coffeeMachine = new CoffeeMachineAdapter(new CoffeeMachine());
        airConditioner.turnOn();
        airConditioner.turnOff();
        smartLight.turnOn();
        smartLight.turnOff();
        coffeeMachine.turnOn();
        coffeeMachine.turnOff();
    }
}
