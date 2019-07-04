package com.kishore;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(double creditLimit, String email){
        this("KishoreKumar2", creditLimit, email);
    }

    public VipCustomer(String email){
        this("KishoreKumar3", 1000, email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
