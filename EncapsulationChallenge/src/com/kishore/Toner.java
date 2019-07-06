package com.kishore;

public class Toner {
    private int tonerCapacity = 100;
    private int tonerPresent;

    public Toner(int tonerCapacity, int tonerPresent){
        if(tonerCapacity<60){
            System.out.println("Please recharge toner, toner is less than 60 %");
        }
        this.tonerPresent = tonerPresent;
    }

    public int getTonerPresent(){
        return tonerPresent;
    }

    public void fillToner(){
        System.out.println("Filling toner...");
        tonerPresent += (100-tonerPresent);
    }
}
