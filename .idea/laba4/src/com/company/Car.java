package com.company;

public class Car implements Priceable{

    private int price;
    private String brand;
    private String type;

    public Car(String brand, String type, int price){
        this.brand=brand;
        this.type=type;
        this.price=price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
