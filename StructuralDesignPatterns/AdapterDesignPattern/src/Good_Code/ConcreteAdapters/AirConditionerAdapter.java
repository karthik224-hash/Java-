package Good_Code.ConcreteAdapters;

import Good_Code.SmartDevice;
import Good_Code.ConcreteDevices.AirConditioner;

public class AirConditionerAdapter implements SmartDevice {
    private AirConditioner airConditioner;
    public AirConditionerAdapter(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
    public void turnOn() {
        airConditioner.connectViaBluetooth();
        airConditioner.startCooling();
    }

    public void turnOff() {
        airConditioner.stopCooling();
        airConditioner.disconnectBluetooth();
    }
}
