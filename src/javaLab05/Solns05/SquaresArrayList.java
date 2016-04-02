package javaLab05.Solns05;

import javax.swing.*;
import java.util.ArrayList;

public class SquaresArrayList{
  public static void main(String[] args) {

    int n = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
    ArrayList<Integer> num = new ArrayList<Integer>();
    ArrayList<Integer> numsq = new ArrayList<Integer>();
    int sum_n=0, sum_nsq=0;

    for(int i=0; i<n; i++) {
      num.add(i+1);
      numsq.add(num.get(i)*num.get(i));
      System.out.println("n = " + num.get(i) + "   n^2 = " + numsq.get(i));
    }

    for(int i=0; i<num.size(); i++) {
      sum_n += num.get(i);
      sum_nsq += numsq.get(i);
    }
    System.out.println("\n\nsum of n = 1 to " + n + " = " + sum_n);
    System.out.println("sum of n^2 = 1^2 to " + n + "^2 = " + sum_nsq);
  }
}
