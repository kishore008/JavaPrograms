package com.kishore;

public class Pages {
    private int noOfPages;
    private int capacityOfPages = 100;

    public Pages (int noOfPages, int capacityOfPages){
        if(noOfPages<=50){
            System.out.println("The number of pages present is " + noOfPages + ", please refill");
            this.noOfPages = noOfPages;
        }
        this.capacityOfPages = capacityOfPages;
    }

    public void fillPages(){
        System.out.println("Refilling the pages..");
        noOfPages += (capacityOfPages - noOfPages);
        System.out.println("The number of pages now is " + noOfPages);
    }

    public int getNoOfPages(){
        return noOfPages;
    }

}
