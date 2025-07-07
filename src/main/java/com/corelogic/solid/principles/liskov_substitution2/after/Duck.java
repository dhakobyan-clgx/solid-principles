package com.corelogic.solid.principles.liskov_substitution2.after;

public class Duck implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Duck is eating.");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
}