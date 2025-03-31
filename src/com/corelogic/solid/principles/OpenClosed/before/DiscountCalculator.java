package com.corelogic.solid.principles.OpenClosed.before;

/**
 * Explanation: The DiscountCalculator class violates the Open/Closed Principle because it needs to be
 * modified whenever a new type of discount is added.
 */
public class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.1;
        } else if (customerType.equals("Premium")) {
            return amount * 0.2;
        }
        return 0;
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        double regularDiscount = calculator.calculateDiscount("Regular", 100);
        double premiumDiscount = calculator.calculateDiscount("Premium", 100);

        System.out.println("Regular Discount: " + regularDiscount);
        System.out.println("Premium Discount: " + premiumDiscount);
    }
}