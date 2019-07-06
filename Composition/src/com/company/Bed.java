package com.company;

public class Bed {
    private int width;
    private int height;
    private String typeOfBed;
    private Mattress mattress;

    public Bed(int width, int height, String typeOfBed, Mattress mattress){
        this.width = width;
        this.height = height;
        this.typeOfBed = typeOfBed;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getTypeOfBed() {
        return typeOfBed;
    }

    public Mattress getMattress() {
        return mattress;
    }
}
