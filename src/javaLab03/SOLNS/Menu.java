package javaLab03.SOLNS;

/*
 * Menu.java
 * Created by DPL October 2012
 */

import javax.swing.*;

public class Menu{
    public static void main(String[] args){
        String strChoice, strNumber, itemName;
        int itemPrice = 0, number;
        char choice;

        strChoice = JOptionPane.showInputDialog(
               "A  chocolate [75p]\n" +
               "B  toffee    [60p]\n" +
               "C  cookie    [90p]\n" +
               "Please enter your choice of product ");
        choice = strChoice.charAt(0);

        switch(choice){
          case 'A':
          case 'a':
            itemName = "chocolate";
            itemPrice = 75;
            break;

          case 'B':
          case 'b':
            itemName = "toffee";
            itemPrice = 60;
            break;

          case 'C':
          case 'c':
            itemName = "cookie";
            itemPrice = 90;
            break;

          default:
            itemName = "No choice made";
            itemPrice = 0;
        }

        if(itemPrice != 0 ){
          strNumber = JOptionPane.showInputDialog(
                       "How many " + itemName + " do you require ");
          number = Integer.parseInt(strNumber);
          JOptionPane.showMessageDialog(null,
                 "Your order is for " + number + " " +
                 itemName + " and will cost " +
                 number*itemPrice + "p");
        }
        else{
           JOptionPane.showMessageDialog(null,
                 "Item code not recognised");
        }
    } //end main

} // end Menu
