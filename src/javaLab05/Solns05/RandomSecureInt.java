package javaLab05.Solns05;

/* modified: utilising the modern SecureRandom class and also changed to find
random (int) values between any two integers */

import java.security.SecureRandom;
import javax.swing.*;
import java.util.Arrays;
//import java.text.DecimalFormat; // added to format output

public class RandomSecureInt{
  public static void main(String[] args) {

    int n = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
    int[] data = new int[n];
    int[] datareversed, datasorted;
    int max,min;
//    DecimalFormat to5DP = new DecimalFormat("0.00000");
    SecureRandom randInts = new SecureRandom();
    
    
    for(int i=0; i<data.length; i++) {
          data[i] = 1 + randInts.nextInt(10);
    }

    /* reverse(), sort(), getMax(), getMin() are helper methods defined below */
    datareversed = reverse(data);
    datasorted = sort(data);
    max = getMax(data);
    min = getMin(data);

    System.out.println("n\tdata[n]\t\tdatareversed[n]\t\tdatasorted[n]");
    System.out.println("-\t-------\t\t---------------\t\t-------------");
    for(int i=0; i<n; i++) {
      System.out.println((i+1) + "\t" + data[i] + "\t\t"
          + datareversed[i] + "\t\t\t" + datasorted[i]);
    }

    System.out.println("\nmax = " + max + "   min = " + min);
  }// end of main

  /* helper method takes original array and returns an array
     of the same length but with elements in reverse order */
  private static int[] reverse(int[] original) {
    int size = original.length;
    int[] reversed = new int[size];
    for(int i=0; i<size; i++) {
      reversed[i]= original[size - i-1];
    }
    return reversed;
  }

  /* helper method takes original array and returns an array
     of the same length but with elements sorted into ascending order
     using the Arrays.sort() class method
     Note we have to copy the original array first and sort the copy */
  private static int[] sort(int[] original) {
    //int[] copy = Arrays.copyOfRange(original,0,original.length);
    int[] copy = original.clone();
    Arrays.sort(copy);
    return copy;
  }

  /* helper method takes original array and returns maximum value from elements */
  private static int getMax(int[] original) {
    int max = original[0];
    for(int i = 1; i < original.length; i++) {
      if(original[i] > max) max = original[i];
    }
    return max;
  }

   /* helper method takes original array and returns minimum value from elements */
   private static int getMin(int[] original) {
    int min  =original[0];
    for(int i = 1; i < original.length; i++) {
      if(original[i] < min) min = original[i];
    }
    return min;
  }
}// end of Random
