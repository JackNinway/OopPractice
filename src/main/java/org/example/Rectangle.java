package org.example;

public class Rectangle {

    private double height, with;

    public Rectangle(double height, double with) {
        this();
        this.height = height;
        this.with = with;
    }
    public Rectangle() {

    }
    public double getArea(){
        return  this.height * this.with;
    }
//  Getters & Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }
}
