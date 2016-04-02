package javaLab06.Solns06;

import javax.swing.*;

public class Measurement{
    private String unit;  // stores Measurement unit
    private double value;  // stores Measurement value

    public Measurement(double v, String u){
      unit = u;
      value = v;
    }

    public double getValue(){
      return value;
    }

    public String getUnit(){
      return unit;
    }

    public void setValue(double v){
      value = v;
    }

    public void setUnit(String u){
      unit = u;
    }

    public boolean hasSameUnit(Measurement m){
       return this.getUnit().equals(m.getUnit());
    }

    @Override
    public String toString(){
           return getValue() + " " + getUnit();
    }
} //end of Measurement
