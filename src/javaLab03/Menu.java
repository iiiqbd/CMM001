package javaLab03;

import javax.swing.JOptionPane;

/*
[Menu.java] Design and implement a java application that
(a)displays an input dialog containing a message
			A chocolate [75p]
			B toffee    [60p]
			C cookie    [90p]
				Please enter your choice of product
(b)takes the user input (a char A, B or C) and, using a switch statement:
			assigns the relevant numerical value to an int itemPrice
			assigns the relevant text to a String itemName
(c)displays an input dialog containing a message
				How many items do you require
and converts the user input and assigns it to an integer number
(d)displays a message dialog summarising the order and giving the total cost
e.g. for an order of 4 cookies display "Your order is for 4 cookies and will cost 360p"

Think about how you could make the program cope with an unexpected user input (i.e.
something other than A, B or C in step (b).
*/

public class Menu {

	public static void main (String [] args) {

    int itemPrice = 0;
    int number;
    int totalCost;
    String itemName = JOptionPane.showInputDialog(
      "A Chocolate   [75p]\n" +
			"B Toffee         [60p]\n" +
			"C Cookie        [90p]");
    char name = itemName.toUpperCase().charAt(0);
    String input = JOptionPane.showInputDialog(
      "How many items do you require");
    number = Integer.parseInt(input);  
    
    switch (name) {
      case 'A':
        itemName = "Chocolate";
        itemPrice = 75;
        break;
      case 'B':
        itemName = "Toffee";
        itemPrice = 60;
        break;
      case 'C':
        itemName = "Cookie";
        itemPrice = 90;
        break;
      default:  JOptionPane.showMessageDialog(null,
          "Please enter A, B, or C");
    }
        totalCost = number * itemPrice;
        JOptionPane.showMessageDialog(null,
          "Your order is for " + number
          + itemName + " and will cost " + totalCost + "p.");

    
	}

}