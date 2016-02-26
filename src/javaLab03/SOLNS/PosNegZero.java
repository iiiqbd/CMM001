package javaLab03.SOLNS;

/*
 * PosNegZero.java
 * inputs single integer and identifies if positive, negative or zero
 */

// load swing package to use JOptionPane methods
import javax.swing.*;

public class PosNegZero{
  public static void main(String[] args){
    // declare variables
    String strNumber;
    int number;

    // get user input and parse input String for integer value
    strNumber = JOptionPane.showInputDialog(null,"enter an integer number ");
    number = Integer.parseInt(strNumber);

    // Nested if else statements used to select between three possibilities
    if(number>0){
      JOptionPane.showMessageDialog(null,number + " is positive");
    }
    else if(number<0){
      JOptionPane.showMessageDialog(null,number + " is negative");
    }
    else{
      JOptionPane.showMessageDialog(null,number + " is zero");
    }

/*  Alternatively three seperate if statements could be used

    if(number>0){
       JOptionPane.showMessageDialog(null,number + " is positive");
    }
    if(number<0){
       JOptionPane.showMessageDialog(null,number + " is negative");
    }
    if(number == 0){
          JOptionPane.showMessageDialog(null,number + " is zero");
    }
*/

  } // end main
}  //end PosNegZero
