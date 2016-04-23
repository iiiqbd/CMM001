/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMM001SAL2GP;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Uche
 */
public class cmm001sal2gp_test {
  public static void main(String [] args){
    
//<editor-fold defaultstate="collapsed" desc="method variables">
Fuel petrol = new Fuel("petrol", 1.145, 32000, 50000);
Fuel diesel = new Fuel("diesel", 1.196, 41000, 50000);
Fuel hydrogen = new Fuel("hydrogen", 0.528, 15600, 25000);

ArrayList<Fuel> fuels= new ArrayList<>();
fuels.add(petrol);
fuels.add(diesel);
fuels.add(hydrogen);

ArrayList<Cashier> cashiers = new ArrayList<>();
Cashier manager = new Cashier("manager", "1234");
cashiers.add(manager);
Cashier currentcashier = manager;

ArrayList<Sale> todaysSales = new ArrayList<>();
//</editor-fold>
int userOption;
  do{
    String value = JOptionPane.showInputDialog("Cashier logged in is "+ currentcashier.getName()+"\n\n"+
          "Please select and option [1]-[8] or [0] to exit:\n\n"
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
      );
    userOption = Integer.parseInt(value);

    switch(userOption){
      //<editor-fold defaultstate="collapsed" desc="case1">
      case 1:
        int option1;
         do{
            option1 =Integer.parseInt (JOptionPane.showInputDialog("What type of fuel? [0]-[2]:\n\n"
            + "[0] "+petrol.getName()+"\n"
            + "[1] "+diesel.getName()+"\n"
            + "[2] "+hydrogen.getName()+"\n")
          );
       
          switch(option1){
            
            case 0:
              double liters = Double.parseDouble(
                  JOptionPane.showInputDialog("Enter number of liters of"
                  +petrol.getName())
                );
              char disc = 
                  JOptionPane.showInputDialog("Apply discount?[Enter y if yes]:"
                  ).toUpperCase().charAt(0);
              boolean isDisc = false;
              if (disc =='Y'){
                isDisc =true;
              }
              Sale sale1 = new Sale(petrol,liters,isDisc,currentcashier);
              
              break;
            case 1:
              break;
            case 2:
              break;
            default:
              break;
          }
        }while((option1 < 0)||(option1 > 2));
        break;
//</editor-fold>
        case 2:
        break;
        case 3:
        break;
        case 4:
        break;
        case 5:
        break;
        case 6:
        break;
        case 7:
        break;
        case 8:
        break;
        case 0:
          JOptionPane.showMessageDialog(null,"Closing Sale Point\n"+"Have a nice day!");
        break;
        default:
          JOptionPane.showMessageDialog(null,"Sorry chioce not recognized");
        break;

      }
    }while(userOption !=0);  
    
     
  }//end of main
  
}//end of class
