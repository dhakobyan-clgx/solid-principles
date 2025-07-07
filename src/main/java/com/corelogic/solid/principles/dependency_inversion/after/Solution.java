package com.corelogic.solid.principles.dependency_inversion.after;

/**
 * To adhere to DIP, we should depend on abstractions.
 *
 * Explanation: The Switch class now depends on the Switchable interface rather than the LightBulb class.
 * This adheres to the Dependency Inversion Principle, as high-level modules and low-level modules both depend on abstractions.
 */
public class Solution {
    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();

        ElectricSwitch lightSwitch = new ElectricSwitch(lightBulb);

        lightSwitch.operate();  // Bulb ON
        lightSwitch.operate();  // Bulb OFF
    }
}
