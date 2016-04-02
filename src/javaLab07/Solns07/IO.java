package javaLab07.Solns07;

// Class of static methods for user input
import javax.swing.*;

public class IO
{
  // no Instance variables

  // no constructor


  // Class method to display message and get user input and convert to String
  public static int getInteger(String message)
  {
    String input = JOptionPane.showInputDialog(message) ;
    try{ return Integer.parseInt(input);  }
    catch (NumberFormatException err) { return 0;}
  }

  // Class method to display message and get user input and convert to String
  public static double getDouble(String message)
  {
    String input = JOptionPane.showInputDialog(message) ;
    try{ return Double.parseDouble(input);  }
    catch (NumberFormatException err) { return 0;}
  }

  // Class method to display message and get user input and convert to String
  public static char getChar(String message)
  {
    String input = JOptionPane.showInputDialog(message) ;
    return input.charAt(0);
  }

  // Class method to display message and get user input and convert to String
  public static String getString(String message)
  {
    String input = JOptionPane.showInputDialog(message) ;
    return input;
  }

  // Class method to display message and get user input and convert to String
  public static void show(String message)
  {
    JOptionPane.showMessageDialog(null, message) ;
  }
}