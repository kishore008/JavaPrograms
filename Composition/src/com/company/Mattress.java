package com.company;

public class Mattress {
    private String mattressType;
    private String material;

    public Mattress(String mattressType, String material){
        this.mattressType = mattressType;
        this.material = material;
    }

    public void getMattressType(){
        System.out.println("The mattress type is " + mattressType + " and the material is " + getMaterial());
    }

    private String getMaterial(){
        return material;
    }
}
