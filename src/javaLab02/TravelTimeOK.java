package javaLab02;

import javax.swing.*;
public class TravelTimeOK
{
	public static void main(String[] args)
	{
		String number1, number2;
		double dist, speed; // "Double" instead of "double"

		number1 = JOptionPane.showInputDialog("Enter dist (in miles) "); // type mismatch (double receiving String input)

		number2 = JOptionPane.showInputDialog("Enter speed (in mph) "); // type mismatch (double receiving String input)

		dist = Double.parseDouble(number1); // undeclared variable ("distance" in place of "dist")

		speed = Double.parseDouble (number2);

		if (speed == 0.0)
		{
			JOptionPane.showMessageDialog(null,
			"Please enter a speed greater than 0"); // use a do-while loop to avoid errors
		}

		JOptionPane.showMessageDialog(null,
			"Time taken = " + (dist / speed) + " hours"); // potential divide by zero error. Will occur when speed is equal to "0.0"
	}
}
