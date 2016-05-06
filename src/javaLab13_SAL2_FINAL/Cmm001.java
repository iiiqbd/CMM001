package javaLab13_SAL2_FINAL;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Uses Cashier, Fuel and Sale classes to create a Service Station application
 * @author David Lonie
 */
public class Cmm001 {

    public static void main(String[] args) {

    // Create objects representing cashiers at filing station
        // Create an ArrayList of Cashiers to represent today's cashiers
        ArrayList<Cashier> cashiers = new ArrayList<>();
        // Create a Cashier to represent manager
        Cashier manager = new Cashier("manager","1234");
        // a Cashier object to represent cashier currently processing fuel sales
        Cashier currentcashier;
        // Add manager to list of today's cashiers
        cashiers.add(manager);
        // Set manager as the currentcashier
        currentcashier = manager;//

    // Create objects reprsenting fuels sold by filling station
        ArrayList<Fuel> fuels = new ArrayList<>();
        Fuel petrol = new Fuel("Petrol", 1.145, 40000, 50000);
        Fuel diesel = new Fuel("Diesel", 1.196, 45000, 50000);
        Fuel hydrogen = new Fuel("Hydrogen", 0.528, 15000, 20000);
        fuels.add(petrol);
        fuels.add(diesel);
        fuels.add(hydrogen);
        Fuel currentfuel; // ? is this for - only occurs here

        String fuellist = "" ;
        // can we possibly ask the user to enter 1-3 and process it as 0-2?
        for(int i = 0; i < fuels.size(); i++){
            fuellist += i + "  " + fuels.get(i).getName() + "\n";
        }

    // Create objects representing fuel Sales made today
        ArrayList<Sale> todaysSales = new ArrayList<>();

    // create DecimalFormat object for displaying cash values to nearest £
        DecimalFormat to2dp = new DecimalFormat("0.00");

    // Ceate variables used by menu for user input

        String input; // local variable to hold user responses from menu
        char choice; // local variable on which to base switch cases

    // create user menu to interact with Order called order (?)
        do{ String menutext = "Cashier logged in is: "
                + currentcashier.getName()
                + "\n\nPlease select an option [1]-[8] or [0] to exit:\n\n"
                + "[1] Process a sale of Fuel\n"
                + "[2] Check Fuel stocks\n"
                + "[3] Refill Fuel storage tank\n"
                + "[4] Display sales of " + currentcashier.getName() + "\n"
                + "[5] Log in another cashier\n"
                + "[6] Update Fuel prices\n"
                + "[7] Summarise sales by Fuel\n"
                + "[8] Summarise sales by Cashier\n\n"
                + "[0] Exit ";
            input = JOptionPane.showInputDialog(menutext);
            choice = input.charAt(0);

            switch(choice){

                case '1': {// code for processing a sale of fuel
                    int fuelchoice;
                    do{
                        fuelchoice = Integer.parseInt(JOptionPane.showInputDialog(
                                "What type of Fuel? Enter [0]-[2]:\n" + fuellist));
                    }while(fuelchoice < 0 || fuelchoice >= fuels.size());
                    Fuel fuel = fuels.get(fuelchoice);
                    double ltrs = Double.parseDouble(JOptionPane.showInputDialog(
                            "Enter number of litres of " + fuel.getName()));
                    boolean d = JOptionPane.showInputDialog(
                            "Apply discount? [Enter y if yes]:").equals("y");
                    Sale sale = new Sale(fuel, ltrs, d, currentcashier);
                    if(fuel.getStock() < ltrs){
                        JOptionPane.showMessageDialog(null, "Sorry insufficient "
                                + fuel.getName() + " in stock, only "
                                + sale.getLitres() + " available");
                    }
                    todaysSales.add(sale);
                    currentcashier.processSale(sale);
                    fuel.pumpFuel(ltrs);

                    JOptionPane.showMessageDialog(null, sale.getLitres()
                            + " litres of " + fuel.getName()
                            + " £" + to2dp.format(sale.getCost())  );
                    break;
                } //end case 1

                case '2': {// code for checking fuel stocks
                    String message = "";
                    for(int i = 0; i < fuels.size(); i++){
                        message += fuels.get(i).toString() + "\n";
                        //System.out.println(fuels.get(i).toString());
                    }
                    JOptionPane.showMessageDialog(null, message);
                    break;
                } //end case 2

                case '3': { // code for adding fuel to storage tank
                    int fuelchoice;
                    do{
                        fuelchoice = Integer.parseInt(JOptionPane.showInputDialog(
                                "What type of Fuel is being refilled. "
                                        + "Enter [0]-[2]\n"
                                        + fuellist));
                    }while(fuelchoice < 0 || fuelchoice >= fuels.size());
                    Fuel fuel = fuels.get(fuelchoice);
                    fuel.refill();
                    JOptionPane.showMessageDialog(null, fuel.getName()
                            + " stock refilled to "
                            + fuel.getCAPACITY() + " litres");
                    break;
                } //end case 3

                case '4': { // code for displaying fuel sales of current cashier
                    String message = currentcashier.getName()
                            + " fuel sales on current shift:\n"
                            + currentcashier.getNumberSales()
                            + " sales of total value £"
                            + to2dp.format(currentcashier.getTakings()) + "\n";
                    for(Sale s: Sale.byCashier(currentcashier, todaysSales)){
                        message += s.getLitres() + " litres of "
                                + s.getFuel().getName() + " £"
                                + to2dp.format(s.getCost())+ "\n";

                    }
                    System.out.println(message);
                    JOptionPane.showMessageDialog(null, message );
                    break;
                } //end case 4

                case '5':{ // code for new Cashier log in
                    String name = JOptionPane.showInputDialog(
                            "Please enter your name: ");
                    String id = JOptionPane.showInputDialog(
                            "Please enter your staff ID:\n");
                    boolean isNew = true;
                    for(Cashier c: cashiers){
                        if(c.getName().equals(name)){
                            isNew = false;
                            if(c.checkID(id)){
                                currentcashier = c;
                            }
                            else JOptionPane.showMessageDialog(null,
                                    "Sorry, incorrect id for cashier "
                                    + c.getName());
                            break;
                        } // end outer if
                    } //end for loop
                    if(isNew){
                        Cashier newCashier = new Cashier(name, id);
                        cashiers.add(newCashier);
                        currentcashier = newCashier;
                    }
                } //end case 5
                break;

                case '6':{ // code for updating fuel prices
                    int fuelchoice;
                    do{
                        fuelchoice = Integer.parseInt(JOptionPane.showInputDialog(
                                "What Fuel is being repriced. "
                                        + "Enter [0]-[2]\n"
                                        + fuellist));
                    }while(fuelchoice < 0 || fuelchoice >= fuels.size());
                    Fuel fuel = fuels.get(fuelchoice);
                    double ppl = Double.parseDouble(JOptionPane.showInputDialog(
                                "New cost of " + fuels.get(fuelchoice).getName()));
                    fuel.setPrice(ppl);
                    JOptionPane.showMessageDialog(null, "Cost of "
                            + fuel.getName()  + " now £"
                            + fuel.getPrice());
                } //end case 6
                break;

                case '7': {// code for summarising sales by fuel type
                    String message = "Summary of sales, listed by Fuel type\n";
                    message += Sale.getTotalNumber() + " sales, totalling £"
                            + to2dp.format(Sale.getTotalValue()) + "\n";
                    for(Fuel f: fuels){
                        message += f.getName() + ":\n";
                        ArrayList<Sale> fSale = Sale.ofFuel(f, todaysSales);
                        for(Sale s: fSale){
                            message += s.getLitres() + " litres, cashier: "
                                    + s.getStaff().getName() + "\n";
                        }
                    }
                    System.out.println(message);
                    JOptionPane.showMessageDialog(null, message);
                    break;
                } //end case 7

                case '8': {// code for summarising sales by cashier
                    String message = "Summary of sales, listed by Cashier\n";
                    message += Sale.getTotalNumber() + " sales, totalling £"
                            + to2dp.format(Sale.getTotalValue()) + "\n";
                    for(Cashier c: cashiers){
                        message += c.getName() + ":"
                                + " number of sales: " + c.getNumberSales()
                                + " value of sales £" + to2dp.format(c.getTakings()) +"\n";
                        ArrayList<Sale> fSale = Sale.byCashier(c, todaysSales);
                        for(Sale s: fSale){
                            message += s.getLitres() + " litres of "
                                    + s.getFuel().getName() + "\n";
                        }
                    }
                    System.out.println(message);
                    JOptionPane.showMessageDialog(null, message);
                    break;
                } //end case 8

                case '0': // code executed when leaving the do-while statement
                {   String message = "Closing Sales Point \n"
                        + "Have a nice day!";
                    JOptionPane.showMessageDialog(null, message);
                    break;
                } //end case 0

                default:
                {    JOptionPane.showMessageDialog(null,
                            "Sorry, choice not recognised.");
                }
            } // end of switch
        }while(choice!='0');
    }

    // helper method?
    private static String printSales(ArrayList<Sale> in){
        String out = "";
        for(Sale s: in){
            out += s.toString() + "\n";
            System.out.println(s.toString());
        }
        return out;
    }

}
