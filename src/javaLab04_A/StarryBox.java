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
public class StarryBox {
  public static void main (String [] args) {
    String output = "";
    String ex = JOptionPane.showInputDialog("Enter number of stars");
    int x = Integer.parseInt(ex);
    for (int i = 1; i <= x; i++) {
      output += "*";
    }
    JOptionPane.showMessageDialog(null, output);
  }
}
