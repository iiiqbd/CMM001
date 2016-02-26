package javaLab02;

/**
 * A program that converts days to weeks and days
 * @author Ike
 * @version Feb 2016
 */
import javax.swing.*;

public class WeeksDays
{
    // main method that runs the application
    public static void main(String[] args)
    {
        // create Scanner variable to obtain user input
        String days = JOptionPane.showInputDialog("Enter no. of days"); // number of days
        int numDays = Integer.parseInt(days);
        int noOfWeeks; // number of weeks
        int noOfDays; // number of days left

        noOfWeeks = numDays / 7;
        noOfDays = numDays % 7;

        System.out.println(numDays + " days equals " + noOfWeeks +
            " weeks and " + noOfDays + " days");
        System.out.println();
    }
}