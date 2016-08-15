/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab01.LecEgs01;

/**
 *
 * @author Uche
 */
import javax.swing.JOptionPane;
public class NameOfClass {
  public static void main(String[] args) {
    // comments are ignored by compiler
    int n;
    String str = "some text";
    n = getInput("Enter a number");
    for(int i = 1; i <= n; i++) {
      System.out.println(str);
    }
  }
  public static int getInput(String message) {
    String input =
      JOptionPane.showInputDialog(message);
    int value = Integer.parseInt(input);
    return value;
  }
}
