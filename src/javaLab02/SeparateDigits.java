package javaLab02;

import javax.swing.*;

public class SeparateDigits
{
  public static void main(String [] args)
  {
    String number;
    int digit1, digit2, digit3, digit4, digit5, num;

    // enter number to be split
    number = JOptionPane.showInputDialog("Enter number to be split");
    // convert input String to int
    num = Integer.parseInt(number);

    // extract digits from the input number
    digit1 = num / 10000;
    digit2 = (num % 10000) / 1000;
    digit3 = (num % 1000) / 100;
    digit4 = (num % 100) / 10;
    digit5 = (num % 100) % 10;

    /* also, fllg works perfectly (but not quite as efficient
       as more variable need to be defined):
    // eg, for num = 12345
    digit1 = num / 10000;           // 1
    holder1 = num % 10000;          // 2345

    digit2 = holder1 / 1000;        // 2
    holder2 = holder1 % 1000;       // 345

    digit3 = holder2 / 100;         // 3
    holder3 = holder2 % 100;        // 45

    digit4 = holder3 / 10;          // 4
    digit5 = holder3 % 10;          // 5
*/
    // display output
    JOptionPane.showMessageDialog(null, "The number " + num +
        " can be split into " + digit1 + "   " + digit2 + "   " +
        digit3 + "   " + digit4 + "   " + digit5);

  }

}