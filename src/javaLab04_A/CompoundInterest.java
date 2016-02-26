/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab04_A;

import javax.swing.JOptionPane;
/**
 *
 * @author Uche
 */
public class CompoundInterest {
  public static void main (String [] args) {
    String output = "";
    String rate = JOptionPane.showInputDialog(null, "Enter the rate");
    double r = Double.parseDouble(rate);
    String principal = JOptionPane.showInputDialog(null, "Enter the principal");
    double p = Double.parseDouble(principal);
    
    for (int i = 1; i <= 25; i++) {
      p = p * (1 + 0.01 * r);
      output += "For year " + i + ", principal = £" + p + "\n";
    }
    JOptionPane.showMessageDialog(null, output);
  }
}
