package com.company;


public class Rectangle{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
    }

    double computeArea(){
        return this.height * this.width;
    }

}