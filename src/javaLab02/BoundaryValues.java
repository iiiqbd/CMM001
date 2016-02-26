package javaLab02;

import javax.swing.*;

public class BoundaryValues
{
  public static void main(String [] args)
  {
    int a = Integer.MAX_VALUE;
    int b = Integer.MIN_VALUE;

    /* Extending the above to display the largest and smallest
    possible double values in java */
    double c = Double.MAX_VALUE;
    double d = Double.MIN_VALUE;

    JOptionPane.showMessageDialog(null,
        "INTEGER ARITHMETIC:\n"
      + "Largest integer value: " + a
      + "\nSmallest integer value: " + b
      + "\n\nDEMONSTRATING INTEGER OVERFLOW IN JAVA"
      + "\nLargest integer value + 1: " + (a + 1)
      + "\nSmallest integer value - 1: " + (b - 1)
      + "\n\nDOUBLE ARITHMETIC:"
      + "\nLargest double value: " + c
      + "\nSmallest double value: " + d
      + "\n\nDEMONSTRATING DOUBLE OVERFLOW IN JAVA"
      + "\nLargest double value + 1: " + (c + 1)
      + "\nSmallest double value - 1: " + (d - 1));

    // also, succintly
    System.out.println("Largest byte =\t\t" + Byte.MAX_VALUE);
    System.out.println("Smallest byte =\t\t" + Byte.MIN_VALUE);

    System.out.println("Largest short =\t\t" + Short.MAX_VALUE);
    System.out.println("Smallest short =\t" + Short.MIN_VALUE);

    System.out.println("Largest integer =\t" + Integer.MAX_VALUE);
    System.out.println("Smallest integer =\t" + Integer.MIN_VALUE);

    System.out.println("Largest long =\t\t" + Long.MAX_VALUE);
    System.out.println("Smallest long =\t\t" + Long.MIN_VALUE);

    System.out.println("Largest float =\t\t" + Float.MAX_VALUE);
    System.out.println("Smallest float =\t" + Float.MIN_VALUE);

    System.out.println("Largest double =\t" + Double.MAX_VALUE);
    System.out.println("Smallest double =\t" + Double.MIN_VALUE);
    System.out.println();

  }

}