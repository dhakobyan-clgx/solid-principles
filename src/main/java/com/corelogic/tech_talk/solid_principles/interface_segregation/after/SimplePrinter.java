package com.corelogic.tech_talk.solid_principles.interface_segregation.after;

public class SimplePrinter implements Printer {
    public void printDocument() {
        System.out.println("Printing document...");
    }
}