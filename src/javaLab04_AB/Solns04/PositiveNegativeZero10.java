package javaLab04_AB.Solns04;

/*
 * PositiveNegativeZero10.java
 *
 * Created on 18 October 2005, 08:51
 *
 */

import javax.swing.*;
/**
 *
 * @author ge, updated by ia
 */
public class PositiveNegativeZero10 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strNumber;
        int number;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int count = 1;

        JOptionPane.showMessageDialog(null,
                "this program will ask you for 10 integers, one after the other"+
                "\n"+
                "it will then display how many of the integers entered were positive" +
                "\n" +
                "negative or zero");

        while(count<=10){
            strNumber = JOptionPane.showInputDialog(null,
                    "enter integer no. "+count);
            number = Integer.parseInt(strNumber);
            if(number>0){
                positive++;
            }
            if(number<0){
                negative++;
            }
            if(number == 0){
                zero++;
            }
            count++;
        }

        JOptionPane.showMessageDialog(null,
                "the number of positive integers entered was "+positive +
                "\n" +
                "the number of negative integers entered was "+negative +
                "\n" +
                "the number of zeroes entered was "+zero);
    }

}
