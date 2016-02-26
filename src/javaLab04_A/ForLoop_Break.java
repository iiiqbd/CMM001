package javaLab04_A;

import javax.swing.*;

public class ForLoop_Break {

	public static void main(String [] args) {

		int n, sum = 0;
		for (int i = 0; i < 10; i++ ) {
			String response = JOptionPane.showInputDialog(
			"Enter a number " + "(negative to exit):" );
			n = Integer.parseInt(response);

			if (n < 0) break; // i.e. leave the loop if n < 0
				sum += n;
			}
		JOptionPane.showMessageDialog(null, "sum of numbers was " + sum);

	}

}