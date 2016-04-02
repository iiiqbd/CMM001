package javaLab04_AB.Solns04;

/*
 * BigSmall10.java
 *
 * Created on 18 October 2005, 08:45
 *
 */

import javax.swing.*;
/**
 *
 * @author ge, updated by ia
 */
public class BigSmall10 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strNumber;
        int number;
	int count;
        int smallest;
        int largest;
        JOptionPane.showMessageDialog(null,
                "this program will find the largest and smallest integer" +
                "\n" +
                "from 10 integers that are entered by the user");

        smallest = Integer.MAX_VALUE;
        largest = Integer.MIN_VALUE;

	count =0;
	do{
            strNumber = JOptionPane.showInputDialog(null,
                    "enter integer no. "+(count+1));
            number = Integer.parseInt(strNumber);
            if(number>largest){
                largest = number;
            }
            if(number<smallest){
            	smallest = number;
            }
            count++;
        }while(count<10);


        JOptionPane.showMessageDialog(null,
                "The largest number was "+largest +
                "\n" +
                "The smallest number was "+smallest);
    }

}
