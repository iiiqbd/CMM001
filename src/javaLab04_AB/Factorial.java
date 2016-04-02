package javaLab04_AB;

import javax.swing.*;

public class Factorial {

	public static void main(String [] args) {

		String output = "";
		int n = Integer.parseInt(
			JOptionPane.showInputDialog("Enter number:"));
		int factorial = 1;
		for (int i = 1; i <= n; i++) {

			factorial *= i;		// ultracompact factorial generator!
			
			output += i + "! = " + factorial + "\n";
		}
		JOptionPane.showMessageDialog(null, output);
	}

}