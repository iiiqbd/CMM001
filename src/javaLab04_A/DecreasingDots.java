package javaLab04_A;

import javax.swing.*;

public class DecreasingDots {
	public static void main (String [] args) {

		String output = "";
		int line = 0;
		for (line = 1; line <= 6; line++) {
			for (int dots = 0; dots < (6-line); dots++) {
				output += "*";
			}
			output += "\n";
		}
		JOptionPane.showMessageDialog(null, output);
	}


}