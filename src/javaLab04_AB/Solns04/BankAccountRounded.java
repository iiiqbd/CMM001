package javaLab04_AB.Solns04;

/*
 * HouseholdAccounts.java
 *
 * Created on 18 October 2005, 09:35
 *
 */

import javax.swing.*;
import java.text.DecimalFormat;

/**
 *
 * @author ge, updated by ia
 */

public class BankAccountRounded
{
    public static void main(String[] args)
    {
        String strTransaction;
        char transaction;
		String strBalance;
        double balance;
		String strAmount;
        double amount;

		DecimalFormat to2DP = new DecimalFormat("#.00"); //to get 2 digits after the decimal point

		JOptionPane.showMessageDialog(null,
                "this program will calculate the balance of a bank account " +
                "\n" +
                "it will start by prompting for the opening balance" +
                "\n" +
                "It will then stay in a menu offering the choice of " +
                "\n" +
                "\'c\' for credit, \'d\' for debit or \'q\' to quit" +
                "\n" +
                "once \'q\' is selected the remaining balance will be shown");

		strBalance = JOptionPane.showInputDialog(
                "what is the opening balance");
		balance = Double.parseDouble(strBalance);
		do{
                strTransaction = JOptionPane.showInputDialog(
                        "Current balance is £" + to2DP.format(balance) +
                        "\n"+"Press c to credit money to the account" +
                        "\n"+
                        "Press d to debit money from the account" +
                        "\n" +
                        "Press q to quit the program");
				transaction = strTransaction.toLowerCase().charAt(0); // added .toLowerCase()

				switch(transaction)
				{
					case 'd':
						strAmount = JOptionPane.showInputDialog(
						        "how much do you wish to debit from your account");
						amount = Double.parseDouble(strAmount);
                		balance = balance - amount;
					break;
					case 'c':
                 		strAmount = JOptionPane.showInputDialog(
                                 "how much do you wish to credit to your account");
                 		amount = Double.parseDouble(strAmount);
                 		balance = balance + amount;
					break;
					case 'q':
							JOptionPane.showMessageDialog(null,
                                        "Thank you for using the system \n" +
                                        "the balance is now £"+ to2DP.format(balance));
				}

		}while(transaction!='q');
   }
}