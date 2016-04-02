package javaLab04_AB.Solns04;

/*
 * Consecutive.java
 *
 * Created on 18 October 2005, 10:44
 *
 */


import javax.swing.*;
/**
 *
 * @author ge, updated by ia
 */
public class Consecutive {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strNumber;
        String strOutput;
        int number;
	int previous;
	boolean correct = false;

	JOptionPane.showMessageDialog(null,
                "this program will check whether a sequence of numbers has consecutive numbers" +
                "\n" +
                "enter -1 to end the sequence of numbers" +
                "\n" +
                "consecutive numbers are for example 12 then 13");

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
		if (number== (previous +1) ){
                    correct = true;
                }
		previous = number;
            }while(number!=-1);
        }

        if(correct){
            strOutput = "Found Match";
        }
        else{
            strOutput = "No Match";
	}

        JOptionPane.showMessageDialog(null, strOutput);

    }

}
