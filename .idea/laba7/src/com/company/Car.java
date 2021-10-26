package com.company;

public class Car {
    private String marc;
    public Car(String m){
        marc=m;
    }

    public String getMarc() {
        return marc;
    }

    public void setMarc(String marc) {
        this.marc = marc;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marc='" + marc + '\'' +
                '}';
    }
}
