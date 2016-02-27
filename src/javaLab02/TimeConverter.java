/*
added new info...
*/

package javaLab02;

import javax.swing.*;

public class TimeConverter
{
  public static void main(String [] args)
  {
    String hours, minutes, seconds;
    int hrs, mins, secs, convertHours, convertMinutes, totalSeconds;

    // enter number of hours, minutes and seconds
    hours = JOptionPane.showInputDialog("Enter no of hours");
    minutes = JOptionPane.showInputDialog("Enter no of minutes");
    seconds = JOptionPane.showInputDialog("Enter no of seconds");

    // convert input Strings to ints
    hrs = Integer.parseInt(hours);
    mins = Integer.parseInt(minutes);
    secs = Integer.parseInt(seconds);

    // convert the entered data to seconds
    convertHours = hrs * 60 * 60;
    convertMinutes = mins * 60;

    // add up to obtain total no of seconds
    totalSeconds = convertHours + convertMinutes + secs;

    JOptionPane.showMessageDialog(null, "The total number of seconds is " + totalSeconds);

  }

}