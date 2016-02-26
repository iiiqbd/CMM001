/*
[DaysofWeek.java]
Write a Java program that will prompt the user to enter a number 
in the range 1 .. 7.
The program will output the full name of corresponding day of the week.
For example if the user enters 1 then the program will output "monday".
If the user enters 7 then the program will output “sunday" etc.
 */
package javaLab03;

import javax.swing.JOptionPane;

/**
 *
 * @author 0303077
 */
public class DaysofWeek {
  
  public static void main(String[] args) {
    // TODO code application logic here
    String number = JOptionPane.showInputDialog("Please enter a number (1-7)");
    
  }
}
