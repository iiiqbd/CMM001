package javaLab04_A;

/*
Write a Java program that obtains a decimal number from the user and
converts that number to its binary equivalent.
See page 64 (pdf p.76) of Programming in Java (An Interdisciplinary Approach)
for the following implementation. Note that this has been slightly modified
for stylistic reasons. This program can safely handle from 0 up to
LONG.MAX_VALUE - 9223372036854775807.

Prog 1.3.7 Converting Decimal to Binary
*/

import javax.swing.*;

public class DecimalToBinaryLong {

	public static void main (String [] args) {

		String number;
		number = JOptionPane.showInputDialog("Please enter the decimal"
			+ " number to be converted (0 - 9223372036854775807)");
		// String variable to store output
		String output = "";
		// convert received String to type int
		Long num = Long.parseLong(number);
		// initialise i - (define i properly)
		Long i = 1L; /* "L" specifies the number "1" is of the Long data type
			otherwise an incompatible	data type error occurs */

		while (i <= num / 2) {
			/* i is currently the largest power of 2 <= num */
			i = 2 * i;
		}
		Long n = num;
		// extract powers of 2 in decreasing order
		while (i > 0) {

			if (n < i) {
				output += 0;
			}
			else {
				output += 1;
				n -= i;
			}
			i = i / 2;
		}

		JOptionPane.showMessageDialog(null, "The binary equivalent of "
			+ num + " is " + output + ".");

	}
}



/*
Write a Java program that obtains a decimal number from the user and
converts that number to its binary equivalent.
VERY FAULTY SOLN METHODOLOGY BELOW
*/


/*

import javax.swing.*;

public class DecimalToBinary {

	public static void main (String [] args) {

		String number = JOptionPane.showInputDialog("Please enter the decimal number to be converted");
		int num = Integer.parseInt(number);
		String output = "";

		for (int i = num; i >= 1; i--) {

			if (i % 2 == 1) {
				output += 1;
			}
			else {
				output += 0;
			}
		}

		JOptionPane.showMessageDialog(null, "The binary equivalent of "
			+ num + " is " + output + ".");

	}
}

*/