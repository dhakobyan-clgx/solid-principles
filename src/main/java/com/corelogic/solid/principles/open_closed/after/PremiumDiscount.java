package com.corelogic.solid.principles.open_closed.after;

public class PremiumDiscount implements Discount {
    public double calculate(double amount) {
        return amount * 0.2;
    }
}