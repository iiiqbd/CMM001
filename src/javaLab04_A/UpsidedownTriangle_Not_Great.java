/*
UpsidedownTriangle  
Design and implement a program to meet the following requirements:
Using a for-statement inside another for-statement to control repetition,
the program should:
- prompt the user to enter a positive integer value
- input this to local variable x
- The program should display a "symmetric shape" of asterisks x high
and 2y wide as shown in the diagram to the right.
 */
package javaLab04_A;

import javax.swing.JOptionPane;

/**
 *
 * @author Uche
 */

public class UpsidedownTriangle_Not_Great {
  public static void main (String [] args) {
    String output = "";
    String yourRows = JOptionPane.showInputDialog("Enter number of rows desired");
    int rows = Integer.parseInt(yourRows);
      
    for (int i = 0; i < rows; i++) { // compre with perfect pattern
      for (int spaces = 0; spaces < 2 * i; spaces++) { // compre with perfect pattern
        output += " "; 
      }
      for (int stars = rows; stars < 2 * (rows - i); stars++) { // compre with perfect pattern
        output += "*";
      }
     output += "\n";
    }
    JOptionPane.showMessageDialog(null, output);
  }
}
