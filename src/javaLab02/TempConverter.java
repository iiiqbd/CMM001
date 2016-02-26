package javaLab02;

import javax.swing.*;

public class TempConverter
{
  public static void main(String [] args)
  {
    String celcius;
    double degC, degF;

    // enter number of degrees celcius
    celcius = JOptionPane.showInputDialog("Enter temperature in degrees Celcius");

    // convert input String to int
    degC = Double.parseDouble(celcius);

    // convert the temperature to Fahrenheit
    degF = 1.8 * degC + 32.0;

    JOptionPane.showMessageDialog(null, degC + " Celcius = " + degF + " Fahrenheit.");

  }

}