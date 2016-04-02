package javaLab04_AB.Solns04;

/*
 * DecimalDigits.java
 *
 * Created on 18 October 2005, 09:32
 *
 */

import javax.swing.*;

/**
 *
 * @author ge, updated by ia
 */
public class NumberOfDecimalDigits {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strNumber;
        int number;
	int answer;
	int remainder;
	int count = 1;
	strNumber = JOptionPane.showInputDialog(null,
                "please enter an integer");
	number = Integer.parseInt(strNumber);
	do{
            answer = number/10;
            remainder = number %10;
            if (answer > 0){
                count++;
                number = answer;
            }
        }while(answer >0);

        JOptionPane.showMessageDialog(null,
                "there were "+count+" digits in your number");
    }

}
