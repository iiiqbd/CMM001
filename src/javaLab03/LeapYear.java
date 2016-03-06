/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
a) "a Leap Year is divisible by 4 but not divisible by 100"
   given year as an "int":
   (year % 4 == 0) && (year % 100 != 0)

b) "a Leap Year is divisible by 4, but not divisible
    by 100 unless it is divisible by 400"
    given year as an "int":
    ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)
*/ 

package javaLab03;
import javax.swing.JOptionPane;

/**
 *
 * @author 0303077
 */
public class LeapYear {
     public static void main(String[] args) {
    // TODO code application logic here
    String anyYear = JOptionPane.showInputDialog(null, "Enter a year");
    int year = Integer.parseInt(anyYear);
    
      //  CODE FRAGMENT BELOW FAILS TO RECOGNIZE 2000 AS A LEAP YEAR
//    if ((year % 4 == 0) && (year % 100 != 0)) {
//      JOptionPane.showMessageDialog(null, "Year " + year + " is a Leap Year");
//    }
//    else {
//      JOptionPane.showMessageDialog(null, "Year " + year + " is not a Leap Year");
//    }
    
    
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
      JOptionPane.showMessageDialog(null, "Year " + year + " is a Leap Year");
    }
    else {
      JOptionPane.showMessageDialog(null, "Year " + year + " is not a Leap Year");
    }
  }
 
}
