package com.corelogic.solid.principles.liskov_substitution2.after;

public class Solution {

    // Functions demonstrating safe polymorphism
    static void letBirdEat(Bird bird) {
        bird.eat();
    }

    static void letItFly(FlyingBird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        letBirdEat(duck);
        letItFly(duck);

        Ostrich ostrich = new Ostrich();
        letBirdEat(ostrich);
    }
}
