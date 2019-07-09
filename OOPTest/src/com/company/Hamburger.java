package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1name;
    private double addition1Price;
    private String addition2name;
    private double addition2Price;
    private String addition3name;
    private double addition3Price;
    private String addition4name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + "  hamburger" + " on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        if (this.addition2name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2name + " for an extra " + this.addition2Price);
        }

        if (this.addition3name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3name + " for an extra " + this.addition3Price);
        }

        if (this.addition4name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition4name + " for an extra " + this.addition4Price);
        }

        if (this.addition1name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1name + " for an extra " + this.addition1Price);
        }

        return hamburgerPrice;
    }

}
