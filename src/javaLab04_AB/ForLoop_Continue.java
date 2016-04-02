package javaLab04_AB;

import javax.swing.*;

public class ForLoop_Continue {

	public static void main(String [] args) {

		/* Accept numbers entered by user.
		* Add the number to the sum only if it is positive */

		String output = "";
		int n, sum = 0;
		for (int i = 0; i < 5; i++ ) {
			n = Integer.parseInt(JOptionPane.showInputDialog(
			"Enter a number:" ));
			if (n <= 0) {
				continue;
			}
			sum += n;
		}
		JOptionPane.showMessageDialog(null, "Sum of numbers > 0 was " + sum + "\n");



		// Print all numbers from 1 to 50 not divisible by 7
		for (int i = 1; i <= 50; i++ ) {
			if (i % 7 == 0) {
				continue;
			}
			output += i + " ";
		}
		JOptionPane.showMessageDialog(null, output + "\n");

	}

}