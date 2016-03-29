package javaLab01.Solns01;

/**
 * A simple program to draw a pictogram using several
 * characters that require an escape sequence
 * @author David
 * @version Oct 2015
 */
public class TextCat
{
    // main method - starting point for all Java applications
    public static void main(String[] args)
    {
      // since \ is the "escape character, to print a \ requires \\
      // since " ends a String, to print a " requires \"
      System.out.println("/\\_ _/\\");
      System.out.println("(\"o_o\")");
      System.out.println(" ( ^ )");
    }
}
