package javaLab03;

import javax.swing.*;

public class Lab3Tut11 {

	public static void main(String[] args){

		boolean x = true, y = true;

		if (!(x && y) == (! x) || (! y)){
			JOptionPane.showMessageDialog(null, "!(x && y) EQUALS (! x) || (! y)");
		}

	}
}
