package com.corelogic.solid.principles.dependency_inversion.after;

public class ElectricSwitch {

    private final Switchable device;
    private boolean on;

    public ElectricSwitch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        if (on) {
            device.turnOff();
        } else {
            device.turnOn();
        }
        on = !on;
    }
}
