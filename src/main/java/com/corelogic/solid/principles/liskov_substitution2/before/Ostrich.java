package com.corelogic.solid.principles.liskov_substitution2.before;

public class Ostrich extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}