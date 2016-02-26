package javaLab04_A;

import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uche
 */
public class DecreasingDotsA {
  	public static void main (String [] args) {

		String output = "";
		for (int line = 1; line <= 5; line++) {
			for (int i = 0; i <= 4; i++) {
				output += ".";
			}
			output += line + "\n";
		}
    JOptionPane.showMessageDialog(null, output);
	}

}