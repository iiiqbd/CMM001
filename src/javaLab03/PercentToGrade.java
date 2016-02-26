/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab03;

import javax.swing.JOptionPane;

/**
 *
 * @author Uche
 */
public class PercentToGrade {
  
    public static void main(String[] args) {
    // TODO code application logic here
    String number = JOptionPane.showInputDialog("Please enter the mark scored");
    int mark = Integer.parseInt(number);

    if (mark <= 100 && mark >= 70) {
      JOptionPane.showMessageDialog(null, + mark + " = Grade A");
    } else if (mark < 70 && mark >= 60) {
      JOptionPane.showMessageDialog(null, + mark + " = Grade B");
    } else if (mark < 60 && mark >= 50) {
      JOptionPane.showMessageDialog(null, + mark + " = Grade C");
    } else if (mark < 50 && mark >= 40) {
      JOptionPane.showMessageDialog(null, + mark + " = Grade D");
    } else if (mark < 40 && mark >= 35) {
      JOptionPane.showMessageDialog(null, + mark + " = Grade E");
    } else if (mark < 35 && mark >= 0){
      JOptionPane.showMessageDialog(null, + mark + " = Grade F");
    } else {
      JOptionPane.showMessageDialog(null, "Pls enter a valid score (0-100)");
    }
  }
  
}
