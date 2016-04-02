package javaLab04_AB.Solns04;

/* Program to play higher-lower guessing game against computer
 * dpl October 2012 */

import java.util.*;
import javax.swing.*;

public class HigherLower
{
  public static void main(String[] args)
  {
    int target, guess, more, count;
    do
    {
      target = (int) Math.round(100.0*Math.random() - 0.5 ); // generates random number 0 to 99
      String guessStr = "";
      count = 1;
      guess = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "I am thinking of a whole number between 0 and 99\n" +
                  "What is your guess?"));
      guessStr += (guess + " ");
      do
      {
        if(guess < target)
        {
          guess = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "Your guesses so far have been\n" + guessStr
                  + "\nMy number is higher than your last guess\n"
                  + "What is your next guess?"));
        }
        else if(guess > target)
        {
           guess = Integer.parseInt(JOptionPane.showInputDialog(null,
                   "Your guesses so far have been\n" + guessStr
                   + "\nMy number is lower than your last guess\n"
                   + "What is your next guess?"));
        }
        count++;
        guessStr += (guess + " ");
      }while(guess != target);
      more = JOptionPane.showConfirmDialog(null, "Well done, after " + count + " guesses\n"
                      + "you found my number " + target + "\n"
                      + "Another game?");
    }while(more != JOptionPane.NO_OPTION);
    JOptionPane.showMessageDialog(null, "Thank's for playing!");
  }
}