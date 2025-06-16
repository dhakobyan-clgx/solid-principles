package com.corelogic.solid.principles.open_closed.after;

public class GoldDiscount implements Discount {
    @Override
    public double calculate(double amount) {
        return amount * 0.5;
    }
}
