/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab05;

import javax.swing.*;

/**
 *
 * @author 0303077
 */
public class Lab05_Part1_Q3A {
    public static void main(String[] args) {
    
    String output = "";
    int[] array1 = new int[5];

    for (int i = 0; i <= 4; i++) {
      String number = JOptionPane.showInputDialog("enter an integer");
      int num = Integer.parseInt(number);
      array1[i] = num;
    }
      
    for (int j = 0; j <= 4; j++) {
      output += array1[j] + " ";
    }
    JOptionPane.showMessageDialog(null, output);
  }  
}
