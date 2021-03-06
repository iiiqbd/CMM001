/* Devices.java - Device class encapsulating the properties 
 *    of all Device objects as defined below.
 * Authors: F. Malik, N. Offorma, U. Egbue, & I. Adiele.
 * Date: 12 April 2016.
 */
package CMM001SAL1;


public class Device {
  
  // object-level properties
  private final String NAME; // final!
  private double basicCost;
  private int stock;
  
  // class level properties
  public static double cost64GB = 50.0;
  public static double cost128GB = 100.0;
  public static double cost256GB = 200.0;
  
  // constructor for creating new class objects
  public Device (String nm, double bc, int st) {
    NAME = nm;
    basicCost = bc;
    stock = st;
  }
  
  /* setter and getter methods section */
  // getter - acquires object name
  public String getName () {
    return NAME;
  }
  
  // setter - modifies basicCost property of each object
  public void setBasicCost (double basic) {
    basicCost = basic; 
  }
  
  // setter - returns stock level
  public int checkStock(){
    return stock; 
  }
  
  // setter - reduces stock level
  public void sell(){
    stock--;
  }
  
  // setter - increases stock level
  public void addStock(int stockPlus) {
    stock += stockPlus;
  }
  
  // getter - returns total cost of each device
  public double getCost(int mem) {
   double total = basicCost;
    switch (mem) {
      case 64:
        total += cost64GB;
        break;
      case 128:
        total += cost128GB;
        break;
      case 256:
        total += cost256GB;
        break;
      default:
        total += 0.0;
        break;
    }
   return total; 
  }
  
   /* getter - toString method returns formatted device info, with
      @Override annotation to used to hide toString superclass*/
    @Override
  public String toString() {
   String info =
     "Device name is "
     + NAME
     + ", basic cost = "
     + basicCost + ", " 
     + stock
     + " in stock.";
   return info;
  }  
  
  // setter - class-level method for modifying device prices
  public static void setMemoryPrices(double x, double y, double z) {
    cost64GB = x;
    cost128GB = y;
    cost256GB = z;
  }
  

} // end of class Device
