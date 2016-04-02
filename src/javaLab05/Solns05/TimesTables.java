package javaLab05.Solns05;

import javax.swing.*;
public class TimesTables{
  public static void main(String[] args) {

    int[][] times = new int[13][13];

    for(int i=0; i<=12; i++) {
      for(int j=0; j<=12; j++) {
        times[i][j] = i*j;
      }
    }

    for(int i=0; i<=12; i++) {
      for(int j=0; j<=12; j++) {
        System.out.print(i + "x" + j + "=" + times[i][j] + "  ");
      }
      System.out.println();
    }
  }
}
