package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone kishorePhone;
	    kishorePhone = new DeskPhone(779517);
	    kishorePhone.powerOn();
	    kishorePhone.callPhone(779517);
	    kishorePhone.answer();

	    kishorePhone = new MobilePhone(12356);
	    kishorePhone.powerOn();
	    kishorePhone.callPhone(12356);
	    kishorePhone.answer();
    }
}
