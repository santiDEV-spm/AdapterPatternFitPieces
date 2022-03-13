package com.santidev.Adapters;

import com.santidev.RoundPeg;
import com.santidev.SquarePeg;

public class SquaredPegAdapter extends RoundPeg {

    //Adapter allows fitting square pegs into round holes
    private SquarePeg peg;

    public SquaredPegAdapter(SquarePeg peg){
        this.peg = peg;
    }

    @Override
    public double getRadius(){
        double result;
        //Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }

}
