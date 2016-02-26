package javaLab02;

/**
 * A program that adds two numbers and displays the result
 * @author Ike
 * @version Feb 2016
 */
import java.util.Scanner;

public class Addition_B
{
    // main method that runs the application
    public static void main(String[] args)
    {
        // create Scanner variable to obtain user input
        Scanner input = new Scanner(System.in);

        int a; // first number to add
        int b; // second number to add
        int sum; // sum of the numbers

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