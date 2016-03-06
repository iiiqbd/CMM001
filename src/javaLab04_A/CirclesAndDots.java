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
public class CirclesAndDots {
  
  public static void main (String [] args) {
    
    // declare and initialise string to store output
    String output = "";
    // print 5 rows
    for (int i = 1; i <= 5; i++) {
      
      // print 'i' circles per row
      for (int j = 0; j < i; j++) {
        output += "o ";
      }
      // print 5-i dots per row
     for (int k = 0; k < 5-i; k++) {
        output += ".  ";
      }
     // print a new line
     output += "\n";
    }
    // display the output
    JOptionPane.showMessageDialog(null, output);
  }
}

