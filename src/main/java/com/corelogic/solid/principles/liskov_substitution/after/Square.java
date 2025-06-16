package com.corelogic.solid.principles.liskov_substitution.after;

public class Square implements Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}