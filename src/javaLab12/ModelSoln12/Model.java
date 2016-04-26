
package javaLab12.ModelSoln12;

import javax.swing.*;
import java.text.DecimalFormat;

public class Model {
 
    public static void main(String[] args) {
        
        // Create Person object for use in SmartCard construction
        Person student = new Person("Dr Marcus d'Teacher", false, "6666", 47);
        // Create SmartCard object
        SmartCard card = new SmartCard(student, "9999");
        
        // create DecimalFormat object for displaying cash values to nearest £
        DecimalFormat to2dp = new DecimalFormat("0.00");
   
        String input; // local variable to hold user responses from menu
        char choice; // local variable on which to base switch cases 
        
        do{ String menutext = "Card balance is £" + 
                to2dp.format(card.getCash()) +
                "\n\nPlease select an option:\n" +
                "[1] Add funds onto card\n" +
                "[2] Print card details\n" +
                "[3] Withdraw all cash from card\n" +
                "[4] Pay for food with card\n" +
                "[5] Pay for printing with card\n" +
                "[6] Buy bus tickets with card\n\n" +
                "[0] To exit";
            input = JOptionPane.showInputDialog(menutext);
            choice = input.charAt(0);
            
            switch(choice){
                
                case '1': // code for adding funds to Smartcard
                    input = JOptionPane.showInputDialog(
                            "Enter amount of cash to add to card: ");
                    double cash = Double.parseDouble(input);
                    if(cash>0) card.addCash(cash);
                    else JOptionPane.showMessageDialog(null, 
                            "Sorry, invalid top-up amount");
                    break;

                case '2': // code for displaying Summary of card details
                    String message = "Cardholder: " + card.getName() + "\n" +
                            "Funds on card: £" + to2dp.format(card.getCash()) +
                            "\nCardholder age: " + card.getAge() +"\n";
                    if(card.getStatus()) message += "Status: Student";
                    else message += "Status: Non-Student";
                    JOptionPane.showMessageDialog(null, message);          
                    break;
                    
                case '3': // code for withdrawing all funds from a card
                    input = JOptionPane.showInputDialog(
                            "Enter your SmartCard pin: ");
                    // check for correct pin
                    if(card.checkPin(input)){
                        JOptionPane.showMessageDialog(null, 
                                "£" + to2dp.format(card.withdrawAllCash()) +
                                " refunded from Smartcard.");
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, 
                                    "Sorry, pin is incorrect.\n" +
                                    "Withdrawal cannot be processed.");
                        break;
                    }
                    
                case '4': // code for purchasing Food with Smartcard
                    // if no funds display message and return to value
                    if(card.getCash()<=0){
                            JOptionPane.showMessageDialog(null, 
                                    "Sorry, no funds on card\n");
                            break;
                    }
                    // ask user for undiscounted cost of food, store in price
                    input = JOptionPane.showInputDialog(
                            "Enter price of food in £");
                    double price = Double.parseDouble(input);
                    double cost = price;
                    // apply discount to cost if cardholder is a student
                    if(card.getStatus()) {
                        cost = cost*(1-SmartCard.studentDiscount);
                        JOptionPane.showMessageDialog(null, 
                                "Cost after student-discount is £" + 
                                to2dp.format(cost));                        
                    }
                    // if funds are sufficient pay cost and confirm purchase
                    if(cost <= card.getCash()){
                            card.payFood(price);
                            JOptionPane.showMessageDialog(null, 
                                "£" + to2dp.format(cost) + 
                                " deducted from SmartCard");
                    }
                    else{
                            JOptionPane.showMessageDialog(null, 
                                    "Sorry, insufficient funds on card\n"); 
                    }
                    break;   
                    
                case '5': // code for paying for printing using SmartCard
                    // if no funds display message and return to value
                    if(card.getCash()<=0){
                            JOptionPane.showMessageDialog(null, 
                                    "Sorry, no funds on card\n");
                            break;
                    }
                    int s,p;
                    // ask user to choose one or two sided printing
                    do{
                        input = JOptionPane.showInputDialog(
                            "How many sides do you wish to print on, 1 or 2?" );
                        s = Integer.parseInt(input);
                    }while(s!=1 && s!=2);
                    // ask user to choose number of pages, check positive
                    do{
                        input = JOptionPane.showInputDialog(
                            "How many pages do you wish to print?" );
                        p = Integer.parseInt(input);
                    }while(p<0);
                    // apply payPrinting() method with user input params
                    if (card.payPrinting(s, p)){
                            JOptionPane.showMessageDialog(null, 
                                " printing complete");
                    }
                    else{
                            JOptionPane.showMessageDialog(null, 
                                "Sorry, insufficient funds on card\n"); 
                    }
                    break; 
                    
                case '6': // code for purchasing bus tickets with Smartcard
                    
                    // local variable holding cost per journey
                    double ticketcost = SmartCard.costPerJourney;
                    // deduct discount if cardholder is a student
                    if(card.getStatus()) 
                        ticketcost *= (1-SmartCard.studentDiscount);
                    // calculate number of tickets finds on card can purchase
                    int maxtickets = (int) (card.getCash()/ticketcost);
                    
                    if(maxtickets>0){
                        input = JOptionPane.showInputDialog(
                            "Bus tickest cost £" 
                            + to2dp.format(ticketcost)
                            + " each.\nHow many tickets do you wish to buy?\n"
                            + "You have funds for up to " 
                            + maxtickets + " tickets.");
                        int numtickets = Integer.parseInt(input);
                        // check that tickets requested are 0<num<=maxtickets 
                        if(numtickets <=maxtickets && numtickets > 0){
                            card.payBus(numtickets);
                            JOptionPane.showMessageDialog(null, 
                                numtickets + " bus tickets purchased");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, 
                                    "Sorry, invalid number of tickets"); 
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, 
                                "Sorry, you have insufficient funds on the "
                                + "card to purchase a bus ticket");
                    }
                    break; 
                    
                case '0': // code executed when leaving the do-while statement
                    JOptionPane.showMessageDialog(null, 
                        "Thank you for using your Smartcard\n"
                        + "Have a nice day!");
                    break;                                 
            }
        }while(choice!='0');
    }
}
