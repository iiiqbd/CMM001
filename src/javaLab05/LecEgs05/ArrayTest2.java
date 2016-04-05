/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab05.LecEgs05;
import java.util.Arrays;
import javax.swing.*;
import java.util.Scanner;

/**
 *
 * @author Uche
 */
public class ArrayTest2 {
  
  public static void main(String[] args) {
  
    String output = "";
    double[] data = new double[3];
    String input = JOptionPane.showInputDialog("enter data values spearated by spaces");
    // create Scanner object to acquire data from variable "input"
    Scanner text = new Scanner(input);
    // create counter to track number of data entered
    int numData = 0;
    
    /* 
    in fllg line, hasNextDouble() method remains true as long as there are doubles to be read
    nextDouble reads the next double
    numData++ selects the next index, and adds 1 for the next iteration
    */
    while (text.hasNextDouble()) {
      data[numData++] = text.nextDouble();
    }
    // for loop to check data has been acquired and print it
    for(int i = 0; i < numData; i++) {
      output += data[i] + ", ";
    }
    JOptionPane.showMessageDialog(null, "The numbers are:\n" + output
      + "\n" + data); // 'data' displays memory location of the 'data' array object
    /* Arrays.toString(data) displays "[data]" */
    JOptionPane.showMessageDialog(null, Arrays.toString(data));
  }
}
