package org.example;

public class Car {
    private String id, model, colour;
    private int year, motorSize;

    public Car (String id, String model, String colour, int year, int motorSize) {
        this.id = id;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.motorSize = motorSize;
    }
    public void drive(){
        System.out.println(model + " with motorsize " + motorSize + " can drive now.");
    }
}
