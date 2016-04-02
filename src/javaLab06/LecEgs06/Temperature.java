/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab06.LecEgs06;

/**
 *
 * @author Uche
 */
public class Temperature {
  
  /* class-level data here as there are no object-level
    properties for this class */
  public static final double FREEZING_POINT_C = 0.0;
  public static final double BOILING_POINT_C = 100.0;
  public static final double FREEZING_POINT_F = 32.0;
  public static final double BOILING_POINT_F = 212.0;
  public static final double ABSOLUTE_ZERO_C = 273.15; //??
  
  /* methods here: class-level, static methods that accept
     one input and convert it into a different temperature scale */
  public static double cToF(double celcius) {
    return (1.8*celcius + 32.0);
  }
  
  public static double fToC(double farenheight) {
    return ((farenheight - 32.0) / 1.8);
  }

  public static double cToK(double celcius) {
    return (celcius - ABSOLUTE_ZERO_C);
  }

  public static double kToC(double kelvin) {
    return (kelvin + ABSOLUTE_ZERO_C);
  }
  
} // end of Temperature class