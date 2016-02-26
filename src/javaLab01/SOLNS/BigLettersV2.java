package javaLab01.SOLNS;

/**
 * A simple program to display Large letters
 * @author David
 * @version Oct 2015
 */
public class BigLettersV2
{
    // main method - starting point for all Java applications
    public static void main(String[] args)
    {

      // Illustrates use of "helper" methods to perform action
      printA();
      printB();
    }

    // Method that prints a Large A to the console
    static void printA(){
      System.out.println("  **  ");
      System.out.println(" *  * ");
      System.out.println("******");
      System.out.println("*    *");
      System.out.println("*    *");
    }

    // Method that prints a Large B to the console
    static void printB(){
      System.out.println("***** ");
      System.out.println("*    *");
      System.out.println("***** ");
      System.out.println("*    *");
      System.out.println("***** ");
    }
}
