package javaLab06.Solns06;

import javax.swing.*;

/* Uses Account class to model a simple bank account
 * Asks for initial balance
 * Then displays menu with deposit and withdraw options until user requests to quit */

public class BankApplication2
{
  public static void main(String[] args)
  {
    String response, accountname;
    char choice;

    // prompt user for the initial balance in the account
    response = JOptionPane.showInputDialog (null, "Enter the initial balance of the account in pounds:");
    double openingBalance = Double.parseDouble(response);

    // prompt user for the Account name
    accountname = JOptionPane.showInputDialog (null, "Enter the account name:");

    // create a new Account object with the specified openingBalance
    Account account = new Account(openingBalance, accountname) ;

    do
    {
      response = JOptionPane.showInputDialog (
    "Your current balance is �" + account.getBalance() + "\n" +
        "Please choose one of the following options:" + "\n" +
        "1 - Deposit" + "\n" +
        "2 - Withdraw" + "\n" +
        "3 - Summary" + "\n" +
        "0 - Quit");
      choice = response.charAt(0);
      switch (choice) {
        case '1':
              response = JOptionPane.showInputDialog ("Enter the amount to deposit in pounds :");
              double depositAmount = Double.parseDouble(response);
              account.deposit(depositAmount);
              JOptionPane.showMessageDialog(null,
                "Thank you. �" + depositAmount + " has been added to your account");
              break;
        case '2':
              response = JOptionPane.showInputDialog ("Enter the amount to withdraw in pounds :");
              double withdrawAmount = Double.parseDouble(response);
              if(account.getBalance()>=withdrawAmount)
              {
                account.withdraw(withdrawAmount);
                JOptionPane.showMessageDialog(null,
                  "Thank you. " + withdrawAmount + " has been deducted to your account");
              }
              else
              {
              JOptionPane.showMessageDialog(null,
                "Sorry, you have insufficient funds to withdraw " + withdrawAmount
                + ". Your balance is " + account.getBalance());
              }
              break;
        case '3':
              JOptionPane.showMessageDialog (null, account.toString());
              break;
        case '0':
              JOptionPane.showMessageDialog(null,
              "Thank you for using the system. Goodbye.");
              break;
      }
    } while(choice != '0');
  } // end main
} // end BankApplication2
