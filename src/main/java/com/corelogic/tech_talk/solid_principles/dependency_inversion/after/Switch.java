package com.corelogic.tech_talk.solid_principles.dependency_inversion.after;

public class Switch {
    private final Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}
