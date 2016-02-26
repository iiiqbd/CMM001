package javaLab02.SOLNS;

/*
 * Program to convert user input Celsius temperature
 * to Fahrenheit equivalent using F=1.8*C+32
 */


import javax.swing.*;

public class CtoF
{
  public static void main(String[] args)
  {
    String userInput;
    double celsius, fahrenheit;

    userInput = JOptionPane.showInputDialog(
                "Enter a temperature in Celsius:");

    celsius = Double.parseDouble(userInput);

    fahrenheit = 1.8 * celsius + 32.0;


    JOptionPane.showMessageDialog(null,
                celsius + " degrees on Celsius scale equals " +
                fahrenheit + " degrees on Fahrenheit scale " );
    }

}
