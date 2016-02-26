package javaLab03;

import javax.swing.JOptionPane;

/*
 [DaysInMonth.java]
Write a Java program that will prompt the user to enter a number in the range 1 .. 12
representing a month of the year.
The program will output the number of days in the corresponding month.
Ignore leap years i.e. assume that month 2 (i.e. February) always has 28 days.
Once it works, try and improve your program by adding extra code inside the “february”
case (e.g. add a user prompt to ask the user if it is a leap year, and an if-else statement to
handle the two possible cases to give the appropriate output).
 */

/**
 *
 * @author 0303077
 */
public class DaysInMonth {

  public static void main(String[] args) {
    // TODO code application logic here
    String number1 = JOptionPane.showInputDialog("Please enter a number (1-12)");
    int number = Integer.parseInt(number1);
    
    switch(number) {
      case  1:
          JOptionPane.showMessageDialog(null, "January has 31 days");
          break;
      case  2:
        char response; 
        response = JOptionPane.showInputDialog(null, 
            "Is this a leap year (Y or N)?").toUpperCase().charAt(0);
        if (response == 'Y')
          JOptionPane.showMessageDialog(null, "February has 29 days");
        else{
          JOptionPane.showMessageDialog(null, "February has 28 days");
        }
          break;
      case  3:
          JOptionPane.showMessageDialog(null, "March has 31 days");
          break;
      case  4:
          JOptionPane.showMessageDialog(null, "April has 30 days");
          break;
      case  5:
          JOptionPane.showMessageDialog(null, "May has 31 days");
          break;
      case  6:
          JOptionPane.showMessageDialog(null, "June has 30 days");
          break;
      case  7:
          JOptionPane.showMessageDialog(null, "July has 31 days");
          break;
      case  8:
          JOptionPane.showMessageDialog(null, "August has 31 days");
          break;
      case  9:
          JOptionPane.showMessageDialog(null, "September has 30 days");
          break;
      case  10:
          JOptionPane.showMessageDialog(null, "October has 31 days");
          break;
      case  11:
          JOptionPane.showMessageDialog(null, "November has 30 days");
          break;
      case  12:
          JOptionPane.showMessageDialog(null, "December has 31 days");
          break;          
      default:
          JOptionPane.showMessageDialog(null, "Not a valid entry");          
    }
  }    
}
