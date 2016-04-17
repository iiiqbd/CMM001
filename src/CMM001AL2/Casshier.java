/* Casshier.java - renamed due to persitent Netbeans duplicate class error.
 * Author: U. Adiele
 * Date: 15 Apr 2016
 * Purpose: Casshier class encapsulating properties of all Casshier objects
 */

package CMM001AL2;


public class Casshier {
  
  // object-level properties
  private String name;
  private String ID;
  private int numberSales;
  private double takings;
  
  
  // constructor
  public Casshier(String nm, String id) {
    name = nm;
    if (id.length() > 4)  {
      ID = id.substring (0, 3);
    }
    numberSales = 0;
    takings = 0.0;
  } // end constructor
  
  // other object-level methods - setters and getters
  
  // getter - returns cashier name
  public String getName() {
    return name;
  }
  
  // getter - returns cashier sales by number
  public int getNumberSales() {
    return numberSales;
  }
  
  // getter - returns cashier takings by monetary amount 
  public double getTakings() {
    return takings;
  }
  
  @Override
  public String toString() {
      return "Casshier's name: "
      + getName() + ": "
      + "ID number: " + ID
      + ", Number of sales: "
      + getNumberSales()
      + ". Value of sales: £" + getTakings() + "\n";
  }
  
  // setter - sales processing method
  public void processSale(Sale sale) {
    numberSales++;
    takings += sale.getCost();
  }
  
  // getter - checks ID of cashier
  public boolean checkID(String id) {
    return (ID.equals(id));
  }  
  

} // end class Casshier
