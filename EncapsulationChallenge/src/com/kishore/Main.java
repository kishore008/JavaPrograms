package com.kishore;

public class Main {

    public static void main(String[] args) {

        Toner tonerLevel = new Toner(100, 20);
        Pages noOfPages = new Pages(30, 100);
        PrinterType printerType = new PrinterType("Duplex", "Color", "Wifi");

        Printer printerClass = new Printer(tonerLevel, noOfPages, printerType, 13);

        printerClass.getNoOfPages();
        System.out.println("The toner level is " + printerClass.getTonerLevel());
        System.out.println("The number of pages printed previously is " + printerClass.getPrintedPages());
        printerClass.printPages(5);
        System.out.println("Total number of pages after printing is " + printerClass.getPrintedPages());
        printerClass.fillToner();
        System.out.println("The total toner after filling is " + printerClass.getTonerLevel());

    }
}
