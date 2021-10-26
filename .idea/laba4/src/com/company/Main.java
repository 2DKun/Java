package com.company;

public class Main {

    public static void main(String[] args) {
	Program IDEA = new Program("intellij idea","jetbrains",0);
    Car Toyota = new Car("Toyota","Trueno", 600000);
    Bread Bread = new Bread(150.0,"Black", 70);
    System.out.println("Price: "+IDEA.getPrice());
    System.out.println("Price: "+Toyota.getPrice());
    System.out.println("Price: "+Bread.getPrice());

    }
}
