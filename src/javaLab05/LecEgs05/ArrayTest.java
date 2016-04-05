/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab05.LecEgs05;
import javax.swing.*;

/**
 *
 * @author Uche
 */
public class ArrayTest {
  
  public static void main(String[] args) {
  
  String output = "";
  String[] names = new String[3];
  // for loop to assign names to array elements
  for(int i = 0; i < names.length; i++) {
    /* (i + 1) is used to normalise index when it is displayed to screen: i.e.,
      instead of displaying 0-2, we'll display 1-3 */
    names[i] = JOptionPane.showInputDialog("Enter the name: " + (i + 1));
  }
  // loop to display the names
    for(int i = 0; i < names.length; i++) {
      output += names[i] + "\n";
  }
  JOptionPane.showMessageDialog(null, "The names are:\n" + output);
    
  }
}
