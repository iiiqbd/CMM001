package javaLab02;

/**
 * A program that attempts to divide an integer by zero
 * @author Ike
 * @version Feb 2016
 */
public class DivByZero
{
    // main method that runs the application
    public static void main(String[] args)
    {
        // declare and intialise variables
        int a = 107;
        int b = 0;

        // perform division-by-zero operation and assign result
        int quotient = a / b;

        // display result
        System.out.println("Quotient: \t" + a + " / " + b + " = " + quotient);

        System.out.println();
    }
}

/*
The expected result was as follows
Exception in thread "main" java.lang.ArithmeticException: / by zero
at DivByZero.main(DivByZero.java:16)
*/