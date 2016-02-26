package javaLab02.SOLNS;

/*
 * HoursMinutesSeconds.java
 *
 *Calculates totalNumberofSeconds in time hours:minutes:seconds
 */

import javax.swing.*; // import swing package to use JOptionPane methods

public class HoursMinutesSeconds {


    public static void main(String[] args) {
        String strHours, strMinutes, strSeconds;
        int hours, minutes, seconds;
  int totalSeconds =0;
  // input hours as a String
  strHours = JOptionPane.showInputDialog(null,
                "How many Hours are there");

  // input minutes as a String
  strMinutes = JOptionPane.showInputDialog(null,
                "How many Minutes are there");

  // input seconds as a String
  strSeconds = JOptionPane.showInputDialog(null,
                "How many Seconds are there");

  // convert Strings to integers
        hours = Integer.parseInt(strHours);
        minutes = Integer.parseInt(strMinutes);
        seconds = Integer.parseInt(strSeconds);
        //calculate total number  of seconds
  totalSeconds = hours*60*60 + minutes*60 + seconds;

        // display answer
  JOptionPane.showMessageDialog(null,
                hours + " hr, " + minutes + " min and " +seconds +" sec" +
                "\n" +
                "equals " + totalSeconds+ " seconds");
    }

}
