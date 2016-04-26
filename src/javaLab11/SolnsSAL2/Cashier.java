package javaLab11.SolnsSAL2;


import java.util.ArrayList;

 /** Class encapsulating id and sales properties of a filling station cashier
 * Cashier class for CMM001 2014-15 Semester 2 Assessment
 * Author: David Lonie
 */
public class Cashier{
    
  // Instance variables 
  private String name;      // name of the cashier
  private final String ID;  // staff code number of cashier  
  private int numberSales;  // number of fuel sales made by cashier
  private double takings;   // sales value of fuels sales mad by cashier
  
  
  /** Constructor takes 2 parameters (initialises all instance variables)
   * numberSales and takings properties of Cashier are initialised to zero
   * @param n   String representing name of cashier, used to initialise name
   * @param id  String representing id of cashier, used to initialise ID if 4 
   * characters 4 or less, otherwise only first 4 characters are used  
   */
  public Cashier(String n, String id){
    name = n;  
    numberSales = 0;
    takings = 0.0;   
    if(id.length() > 4) ID = id.substring(0, 4);
    else ID = id;
  }

 /**
 * object method returning the name of the Cashier
 * @return      String equal to the name property of this Cashier object
 */ 
  public String getName(){
       return name;
  }
  
 /**
 * object method returning the number of sales made by a Cashier
 * @return      int equal to the numberSales property of this Cashier object
 */
  public int getNumberSales(){
       return numberSales;
  }
  
 /**
 * object method returning the value of sales made by a Cashier
 * @return      double equal to the takings property of this Cashier object
 */
  public double getTakings(){
       return takings;
  }

 /**
 * object method returning a summary of the properties of a Cashier
 * @return      String formed from the values of the name, numberSales, takings 
 * and ID property of this Cashier object
 */
  public String toString(){
         return name + ": " 
                 + numberSales + " sales, total value £" 
                 + takings + ". Staff id num = " + ID;
  }
   
 /**
 * object method processing a Sale of fuel from the Cashier perspective
 * @param     s a Sale object reference, method adds 1 to number of sales made 
 * by this Cashier, and adds the cost of the fuel sale to the takings property 
 * of this Cashier
 */
  public void processSale(Sale s){
        numberSales++;         
        takings += s.getCost();
  }


 /**
 * object method checking whether a String equals the ID of a cashier 
 * @param     entered a String object reference
 * @return    a boolean equal to true of entered equals ID of this Cashier 
 * and false otherwise
 */
  public boolean checkID(String entered){
    return entered.equals(ID);
  }

} // end of Cashier.class