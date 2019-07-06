package com.company;

public class Main {

    public static void main(String[] args) {
//      Dimensions dimensions = new Dimensions(20, 20, 5);
//	    Case theCase = new Case("2208", "dell", "240", dimensions);
//
//	    Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540 , 1440));
//
//	    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//	    PC thePC = new PC(theCase, theMonitor, theMotherboard);
//	    thePC.powerUp();

		Mattress theMattress = new Mattress("Queensize", "Cotton");
		Bed theBed = new Bed(6, 6 ,"Queen", theMattress);
		Fan theFan = new Fan(500, "Toshiba");

		Bedroom bedroom = new Bedroom(theBed, theMattress, theFan);

		bedroom.getMattress().getMattressType();
		System.out.println(bedroom.getFan().getModel());
    }
}
