/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab05;

import javax.swing.JOptionPane;

/**
 *
 * @author 0303077
 */
public class Lab05_Part1_Q4 {
    
    public static void main(String[] args) {
    
      String numOutput = "", sumOutput = "";
      int totalNum = 0, totalSq = 0;
      String number = JOptionPane.showInputDialog("enter an integer");
      int n = Integer.parseInt(number);
      int[] num = new int [n];
      int[] numsq = new int [n];      
    for (int i = 1; i <= n; i++) {
        num[i-1] = i;
        numsq[i-1] = i*i;
    }
    for (int j = 1; j <= n; j++) {
//        num[j] += j;
        totalNum += num[j-1];
//        numsq[j] += j*j;
        totalSq += numsq[j-1];
    }    

    JOptionPane.showMessageDialog(null, "Numbers total = " + totalNum
        + "\nSquares total = " + totalSq);
  }  
  
}
