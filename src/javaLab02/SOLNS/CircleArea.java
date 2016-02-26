package javaLab02.SOLNS;

/*
 * Program to convert user input r into corresponding
 * area of a circle using formula area=pi*r*r
 */

import javax.swing.*;

public class CircleArea
{
  public static void main(String[] args)
  {
    String userInput;
    double r, area;

    userInput = JOptionPane.showInputDialog(
                "Enter the radius of your circle:");

    r = Double.parseDouble(userInput);

    area = Math.PI*r*r;

    JOptionPane.showMessageDialog(null,
                "Circle of radius " + r +  " has area " + area);

    // note that output is not automatically rounded

  }

}
