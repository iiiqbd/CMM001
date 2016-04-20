/* Cashier.java - Cashier class encapsulating properties of all Cashier objects
 * Author: U. Adiele
 * Date: 15 Apr 2016
 */

package CMM001SAL2;

import java.text.DecimalFormat;


public class Cashier {

  // object-level properties
  private String name;
  private String ID;
  private int numberSales;
  private double takings;
  
  DecimalFormat to2DP = new DecimalFormat("0.00"); // to2DP.format


  // constructor
  public Cashier(String nm, String id) {
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
      return this.getName()
      + "'s fuel sales on current shift:\n"
      + this.getNumberSales()
      + " of total value £"
      + to2DP.format(this.getTakings())
      + "\n";
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


} // end class Cashier
