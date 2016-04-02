package javaLab04_AB.Solns04;

/*
 * DoubleAccuracy.java
 *
 * Created on 18 October 2005, 10:18
 *
 */

import javax.swing.*;

/**
 *
 * @author ge, updated by ia, updated by dpl
 */
public class DoubleAccuracy {

    public static void main(String[] args) {
    String strOutput;
    strOutput = "";

    boolean done = false;
	double fraction = 0.1;
	double number = 1 + fraction;
	strOutput += "number is now " +number + "\n";
	do{
            if (number == 1.0)
            {
                done = true;
            }
            else
            {
                fraction = fraction*0.1;
                number = 1 + fraction;
                strOutput += "number is now " +number + "\n";
            }
    }while(!done);
    JOptionPane.showMessageDialog(null, strOutput);
    }

}
