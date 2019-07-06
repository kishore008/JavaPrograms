package com.kishore;

public class PrinterType {
    private String printerType;
    private String color;
    private String wifi;

    public PrinterType(String printerType, String color, String wifi){
        this.printerType = printerType;
        this.color = color;
        this.wifi = wifi;
    }

    public String getPrinterType(){
        return printerType;
    }

    public String getColor(){
        return color;
    }

    public String getWifi(){
        return wifi;
    }
}
