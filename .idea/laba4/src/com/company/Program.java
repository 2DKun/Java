package com.company;

public class Program implements Priceable{

    private int price;
    private String title;
    private String developer;

    public Program(String title, String developer, int price){
        this.title=title;
        this.developer=developer;
        this.price=price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}


