package javaLab04_A;

/*


*/

import javax.swing.*;

public class NumbersA {

	public static void main(String[] args){
		
		String output = "";
		
		for (int i = 1; i <= 100; i++ ) {
			output += i + " ";			
		}
		JOptionPane.showMessageDialog(null, output);
		
	}
}


