package com.santidev;

public class RoundHole {

    /*
    * RoundHoles are compatible with RoundPegs
    */

    private double radius;

    public RoundHole(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg){
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }

}
