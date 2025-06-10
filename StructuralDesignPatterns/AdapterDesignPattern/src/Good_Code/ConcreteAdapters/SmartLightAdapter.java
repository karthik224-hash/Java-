package Good_Code.ConcreteAdapters;

import Good_Code.ConcreteDevices.SmartLight;
import Good_Code.SmartDevice;

public class SmartLightAdapter implements SmartDevice {
    private SmartLight smartLight;
    public SmartLightAdapter(SmartLight smartLight) {
        this.smartLight = smartLight;
    }

    @Override
    public void turnOn() {
        smartLight.connectToWiFi();
        smartLight.switchOn();
    }

    @Override
    public void turnOff() {
        smartLight.switchOff();
        smartLight.disconnectWiFi();
    }
}
