package com.company;

public class Bedroom {
    private Bed bed;
    private Mattress mattress;
    private Fan fan;

    public Bedroom(Bed bed, Mattress mattress, Fan fan){
        this.bed = bed;
        this.mattress = mattress;
        this.fan = fan;
    }

    public Bed getBed() {
        return bed;
    }

    public Mattress getMattress() {
        return mattress;
    }

    public Fan getFan() {
        return fan;
    }
}
