/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab11.SolnsSAL2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 0303077
 */
public class Cmm001 {
   
  public static void main (String [] args) {

    DecimalFormat to2DP = new DecimalFormat("0.00");

    // create fule objs and place in list
    Fuel petrol = new Fuel("Petrol", 1.145, 32000, 50000);
    Fuel diesel = new Fuel("Diesel", 1.196, 41000, 50000);
    Fuel hydrogen = new Fuel("Hydrogen", 0.528, 15600, 25000);   

    // ArrayList of fuel objects
    ArrayList<Fuel> fuels = new ArrayList<>();

    fuels.add(petrol);
    fuels.add(diesel);
    fuels.add(hydrogen);

    // ArrayList of Cashier objects
    ArrayList<Cashier>cashiers = new ArrayList<>();

    // Cashier object - manager
    Cashier manager = new Cashier("manager", "1234");
    cashiers.add(manager);
    Cashier currentcashier = manager;

    // create empty list of sales objs
    ArrayList<Sale>todaysSales = new ArrayList<>();

    // menu system displaying user's options

    /* use char for menu since there is no need to parse received input
       and is more robust in that it can pick off only the first digit entered*/
    char input;
    
    do {
      input = JOptionPane.showInputDialog(
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

      switch(input) {

        case 1: {
          

          break;
        } // end case 1

        case 2: {

          break;
        } // end case 2

        case 3: {

          break;
        } // end case 3

        case 4: {

          break;
        } // end case 4

        case 5: {

          break;
        } // end case 5

        case 6: {

          break;
        } // end case 6

        case 7: {

          break;
        } // end case 7

        case 8: {

          break;
        } // end case 8

        case '0': {
          JOptionPane.showMessageDialog(null, "Closing Sales Point\n"
            + "Have a nice day!");
          break;
        } // end case 0
        
        default: {
          JOptionPane.showMessageDialog(null, "Sorry, choice not recognised.");
          break;
        } // end default


        
      } // end switch (input)




    } while (input != '0');

    } // end main

} // end class Cmm001
