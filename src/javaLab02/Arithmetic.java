package javaLab02;

/**
 * A program that performs some arithmetic operations on two variables
 * @author Ike
 * @version Feb 2016
 */
public class Arithmetic
{
    // main method that runs the application
    public static void main(String[] args)
    {
        // declare and intialise variables
        int a = 107;
        int b = 5;

        // perform arithmetic operations and assign results
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int rem = a % b;

        // display results
        System.out.println("Sum: \t\t" + a + " + " + b + " = " + sum);
        System.out.println("Difference: \t" + a + " - " + b + " = " + diff);
        System.out.println("Product: \t" + a + " x " + b + " = " + product);
        System.out.println("Quotient: \t" + a + " / " + b + " = " + quotient);
        System.out.println("Remainder: \t" + a + " % " + b + " = " + rem);
        System.out.println();
    }
}