/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab04_AB;

import javax.swing.JOptionPane;

/**
 *
 * @author 0303077
 */
public class Ascii_D {
  public static void main(String[] args){
    String output = "";
    char c;
    for (int i = 1; i <= 26; i++) {
      for (int j = 1; j <= 10; j++) {
        // max_col * current_row + current_col
        c = (char) (10 * i + j);
        output += c + " ";
      }
      if (i == 13) {
        continue; 
      }
      output += "\n";
    }
    JOptionPane.showMessageDialog(null, output);
  }
}
