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
public class Triangle {
  public static void main (String [] args) {
    String output = "";
    String rows = JOptionPane.showInputDialog("Enter number of lines desired");
    int r = Integer.parseInt(rows);
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= i; j++) {
      output += "*";
      }
     output += "\n";
    }
    JOptionPane.showMessageDialog(null, output);
  }
}
