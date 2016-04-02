
package javaLab04_AB;

import javax.swing.*;

public class UpSideDownTriangle_X_by_X {
	public static void main (String [] args) {

		String output = "";
    String rows = JOptionPane.showInputDialog("Enter number of lines desired");
    int r = Integer.parseInt(rows);
    // print r rows
		for (int i = 1; i <= r; i++) {
      // print spaces to force stars into desired pattern
			for (int j = 0; j < i; j++) {
				output += " ";
			}
      // print '5-i' stars to generate the pattern
			for (int k = 0; k < r-i; k++) {
				output += "* ";
			}      
			// print new line to complete pattern and refresh
      output += "\n";
		}
		JOptionPane.showMessageDialog(null, output);
	}


}