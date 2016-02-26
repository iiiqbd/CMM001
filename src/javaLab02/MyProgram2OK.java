package javaLab02;

import javax.swing.*; // "include" in place of "import", 2 dots instead of 1 after "swing"

public class MyProgram2OK
{
	public static void main(String[] args)
	{
		String strDays, strHours;
		int days, hours, totalHours = 0;
		strDays = JOptionPane.showInputDialog(
			"Enter number of days: ");
		days = Integer.parseInt(strDays);
		strHours = JOptionPane.showInputDialog(
			"Enter number of hours: "); // no space after ":"
		hours = Integer.parseInt(strHours);
		totalHours = days * 24 + hours; // undeclared variable "totalHours"
		JOptionPane.showMessageDialog(null,
			"totalHours = " + totalHours); // no "+" between "totalHours = " and "totalHours"
	}
}
