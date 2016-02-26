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
public class PosNegZero {
  
  public static void main(String[] args) {
    // TODO code application logic here
    String number = JOptionPane.showInputDialog("Please enter a number: ");
    int num = Integer.parseInt(number);
    if(num > 0)
    {
      JOptionPane.showMessageDialog(null, num + " is positive");
    }
    else if (num < 0)
    {
      JOptionPane.showMessageDialog(null, num + " is negative");
    }
    else
    {
      JOptionPane.showMessageDialog(null, num + " is zero!");
    }
  }
}
