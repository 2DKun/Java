package com.company;

public class Bread implements Priceable{

    private int price;
    private double mass;
    private String type;

    public Bread(double mass, String type, int price){
        this.mass=mass;
        this.type=type;
        this.price=price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
