/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab04_AB;

import javax.swing.JOptionPane;

/**
 *
 * @author 0303077
 */
public class TriangleFlipped {
  public static void main (String [] args) {
    String output = "";
    String rows = JOptionPane.showInputDialog("Enter number of lines desired");
    int r = Integer.parseInt(rows);
    for (int i = r; i >= 1; i--) {
      for (int j = i; j >= 1; j--) {
      output += "*";
      }
     output += "\n";
    }
    JOptionPane.showMessageDialog(null, output);
  }
}


