/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab04_AB;

import javax.swing.JOptionPane;

/**
 *
 * @author Uche
 */
public class StarryBox_B {
  public static void main (String [] args) {
    String output = "";
    String ex = JOptionPane.showInputDialog("Enter number of stars");
    int x = Integer.parseInt(ex);
    String Y = JOptionPane.showInputDialog("Enter number of rows");
    int y = Integer.parseInt(Y);    
    for (int row = 1; row <= y; row++) {
      for (int col = 1; col <= x; col++) {
        output += "*";
      }
      output += "\n";
    }
    JOptionPane.showMessageDialog(null, output);
  }
}
