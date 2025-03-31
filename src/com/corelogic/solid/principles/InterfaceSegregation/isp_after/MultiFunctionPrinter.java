package com.corelogic.solid.principles.InterfaceSegregation.isp_after;

public class MultiFunctionPrinter implements Printer, Scanner, Fax {
    public void printDocument() {
        System.out.println("Printing document...");
    }

    public void scanDocument() {
        System.out.println("Scanning document...");
    }

    public void faxDocument() {
        System.out.println("Faxing document...");
    }
}