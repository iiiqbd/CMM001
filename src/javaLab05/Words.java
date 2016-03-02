/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab05;

import javax.swing.*;
/**
 *
 * @author Uche
 */

public class Words {
	public static void main(String[] args) {
		String[] words = new String[5];
		String response = "";
		int num = 0;
		do {
			response = JOptionPane.showInputDialog("Enter a Word");
			words[num] = response;
			num++;
		} while (!( response.equals("end") || (num >= words.length) ));
		printWords(words);
	}

		public static void printWords(String[] array) {
		String output = "";
		for (int i = 0; i < array.length; i++) {
			output = output + (i+1) + " " + array[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, "Words are:\n" + output);
	}
}
