package com.corelogic.tech_talk.solid_principles.interface_segregation.before;

/**
 * Definition: Clients should not be forced to depend on interfaces they do not use.
 * Explanation: The SimplePrinter class implements methods that it does not use,
 * violating the Interface Segregation Principle.
 */
public class SimplePrinter implements Printer {
    public void printDocument() {
        System.out.println("Printing document...");
    }

    public void scanDocument() {
        // Not implemented
    }

    public void faxDocument() {
        // Not implemented
    }

    public static void main(String[] args) {
        SimplePrinter printer = new SimplePrinter();
        printer.printDocument();
    }
}