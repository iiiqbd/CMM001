package javaLab03.SOLNS;

/*
 * leapYear.java
 * States whether user input year is a Leap year or not
 * Uses rule that leap years are divisible by 4, but not by 100,
 * unless they are divisible by 400.
 * DPL (Feb 2015)
 */

import javax.swing.*;

public class LeapYear {
    public static void main(String[] args) {

        String strYear;
        int year;

        strYear = JOptionPane.showInputDialog(
                "Please enter a year (in the form 2013)");
        year = Integer.parseInt(strYear);

        /* basic rule: leap year if divisible by 4 and not divisible by 100 */
        if((year%4 == 0) && (year%100 != 0)) {
            JOptionPane.showMessageDialog(null,
                "Year " + year + " is a leap year using basic rule");
        }
        else {
            JOptionPane.showMessageDialog(null,
                "Quick rule says Year " + year + " is not a leap year using basic rule");
        }

        /* (year%4 == 0) && (year%100 != 0) applies quick rule
        *  "divisible by 4 but not divisible by 100
        *  then (year%400 ==0) provides the "otherwise" unless
        *  divisible by 400 */

        if(((year%4 == 0) && (year%100 != 0)) || (year%400 ==0)) {
            JOptionPane.showMessageDialog(null,
                "Year " + year + " is a leap year using full rule");
        }
        else {
            JOptionPane.showMessageDialog(null,
                "Year " + year + " is not a leap year using full rule");
        }
    } //end main
} //end leapYear
