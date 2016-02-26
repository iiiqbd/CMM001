package javaLab04_A;

/*
Source
http://www.tutorialspoint.com/java/lang/integer_tobinarystring.htm

*/

// import java.lang.*;

import javax.swing.*;

public class IntegerToBinaryDemo {

   public static void main(String[] args) {

   String num = JOptionPane.showInputDialog("Enter number to convert");
   int i = Integer.parseInt(num);

   System.out.println("Number = " + i);

   /* returns the string representation of the unsigned integer value
   represented by the argument in binary (base 2) */
   System.out.println("Binary is " + Integer.toBinaryString(i));

   // returns the number of one-bits
   System.out.println("Number of one bits = " + Integer.bitCount(i));
   System.out.println();
   }
}