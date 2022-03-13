package com.santidev;

public class SquarePeg {

    //SquarePegs are not compatible with RoundHoles

    private double width;

    public SquarePeg(double width){
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    public double getSquare(){
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }

}
