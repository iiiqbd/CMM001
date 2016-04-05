package javaLab05.Solns05;

import javax.swing.*;
import java.util.Arrays;
import java.text.DecimalFormat; // added to format output

public class Random{
  public static void main(String[] args) {

    int n = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
    double[] data = new double[n];
    double[] datareversed, datasorted;
    double max,min;
    DecimalFormat to5DP = new DecimalFormat("0.00000");
    
    for(int i=0; i<data.length; i++) {
          data[i] = 10 + Math.random();
    }

    /* reverse(), sort(), getMax(), getMin() are helper methods defined below */
    datareversed = reverse(data);
    datasorted = sort(data);
    max = getMax(data);
    min = getMin(data);

    System.out.println("n\tdata[n]\t\tdatareversed[n]\t\tdatasorted[n]");
    System.out.println("-\t-------\t\t---------------\t\t-------------");
    for(int i=0; i<n; i++) {
      System.out.println((i+1) + "\t" + to5DP.format(data[i]) + "\t\t"
          + to5DP.format(datareversed[i]) + "\t\t\t" + to5DP.format(datasorted[i]));
    }

    System.out.println("\nmax = " + to5DP.format(max) + "   min = " + to5DP.format(min));
  }// end of main

  /* helper method takes original array and returns an array
     of the same length but with elements in reverse order */
  private static double[] reverse(double[] original) {
    int size = original.length;
    double[] reversed = new double[size];
    for(int i=0; i<size; i++) {
      reversed[i]= original[size - i-1];
    }
    return reversed;
  }

  /* helper method takes original array and returns an array
     of the same length but with elements sorted into ascending order
     using the Arrays.sort() class method
     Note we have to copy the original array first and sort the copy */
  private static double[] sort(double[] original) {
    //double[] copy = Arrays.copyOfRange(original,0,original.length);
    double[] copy = original.clone();
    Arrays.sort(copy);
    return copy;
  }

  /* helper method takes original array and returns maximum value from elements */
  private static double getMax(double[] original) {
    double max = original[0];
    for(int i = 1; i < original.length; i++) {
      if(original[i] > max) max = original[i];
    }
    return max;
  }

   /* helper method takes original array and returns minimum value from elements */
   private static double getMin(double[] original) {
    double min  =original[0];
    for(int i = 1; i < original.length; i++) {
      if(original[i] < min) min = original[i];
    }
    return min;
  }
}// end of Random
