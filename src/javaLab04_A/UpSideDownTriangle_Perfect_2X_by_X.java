/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab04_A;

import javax.swing.*;

public class UpSideDownTriangle_Perfect_2X_by_X {
	public static void main (String [] args) {

		String output = "";
    String rows = JOptionPane.showInputDialog("Enter number of lines desired");
    int r = Integer.parseInt(rows);
    // print 'r' rows ('x' in assignment spec)
		for (int i = 1; i <= r; i++) {
      // print spaces to force stars into desired pattern
			for (int j = 0; j < 2 * i; j++) {
				output += " ";
			}
      // print '2(r-i)' stars to complete the pattern
			for (int k = 0; k < 2 * (r - i); k++) {
				output += "* ";
			}      
			// print new line
      output += "\n";
		}
		JOptionPane.showMessageDialog(null, output);
	}


}