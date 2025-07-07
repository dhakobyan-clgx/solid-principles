package com.corelogic.solid.principles.liskov_substitution2.before;

public class Duck extends Bird {
    @Override
    void fly() {
        System.out.println("Duck is flying");
    }
}
