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
public class LargestSmallestTotalAverage {
  public static void main (String [] args) {
    int num = 0, total = 0, count;
    double average = 0;
    
    for (count = 1; count <= 5; count++) {
      String number = JOptionPane.showInputDialog("enter no.");
      num = Integer.parseInt(number);
      total += num;
      average = total / count;
    }
    JOptionPane.showMessageDialog(null, "Total = " + total
      + "\nAverage = " + average);
  }
}
