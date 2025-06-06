package com.corelogic.tech_talk.solid_principles.open_closed.after;

public class RegularDiscount implements Discount {
    public double calculate(double amount) {
        return amount * 0.1;
    }
}