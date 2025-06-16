package com.corelogic.solid.principles.interface_segregation.after;

/**
 * This interface should be split into smaller interfaces.
 *
 * Explanation: The Printer, Scanner, and Fax interfaces are now segregated, ensuring that classes only
 * implement the interfaces they use. This adheres to the Interface Segregation Principle.
 */
public class Solution {
    public static void main(String[] args) {
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.printDocument();

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.printDocument();
        mfp.scanDocument();
        mfp.faxDocument();
    }
}
