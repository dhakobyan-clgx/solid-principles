package com.corelogic.tech_talk.solid_principles.liskov_substitution.after;

public class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }
}
