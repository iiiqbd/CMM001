package javaLab04_AB.Solns04;

/*
 * SumAverage10.java
 * using a do-while
 */

import javax.swing.*;
/**
 * @author ge, updated by ia, updated by dpl
 */
public class SumAverage10v2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String strNumber;
      double number = 0.0;
      double sum = 0;
      double average;
      int count = 0;

      JOptionPane.showMessageDialog(null,
                "This program will ask you for 10 numbers, " +
                "one after the other." +
                "\n"+
                "You can end the program at anytime by entering a negative value" +
                "\n" +
        "The program will then display the sum and average of the numbers entered");

     do{
            strNumber = JOptionPane.showInputDialog(null,
                    "enter number (negative to exit): ");
            number = Double.parseDouble(strNumber);
            if (number >= 0.0){
                sum = sum + number;
                count++;
            }
      } while(count < 10 && number >= 0.0);

      average = sum / (double) count;

      JOptionPane.showMessageDialog(null,
                "the total of the positive numbers entered is " + sum +
                "\nthere were " + (int) count + " positive numbers\n" +
                "the average of the positive numbers entered is " + average);
    }

}
