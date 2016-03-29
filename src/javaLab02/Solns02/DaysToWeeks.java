package javaLab02.Solns02;

/*
 * DaysToWeeks.java
 *
 * Converts totalDays to numberOfWeeks and numberOfDays
 * by integer division and remainder calculations using 7
 */

// import swing package to use JOptionPane method
import javax.swing.*;

public class DaysToWeeks {
  public static void main(String[] args) {
      String strTotalDays;
      int numberOfDays, numberOfWeeks, totalDays;

      strTotalDays = JOptionPane.showInputDialog(null,
                  "How many days are there");

      totalDays = Integer.parseInt(strTotalDays);

      numberOfWeeks = totalDays / 7;
      numberOfDays = totalDays % 7;

      JOptionPane.showMessageDialog(null,
                  totalDays + "days equals " +
                  numberOfWeeks + " weeks and " + numberOfDays + " days");
    }
}
