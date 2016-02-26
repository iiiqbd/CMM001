package javaLab01.SOLNS;

/**
 * A simple program to display 'Hello World' surrounded by stars
 * @author David
 * @version Oct 2015
 */
public class StarryHelloWorld
{
    // main method - starting point for all Java applications
    public static void main(String[] args)
    {
        // For multi-line output you have several choices

        // A println() statement for every line
        System.out.println("*******************");
        System.out.println("*** Hello world ***");
        System.out.println("*******************");

        /* Or a print() statement for each line
           using \n to generate a linebreak inside a String */
        System.out.print("*******************\n");
        System.out.print("*** Hello world ***\n");
        System.out.print("*******************\n");

        /* Or concatonate Strings inside a single println()
           remember to close the String and use a + at the end of each line
           because actual line-breaks are not permitted  in a String,
           only line-break instructions \n are allowed */
        System.out.println("*******************\n" +
                           "*** Hello world ***\n" +
                           "*******************\n");
    }
}

