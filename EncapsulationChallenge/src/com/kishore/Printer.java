package com.kishore;

public class Printer {
    private Toner tonerLevel;
    private Pages noOfPages;
    private PrinterType printerType;
    private int printedPages;

    public Printer(Toner tonerLevel, Pages noOfPages, PrinterType printerType, int printedPages){
        this.tonerLevel = tonerLevel;
        this.noOfPages = noOfPages;
        this.printerType = printerType;
        this.printedPages = printedPages;
    }

    public int getTonerLevel(){
        return tonerLevel.getTonerPresent();
    }

    public void fillToner(){
        tonerLevel.fillToner();
    }

    public int getNoOfPages(){
        return noOfPages.getNoOfPages();
    }

    public void printPages(int copies){
        printedPages += copies;
        System.out.println(copies + " being printed");
    }

    public int getPrintedPages(){
        return printedPages;
    }
}
