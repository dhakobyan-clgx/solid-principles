package com.corelogic.solid.principles.open_closed.after;

/**
 * Explanation: The DiscountCalculator class now depends on the Discount interface, allowing new discount
 * types to be added without modifying the existing code. This adheres to the Open/Closed Principle.
 */
public class Solution {
    public static void main(String[] args) {
        Discount regularDiscount = new RegularDiscount();
        Discount premiumDiscount = new PremiumDiscount();
        Discount goldDiscount = new GoldDiscount();

        DiscountCalculator calculator = new DiscountCalculator();

        double regularDiscountAmount = calculator.calculateDiscount(regularDiscount, 100);
        double premiumDiscountAmount = calculator.calculateDiscount(premiumDiscount, 100);
        double goldDiscountAmount = calculator.calculateDiscount(goldDiscount, 100);

        System.out.println("Regular Discount: " + regularDiscountAmount);
        System.out.println("Premium Discount: " + premiumDiscountAmount);
        System.out.println("Gold Discount: " + goldDiscountAmount);
    }
}
