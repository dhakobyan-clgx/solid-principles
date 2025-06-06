package com.corelogic.tech_talk.solid_principles.liskov_substitution.before;

/**
 * Definition: Subtypes must be substitutable for their base types without altering the correctness of the program.
 * Explanation: The Square class does not behave like a Rectangle when setting the width and height,
 * which violates the Liskov Substitution Principle.
 */
public class Square extends Rectangle {
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Square square = new Square();
        square.setWidth(5);
        System.out.println("Square Area: " + square.getArea());
    }
}