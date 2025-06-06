package com.corelogic.tech_talk.solid_principles.dependency_inversion.after;

public class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb on");
    }

    public void turnOff() {
        System.out.println("LightBulb off");
    }
}