package com.corelogic.solid.principles.OpenClosed.after;

public class RegularDiscount extends Discount {
    public double calculate(double amount) {
        return amount * 0.1;
    }
}