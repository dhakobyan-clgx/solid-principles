package com.corelogic.solid.principles.OpenClosed.after;

public class DiscountCalculator {
    public double calculateDiscount(Discount discount, double amount) {
        return discount.calculate(amount);
    }
}