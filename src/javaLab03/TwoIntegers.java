/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab03;

import javax.swing.JOptionPane;

/**
 *
 * @author Uche
 */
public class TwoIntegers {
  public static void main(String[] args) {
    // acquire two nos from user. assume zero is positive
    String number1 = JOptionPane.showInputDialog("Please enter number 1:");
    int num1 = Integer.parseInt(number1);
    
    String number2 = JOptionPane.showInputDialog("Please enter number 2:");
    int num2 = Integer.parseInt(number2);
    
    if (num1 >= 0 && num2 >= 0)
    {
      JOptionPane.showMessageDialog(null, "both numbers are positive");
    }
    if (num1 < 0 && num2 < 0)
    {
      JOptionPane.showMessageDialog(null, "both numbers are negative"
        + "\nnum1 = " + num1
        + "\nnum2 = " + num2);
    }
    if (num1 < 0 && num2 >= 0)
    {
      JOptionPane.showMessageDialog(null, "both numbers are of opposite signs!"
        + "\nnum1 = " + num1
        + "\nnum2 = " + num2);
    }
    if (num1 >= 0 && num2 < 0)
    {
      JOptionPane.showMessageDialog(null, "both numbers are of opposite signs!"
        + "\nnum1 = " + num1
        + "\nnum2 = " + num2);
    }
  }
}
