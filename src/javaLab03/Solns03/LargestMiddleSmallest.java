package javaLab03.Solns03;

/*
 * LargestMiddleSmallest.java
 *
 */

import javax.swing.*;

public class LargestMiddleSmallest{
    public static void main(String[] args){
        String strNum1, strNum2, strNum3;
        int num1, num2, num3;
        int largest, smallest, middle;
        int sum;
        double average;

        JOptionPane.showMessageDialog(null,
                "this program will prompt for 3 integers from the user" +
                "\n" +
                "the program will then arrange the integers into largest, median and smallest");

        strNum1 = JOptionPane.showInputDialog(null,
                "what is the first integer");
        num1 = Integer.parseInt(strNum1);

        largest = num1;
        middle = num1;
        smallest = num1;

        strNum2 = JOptionPane.showInputDialog(null,
                "what is the second integer");
        num2 = Integer.parseInt(strNum2);

        strNum3 = JOptionPane.showInputDialog(null,
                "what is the third integer");
        num3 = Integer.parseInt(strNum3);


        if (num1>=num2 && num2>=num3){
            largest = num1;
            middle = num2;
            smallest = num3;
        }
        if (num1>=num3 && num3>=num2){
            largest = num1;
            middle = num3;
            smallest = num2;
        }
        if (num2>=num1 && num1>=num3){
            largest = num2;
            middle = num1;
            smallest = num3;
        }
        if (num2>=num3 && num3>=num1){
            largest = num2;
            middle = num3;
            smallest = num1;
        }
        if (num3>=num1 && num1>=num2){
            largest = num3;
            middle = num1;
            smallest = num2;
        }
        if (num3>=num2 && num2>=num1){
            largest = num3;
            middle = num2;
            smallest = num1;
        }

        sum = num1 + num2 + num3;
        average = sum/3.0;
        JOptionPane.showMessageDialog(null,
                "the largest was " + largest +
                "\n" +
                "the median was " + middle +
                "\n"+
                "the smallest was " + smallest +
                "\n"+
                "the sum was " + sum +
                "\n"+
                "the average was " + average
                );
    }

}
