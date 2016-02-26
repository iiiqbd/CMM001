package javaLab02;

import javax.swing.*;

public class Circle
{
  public static void main(String [] args)
  {
    String radius;
    double R, area, circum;

    // enter the radius of the circle
    radius = JOptionPane.showInputDialog("Enter the radius of the circle");

    // convert input String to int
    R = Double.parseDouble(radius);

    // calculate area and circumference
    area = Math.PI * R * R;
    circum = Math.PI * 2 * R;

    JOptionPane.showMessageDialog(null, "Circle of radius "
      + R + " has area:\n" + area + "\nand" +
      "\nCircumference:\n" + circum);

  }

}