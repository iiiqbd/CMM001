package javaLab12_SAL1_FINAL;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dpl0795
 */
public class Cmm001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Staff cashier = null; // possible null-pointer error generator!
        Staff manager = new Staff("Manager","1234",true);

        Sale sale;
        ArrayList<Device> devices = new ArrayList<>();
        Device jPhone = new Device("jPhone", 500.00, 40);
        Device jPad = new Device("jPad", 250.00, 50);
        Device jNetbook = new Device("jNetbook", 700.00, 20);
        devices.add(jPhone);
        devices.add(jPad);
        devices.add(jNetbook);

        String devicelist = "";
        for(int i = 0; i < devices.size(); i++){
            devicelist += i + "  "
              + devices.get(i).getName() + "\n";
            System.out.println(devices.get(i).getName()
              + " " + devices.get(i).checkStock() 
              + " " + devices.get(i).getCost(32));
        }

        // create DecimalFormat object for displaying cash values to nearest £
        DecimalFormat to2dp = new DecimalFormat("0.00");

        String input; // local variable to hold user responses from menu
        char choice; // local variable on which to base switch cases
        int d;

        Device device;
        String salesRecord = "";
        Staff currentuser = manager;

        // create user menu to interact with Order called order
        do{ String menutext = "Current staff member logged in is: "
                + currentuser.getName() +
                "\n\nPlease select an option:\n" +
                "[1] Process a sale\n" +
                "[2] Check stock\n" +
                "[3] Add stock\n" +
                "[4] Display sales of " + currentuser.getName() + "\n" +
                "[5] Cashier log in\n" +
                "[6] Manager log in\n" +
                "[7] Summarise sales\n\n" +
                "[0] Exit ";
            input = JOptionPane.showInputDialog(menutext);
            choice = input.charAt(0);

            switch(choice){

                case '1': {// code for processing a sale
                    d = Integer.parseInt(JOptionPane.showInputDialog(
                      "Please select an item:\n" + devicelist));
                    try{
                        device = devices.get(d);
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,
                                "Not a recognised object\n"
                                + "Exception message given is: " 
                                + e.getMessage());
                        break;
                    }
                    int m = Integer.parseInt(JOptionPane.showInputDialog(
                            "Enter the memory required (32, 64, 128 or 256 GB):"));
                    if (m!= 64 && m!=128 && m!=256) m=32;
                    if(devices.get(d).checkStock() > 0){
                        sale = new Sale(devices.get(d),m);
                        currentuser.recordSale(sale);
                        //devices.get(d).sell();              // why is this not used?
                        JOptionPane.showMessageDialog(null,
                          devices.get(d).getName() + "  " + m
                            + "GB costing £" + sale.getCost()  );
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                          "Sorry insufficient in stock, only "
                           + devices.get(d).checkStock() + " in stock");
                    }
                    break;
                }

                case '2': {// code for showing stock list
                    String message = "";
                    for(int i = 0; i < devices.size(); i++){
                        message += devices.get(i).toString() + "\n";
                        System.out.println(devices.get(i).toString());
                    }
                    JOptionPane.showMessageDialog(null, message);
                    break;
                }

                case '3': {// code for adding stock
                    if(currentuser.isManager()){
                        d = Integer.parseInt(JOptionPane.showInputDialog(
                          "Please select an item:\n" + devicelist));
                        try{
                            device = devices.get(d);
                        }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(null,
                                    "Not a recognised object\n"
                                    + "Exception message given is: " + e.getMessage());
                            break;
                        }
                        int n = Integer.parseInt(JOptionPane.showInputDialog(
                          "Please enter the number of " + 
                            device.getName() + " added to stock:"));
                        device.addStock(n);
                        JOptionPane.showMessageDialog(null, n + " " 
                          + device.getName() + " added to stock.\nNow "
                                + device.checkStock() + " in stock");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                          "Sorry, only managers can add items to stock " );
                    }
                    break;
                }

                case '4': { // code for displaying sales of current user
                    String message = currentuser.getName() + " has sold "
                            + currentuser.getSalesNumber()
                            + " items sold with total value of "
                            + currentuser.getSalesValue();
                    JOptionPane.showMessageDialog(null, message );
                    break;
                }

                case '5':{ // code for new Cashier log in
                    if(currentuser == cashier) salesRecord += cashier.getName()
                            + " made " + cashier.getSalesNumber()
                            + " sales totalling £"
                            + to2dp.format(cashier.getSalesValue()) + "\n";
                    String name = JOptionPane.showInputDialog(
                            "Please enter your name: ");
                    String id = JOptionPane.showInputDialog(
                            "Please enter your staff ID:\n");
                    cashier = new Staff(name, id, false);
                    currentuser = cashier;
                }
                break;

                case '6':{ // code for Manager log in
                    String checkmanagerid = JOptionPane.showInputDialog(
                            "Enter manager id code: ");
                    if(manager.checkID(checkmanagerid)){
                        if(currentuser == cashier) salesRecord += cashier.getName()
                            + " made " + cashier.getSalesNumber()
                            + " sales totalling £"
                            + to2dp.format(cashier.getSalesValue()) + "\n";
                        currentuser = manager;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect manager id!!!");
                    }
                }
                break;

                case '7': {// code for summarising sales
                    String message = "Store has sold "
                            + Sale.getTotalNumber()
                            + " items sold with total value of "
                            + Sale.getTotalValue() + "\n";
                    if(currentuser.isManager()){
                        message += "Sales record for this sales session:\n"
                                + salesRecord + "\n"
                                + manager.getName() + " made " +
                                + manager.getSalesNumber() + " sales totalling £"
                                + to2dp.format(manager.getSalesValue());
                    }
                    JOptionPane.showMessageDialog(null, message );
                    break;

                }

                case '0': // code executed when leaving the do-while statement
                    if (currentuser == cashier) salesRecord += cashier.getName()
                            + cashier.getSalesNumber() + " Sales totalling £"
                            + to2dp.format(cashier.getSalesValue());

                    salesRecord += manager.getName() + " made "
                            + manager.getSalesNumber() + " sales totalling £"
                            + to2dp.format(manager.getSalesValue());

                    JOptionPane.showMessageDialog(null,
                        "Closing Sales Point \n"
                        + "Have a nice day!\n\n"
                        + "Summary of sales record for this sales session is:\n"
                        + salesRecord);
                    break;

                default:
                {    JOptionPane.showMessageDialog(null,
                            "Sorry, choice not recognised.");
                }
            } // end of switch
        }while(choice!='0');
    }

}
