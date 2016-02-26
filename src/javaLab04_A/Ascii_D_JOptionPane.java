package javaLab04_A;

import javax.swing.JOptionPane;


/**
 *
 * @author 0303077
 */
public class Ascii_D_JOptionPane {
  public static void main(String[] args){
    String output = "";
    char c;
    for (int i = 1; i <= 255; i++) { 
      c = (char) i;
      if (i == 13) {
        continue; 
      }
      output += i + " = " + c + "\n";
    }
    JOptionPane.showMessageDialog(null, output);
  }
}