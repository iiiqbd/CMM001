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
public class LargestSmallestTotalAverage_B {
  public static void main (String [] args) {
    int num, count, max, min;
    
    min = Integer.MAX_VALUE;
    max = Integer.MIN_VALUE;
    
    for (count = 1; count <= 5; count++) {
      String number = JOptionPane.showInputDialog("Enter no.");
      num = Integer.parseInt(number);
      if (num > max ) {
        max = num;
      }
      if (num < min) {
        min =num;        
      }
    }
    JOptionPane.showMessageDialog(null, "Largest value = " + max
      + "\nSmallest value = " + min);
  }
}
