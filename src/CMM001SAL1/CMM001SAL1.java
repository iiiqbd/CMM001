/* CMM001SAL1.java
 * Authors: F. Malik, N. Offorma, U. Egbue, & I. Adiele.
 * Date: 12 April 2016.
 * Purpose: Class for testing the functionality and 
 *   methods of Device, Staff and Sale objects.
 */
package CMM001SAL1;

import javax.swing.JOptionPane;


public class CMM001SAL1 {

  public static void main(String[] args) {
    
    Device jphn = new Device("jPhone", 500, 40);
    Device jpad = new Device("jPad", 250, 50);
    Device jbook = new Device("jNetbook", 700, 20);
    Staff manager = new Staff("Manager", "1234", true);
    Staff cashier = new Staff (null, null, false);
    Staff currentuser = new Staff("Manager", null, true);
    String salesRecord = "";
    char choice; // user's choice       
    
    do {
      String response = JOptionPane.showInputDialog("Current staff Member logged in is: "
          + currentuser.getName()
          + "\n"
          + "\nPlease select an option:\n"
          + "[1] process a sale\n"
          + "[2] Check stock\n"
          + "[3] Add Stock\n"
          + "[4] Display Sales Of"
          + currentuser.getName() + "\n"
          + "[5] Cashier log in\n"
          + "[6] Manager log in\n"
          + "[7] Summarise Sales\n\n"
          + "[0] Exit\n");
      choice = response.charAt(0);
    switch (choice) {
      //<editor-fold defaultstate="collapsed" desc="Case 1: Process a sale">
      case '1': // process a sale
        int d = Integer.parseInt(JOptionPane.showInputDialog(
            "Please select an item:\n" +
            "0 " + jphn.getName() + "\n" +
            "1 " + jpad.getName() + "\n" +
            "2 " + jbook.getName()));
        int m = Integer.parseInt(JOptionPane.showInputDialog(
            "Enter the memory required (32, 64, 128 or 256GB:)"));
        switch (d) {
          case 0:
            if (jphn.checkStock() > 0) {
              Sale sale1 = new Sale(jphn, m);
              currentuser.recordSale(sale1);
              JOptionPane.showMessageDialog(null, sale1.toString()
                + " With a cost of: £" + jphn.getCost(m));
            }
            break;
          case 1:
            if (jpad.checkStock() > 0) {
              Sale sale1 = new Sale(jpad, m);
              currentuser.recordSale(sale1);
              JOptionPane.showMessageDialog(null, sale1.toString()
                + " With a cost of: £" + jpad.getCost(m));
            }
            break;
          case 2:
            if (jbook.checkStock() > 0) {
              Sale sale1 = new Sale(jbook, m);
              currentuser.recordSale(sale1);
              JOptionPane.showMessageDialog(null, sale1.toString()
                + " With a cost of: £" +  jbook.getCost(m));
            }
            break;
          default:
            JOptionPane.showMessageDialog(null, "Sorry there is no stock.");
            break;
        } //  end switch(d)
        break;
//</editor-fold>
      //<editor-fold defaultstate="collapsed" desc="case 2 check stock">
      case '2': // check stock
        JOptionPane.showMessageDialog(null, jphn.toString() + "\n"
            + jpad.toString() + "\n" + jbook.toString());
        break;
//</editor-fold>
      //<editor-fold defaultstate="collapsed" desc="case 3 add stock">
      case '3': // add stock
        //<editor-fold defaultstate="collapsed" desc="if checking if currentuser=manager">
        if (currentuser.isManager()) {
          int e = Integer.parseInt (
            JOptionPane.showInputDialog("Please select an item\n" +
              "0 " + jphn.getName() + "\n"+
              "1 " + jpad.getName() + "\n"+
              "2 " + jpad.getName()));
          
          int n;
          switch (e) {
            
            //<editor-fold defaultstate="collapsed" desc="case 0 adding to jphn stock">
            case 0:
              n = Integer.parseInt (
                JOptionPane.showInputDialog("Please enter the number of "
                  + jphn.getName() + " to be added to stock"));
              if(n > 0){
                jphn.addStock(n);
              } else {
                JOptionPane.showMessageDialog(null, "Negative Stock entry not acceptable");
              }
              break;
              //</editor-fold>
              //<editor-fold defaultstate="collapsed" desc=" case 1 adding to gadget 2 stock">
            case 1:
              n = Integer.parseInt (
                JOptionPane.showInputDialog("Please enter the number of "
                  + jpad.getName() + " to be added to stock")
              );
              if(n > 0){
                jpad.addStock(n);
              } else {
                JOptionPane.showMessageDialog(null, "Negative stock entry not acceptable");
              }
              break;
              //</editor-fold>
              //<editor-fold defaultstate="collapsed" desc="case 2 adding to gadget 3 stock">
            case 2:
              n = Integer.parseInt (
                JOptionPane.showInputDialog("Please enter the number of "
                  + jbook.getName() + " to be added to stock")
              );
              if(n > 0){
                jbook.addStock(n);
              } else {
                JOptionPane.showMessageDialog(null, "Negative Stock entry not acceptable");
              }
              break;
              //</editor-fold>
          }
          
        }
        else {
          JOptionPane.showMessageDialog(null, "Sorry, only managers can add items to stock.");
        }
//</editor-fold>
        break;
//</editor-fold>
      //<editor-fold defaultstate="collapsed" desc="case 4 display currents users' sales">
      case '4': // display currents users' sales
        JOptionPane.showMessageDialog(null, currentuser.getName() + " has sold "
          + currentuser.getSalesNumber() + " items with total value of "
          + currentuser.getSalesValue());
        break;
      
      case '5': // cashier log in
        
        // if stmt to determine which staff object type is logged in
        if (!currentuser.isManager()) {
            salesRecord += currentuser.getName() + " made " + currentuser.getSalesNumber() + 
            " sales totalling £" + currentuser.getSalesValue() + "\n";          
        }
        // currentuser = cashier;        
        String nem = JOptionPane.showInputDialog("Please enter your name:");
        String s_id = JOptionPane.showInputDialog("Please enter your staff ID:");
        Staff cashier1 = new Staff(nem, s_id, false);
        currentuser = cashier1;
        break;
        
      case '6': // manager log in
        String m_id = JOptionPane.showInputDialog("Enter manager id code:");     
        if(manager.checkID(m_id)) {
          if (!currentuser.isManager()) {
          salesRecord += currentuser.getName() + " made " + currentuser.getSalesNumber() + 
              " sales totalling £" + currentuser.getSalesValue() + "\n";
          }
        
        currentuser = manager;
        } else {
          JOptionPane.showMessageDialog(null, "Incorrect manager id!!!");
        }
        
        break;
        
      case '7': // summarise sales
        if (currentuser.isManager()) {
          JOptionPane.showMessageDialog(null, "Store has sold " + Sale.getTotalNumber() 
              + " items with total value of " + Sale.getTotalValue()
          + "\nSales record for this session:\n"
          + salesRecord
          + "\n\n"
          + manager.getName() + " has sold "
          + manager.getSalesNumber() + " items with total value of "
          + manager.getSalesValue());          
          
        } else {
          JOptionPane.showMessageDialog(null, "Store has sold " + Sale.getTotalNumber() 
              + " items with total value of " + Sale.getTotalValue());
        }
        break;
      
      case '0': // system state summary and exit
        if (currentuser.equals(cashier)) {
        salesRecord += currentuser.getName() + " made " + currentuser.getSalesNumber() + 
            " sales totalling £" + currentuser.getSalesValue() + "\n";          
        }
        salesRecord +=
            manager.getName() + " made "
          + manager.getSalesNumber() + " sales totalling " 
          + manager.getSalesValue();
        JOptionPane.showMessageDialog(null, "Closing Sales Point\n"
          + "Have a nice day!\n\n"
          + "Summary of sales record for this sales session is:\n"
          + salesRecord        
        );
        break;        
//</editor-fold>
      default:
        JOptionPane.showMessageDialog(null, "Sorry, choice not recognised.");
        break;        
      } // end switch (choice)

    } while(choice != '0');
    
  } // end main method

} // end class CMM001SAL1
