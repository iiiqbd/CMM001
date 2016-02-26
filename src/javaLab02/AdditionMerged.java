package javaLab02;

/**
 * A program that adds two numbers and displays the result
 * @author Ike
 * @version Feb 2016
 */
import javax.swing.*;
import java.util.*;

public class AdditionMerged
{
    // main method that runs the application
    public static void main(String[] args)
    {
        // part (a - using JOptionPane object to acquire user input
        // declare and intialise variables
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st no: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd no: "));

        // perform addition operation and assign result
        int sum = a + b;

        // display result
        JOptionPane.showMessageDialog(null, a + " + " + b + " = " + sum);

        // part (b - using scanner object to acquire user input)
        // create Scanner variable to obtain user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st no: "); // user prompt
        a = input.nextInt(); // reads first number from user

        System.out.print("Enter 2nd no: "); // user prompt
        b = input.nextInt(); // reads second number from user

        // perform division operation and assign result
        sum = a + b;

        // display result
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println();
    }
}