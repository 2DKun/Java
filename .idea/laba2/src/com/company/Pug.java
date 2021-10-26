package com.company;

public class Pug extends Dog{

    private String breed;

    public Pug(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name da dogo: "+super.getName()+"\t Dodo age: "+super.getAge()+"\t Dogo breed: "+breed);
    }
}
