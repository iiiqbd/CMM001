package javaLab02;

/**
 * A program that adds two numbers and displays the result
 * @author Ike
 * @version Feb 2016
 */
import javax.swing.*;

public class Addition_A
{
    // main method that runs the application
    public static void main(String[] args)
    {
        // declare and intialise variables
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st no: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd no: "));

        // perform addition operation and assign result
        int sum = a + b;

        // display result
        JOptionPane.showMessageDialog(null, a + " + " + b + " = " + sum);
        System.out.println();
    }
}