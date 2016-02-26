/*
This program prompts the user to enter any integer value n.
It then displays the n times multiplication table for all numbers 1 up to 12.
For example, if the user enters a value 6 for n, the program prints:
1 x 6 = 6
2 x 6 = 12
...
12 x 6 = 72
 */
package javaLab04_A;

import javax.swing.JOptionPane;

/**
 *
 * @author Uche
 */
public class TimesTable {
  public static void main(String[] args){
    String output = "";
    String myNum = JOptionPane.showInputDialog("Please enter any integer");
    int num = Integer.parseInt(myNum);
    // for loop to generate "n" times table
    for (int i = 1; i <= 12; i++) {
      output += i + " x " + num + " = " + i * num + "\n";
    }
    JOptionPane.showMessageDialog(null, output);
    
  }
  
}
