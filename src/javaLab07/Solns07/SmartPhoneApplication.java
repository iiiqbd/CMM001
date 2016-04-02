package javaLab07.Solns07;


// SmartPhoneTest.java CMM001 Lab
// Author: DPL
// Uses SmartPhone class

// SmartPhoneManagerApplication.java
// Author: DPL
// Uses SmartPhone class

import javax.swing.*;

public class SmartPhoneApplication
{
  public static void main(String [] args)
  {

  // Create a new SmartPhone object after asking user for opening balance and account type

     // get user Input for customer name
     String customerName;
     customerName = JOptionPane.showInputDialog("Please enter Customer's name");


     // get user Input for initial balance
     double initialBalance;
     do {
        initialBalance = Double.parseDouble(JOptionPane.showInputDialog(
            "Please input initial balance (in pence, Minimum £5.00)\n  for the new SmartPhone Account"));
        if (initialBalance < 5)
          JOptionPane.showMessageDialog(null, "Minimum opening balance is £5.00");
     }
     while(initialBalance<5);


     //SmartPhone phone = new SmartPhone(customerName, initialBalance, type);
     SmartPhone phone = new SmartPhone(customerName, initialBalance);
  // loop displaying menu offering options that test methods of the smartphone class
     char selection;
     do {
           String input = JOptionPane.showInputDialog(
                 "Please select a transaction\n"
                 + "1 - to Top-up the account balance\n"
                 + "2 - to make a call\n"
                 + "3 - to send a text\n"
                 + "4 - to purchase an App\n"
                 + "5 - to check the account balance\n"
                 + "6 - to check full account details\n"
                 + "7 - to withdraw all account funds\n"
                 + "q - to quit");
          selection = input.charAt(0); // better to use char type than integer
          // using int type can lead to runtime errors upon invalid input

          switch(selection){

          case '1': // top-Up acccount
            double value = Double.parseDouble(JOptionPane.showInputDialog(
                     "Please input top-up amount (in pounds)"));
            phone.topup(value*100); // converting pounds to pence when adding to balance
            JOptionPane.showMessageDialog(null,
                     "Thank you for topping up. New balance is £" + phone.getBalancePounds());
            break;

          case '2':// make call
            double time = Double.parseDouble(JOptionPane.showInputDialog(
                     "Please input call time in seconds"));
            phone.deductCallCost(time);
            JOptionPane.showMessageDialog(null,
                     "Call ended. Remaining balance is £" + phone.getBalancePounds());
            break;

          case '3':// send text
            phone.deductTextCost();
            JOptionPane.showMessageDialog(null,
                     "Text sent. Remaining balance is £" + phone.getBalancePounds());
            break;

          case '4':// buy App
            double cost = Double.parseDouble(JOptionPane.showInputDialog(
                     "Please input cost of App (in pounds)"));
            if(phone.getBalancePounds()>= cost){
                phone.deductAppCost(cost);
               JOptionPane.showMessageDialog(null,
                     "App purchased. Remaining balance is £" + phone.getBalancePounds());
            }
            else{
              JOptionPane.showMessageDialog(null,
                     "Sorry insufficient funds to purchase that app");
            }
            break;

          case '5':// check Balance
              JOptionPane.showMessageDialog(null,
                      "Current Balance is £" + phone.getBalancePounds());
            break;

          case '6':// check Balance
              JOptionPane.showMessageDialog(null,
                  phone.toString());
            break;

          case '7':// withdraw funds
             JOptionPane.showMessageDialog(null,
                      "Account now closed. £" + phone.closeAccount() + " returned.");
            break;
          }
     }
     while(selection != 'q');
   JOptionPane.showMessageDialog(null,
                      "Thanks for using the system. Goodbye.");


   System.out.println(phone.toString());
   SmartPhone phone2 = new SmartPhone("Scarlett", 5.00);
   System.out.println(phone2.toString());

   phone.transfer(phone2, 10.00);
   System.out.println(phone.toString());
   System.out.println(phone2.toString());



  } // end of main method
} //end of SmartPhoneManagerApplication class