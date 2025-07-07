package com.corelogic.solid.principles.liskov_substitution2.after;

public class Ostrich implements Bird {
    @Override
    public void eat() {
        System.out.println("Ostrich is eating.");
    }
}
