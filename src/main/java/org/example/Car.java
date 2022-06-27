package org.example;

public class Car {
//    id, year, model, colour, motorSize
    private String id, model, colour;
    private int year, motorSize;

    public Car (String id, String model, String colour, int year, int motorSize) {
        this.id = id;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.motorSize = motorSize;
    }

    public String drive(){
        return model + " with motorsize " + motorSize + " can drive now.";
    }

//      Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(int motorSize) {
        this.motorSize = motorSize;
    }
}
