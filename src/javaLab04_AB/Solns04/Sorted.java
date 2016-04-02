package javaLab04_AB.Solns04;

/*
 * Sorted.java
 *
 * Created on 18 October 2005, 10:25
 *
 */

import javax.swing.*;
/**
 *
 * @author ge, updated by ia
 */
public class Sorted {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strNumber;
        String strOutput;
		int number;
		int previous;
		boolean correct = true;

		JOptionPane.showMessageDialog(null,
                "this program will check whether a sequence of numbers is in order or not!" +
                "\n" +
                "enter -1 to end the sequence of numbers");

		strNumber = JOptionPane.showInputDialog(null,"enter a number");
		number = Integer.parseInt(strNumber);
		previous = number;

		if (previous == -1){
            JOptionPane.showMessageDialog(null,
                    "that was rather strange" +
                    "\n" +
                    "you chose not to enter a sequence of numbers" +
                    "\n" +
                    "so since then there is no sequence the numbers must be in order i.e. ");
		}
		else{
            do{
                strNumber = JOptionPane.showInputDialog(null,"enter a number");
				number = Integer.parseInt(strNumber);
				if (previous<=number || number == -1){
                    previous = number;
                }
				else{
                    correct = false;
                }
            }while(number!=-1);
        }

        if(correct){
            strOutput ="Sorted";
        }
        else{
            strOutput = "Unsorted";
        }

        JOptionPane.showMessageDialog(null, strOutput);
    }

}
