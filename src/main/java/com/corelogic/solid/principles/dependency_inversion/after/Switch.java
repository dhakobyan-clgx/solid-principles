package com.corelogic.solid.principles.dependency_inversion.after;

public class Switch {
    private final Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}
