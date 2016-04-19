/* CMM001SAL2.java - CMM001SAL2 class for testing Fuel, Casshier and Sales objects
 * Author: U. Adiele
 * Date: 15 Apr 2016
 */

package CMM001SAL2;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CMM001SAL2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Fuel petrol = new Fuel("Petrol", 1.145, 32000, 50000);
    Fuel diesel = new Fuel("Diesel", 1.196, 41000, 50000);
    Fuel hydrogen = new Fuel("Hydrogen", 0.528, 15600, 25000);
    
    // ArrayList of fuel objects
    ArrayList<Fuel>fuels = new ArrayList<>();
    
    fuels.add(petrol);
    fuels.add(diesel);
    fuels.add(hydrogen);
    
    // ArrayList of Cashier objects
    ArrayList<Cashier>cashiers = new ArrayList<>();
    
    // Cashier object - manager
    Cashier manager = new Cashier("manager", "1234");
    cashiers.add(manager);
    
    Cashier currentcashier = new Cashier("", "");
    currentcashier = manager;
    
    ArrayList<Sale>todaySales = new ArrayList<>();
    
    // menu system displaying user's options
    
    char choice;
    
    do {
      choice = JOptionPane.showInputDialog(
        "Cashier logged in is: "
        + currentcashier.getName()
        + "\n\nPlease select and option [1]-[8] or [0] to exit:\n\n"
        + "[1] Process a sale of Fuel\n"
        + "[2] Check Fuel stocks\n"
        + "[3] Refill Fuel storage tank\n"
        + "[4] Display sales of "
        + currentcashier.getName() + "\n"
        + "[5] Log in another cashier\n"
        + "[6] Update Fuel prices\n"
        + "[7] Summarise sales by fuel\n"
        + "[8] Summarise sales by cashier\n\n"
        + "[0] Exit"
      ).charAt(0);
      
      switch(choice) {
        
        case '1':
          int fuelchoice;
          double litres;
          boolean d; // determines whether fuel sale is discounted or not
          char response;
          try {
            do {
              fuelchoice = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                  "What type of Fuel? Enter [0]-[2]:\n"
                  + "0 " + fuels.get(0).getName() + "\n"
                  + "1 " + fuels.get(1).getName() + "\n"
                  + "2 " + fuels.get(2).getName() + "\n"
            ));
            } while (fuelchoice != 0 && fuelchoice != 1 && fuelchoice != 2);
            
            litres = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter number of litres of " + fuels.get(fuelchoice).getName()));
            
            response = JOptionPane.showInputDialog("Apply discount? [Enter 'y' if yes]:").charAt(0);
            d = (response == 'y' || response == 'Y');
            
            Sale sale1 = new Sale(fuels.get(fuelchoice), litres, d, currentcashier);
            
            if(litres > fuels.get(fuelchoice).getStock()) {
              JOptionPane.showMessageDialog(null, 
                  "Sorry, amount of "
                   + fuels.get(fuelchoice).getName()
                   + " left is " + fuels.get(fuelchoice).getStock()
                   + "litres.");            
            }
            
            todaySales.add(sale1);
            
            currentcashier.processSale(sale1);
            
            fuels.get(fuelchoice).pumpFuel(litres);
            
            JOptionPane.showMessageDialog(null, litres
              + " litres of " + fuels.get(fuelchoice).getName()
              + ": £" + sale1.getCost());
            
          } catch (NumberFormatException e ) {
              JOptionPane.showMessageDialog(null, "Please enter 0-2");
          }

          break;
          
        case '2':
          JOptionPane.showMessageDialog(null, fuels.get(0).toString() + "\n"
            + fuels.get(1).toString() + "\n" + fuels.get(2).toString());         
          
          break;

        case '3':
          try {
            do {
              fuelchoice = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                  "What type of Fuel is being refilled? Enter [0]-[2]:\n"
                  + "0 " + fuels.get(0).getName() + "\n"
                  + "1 " + fuels.get(1).getName() + "\n"
                  + "2 " + fuels.get(2).getName() + "\n"
            ));
            } while (fuelchoice != 0 && fuelchoice != 1 && fuelchoice != 2);
            
          } catch (NumberFormatException e ) {
              JOptionPane.showMessageDialog(null, "Please enter 0-2");
          }            
          break;

        case '4':
          
          break;

        case '5':
          
          break;
          
        case '6':
          
          break;

        case '7':
          
          break;

        case '8':
          
          break;
          
        case '0':
          JOptionPane.showMessageDialog(null, "Closing Sales Point\n"
            + "Have a nice day!");          
          break;          
        
        default:
          JOptionPane.showMessageDialog(null, "Sorry, choice not recognised.");
          break;
      
      } // end switch(choice)

    
    } while (choice != '0');
    
    
    
    
    
    
    
    
    
    
  } // end main method

} // end class CMM001SAL2