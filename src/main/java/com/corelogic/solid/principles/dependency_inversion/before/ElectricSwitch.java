package com.corelogic.solid.principles.dependency_inversion.before;

/**
 * Definition: High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * Abstractions should not depend on details. Details should depend on abstractions.
 *
 * Consider a LightBulb class and a Switch class.
 *
 * Explanation: The Switch class directly depends on the LightBulb class, violating the Dependency Inversion Principle.
 */
public class ElectricSwitch {
    private final LightBulb lightBulb;

    public ElectricSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void operate() {
        lightBulb.turnOn();
    }

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        ElectricSwitch lightElectricSwitch = new ElectricSwitch(lightBulb);
        lightElectricSwitch.operate();
    }
}
