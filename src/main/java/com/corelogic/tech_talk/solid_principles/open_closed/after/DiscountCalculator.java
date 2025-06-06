package com.corelogic.tech_talk.solid_principles.open_closed.after;

public class DiscountCalculator {
    public double calculateDiscount(Discount discount, double amount) {
        return discount.calculate(amount);
    }
}