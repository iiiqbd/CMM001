package javaLab03;

import javax.swing.*;

public class MyProgramLab3 {

	public static void main(String[] args){

		int x, y;
		String ex = JOptionPane.showInputDialog("Enter x");
		x = Integer.parseInt(ex);
		String ey = JOptionPane.showInputDialog("Enter y");
		y = Integer.parseInt(ey);

		// HERE
		if (x > 0){
			if (y > 0)
				System.out.println("at checkpoint 1");
		}
		else
			System.out.println("at checkpoint 2");
	}
}
