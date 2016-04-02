package javaLab05.Solns05;

import javax.swing.*;
public class Squares{
  public static void main(String[] args) {

    int n = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
    int[] num = new int[n];
    int[] numsq = new int[n];
    int sum_n=0, sum_nsq=0;

    for(int i=0; i<n; i++) {
      num[i] = i+1;
      numsq[i] = num[i]*num[i];
      System.out.println("n = " + num[i] + "   n^2 = " + numsq[i]);
    }

    for(int i=0; i<n; i++) {
      sum_n += num[i];
      sum_nsq += numsq[i];
    }
    System.out.println("\n\nsum of n = 1 to " + n + " = " + sum_n);
    System.out.println("sum of n^2 = 1^2 to " + n + "^2 = " + sum_nsq);
  }
}
