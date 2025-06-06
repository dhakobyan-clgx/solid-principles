package com.corelogic.tech_talk.solid_principles.liskov_substitution.after;

/**
 * Explanation: The Rectangle and Square classes now implement the Shape interface, making them interchangeable
 * without altering the correctness of the program. This adheres to the Liskov Substitution Principle.
 */
public class Solution {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);
        Circle circle = new Circle(5);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
