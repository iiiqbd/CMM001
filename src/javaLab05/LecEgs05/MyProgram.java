/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab05.LecEgs05;

import javax.swing.*;
/**
 *
 * @author 0303077
 */

public class MyProgram {
public static void main (String[] args) {
  int n = getNum("Enter a number");
  showNum(n);
  }
  private static int getNum (String message) {
    String usrStr = JOptionPane.showInputDialog(message);
    return Integer.parseInt(usrStr);
  }
  private static void showNum (int num) {
    JOptionPane.showMessageDialog(null, "number is " + num);
  }
} // to use a method within it's own class just use it's name()
