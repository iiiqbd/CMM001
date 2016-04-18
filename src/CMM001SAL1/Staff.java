/* Staff.java
 * Authors: F. Malik, N. Offorma, U. Egbue, & I. Adiele.
 * Date: 12 April 2016.
 * Purpose: Staff class encapsulating the properties of all Staff objects
 *   as defined below.
 */
package CMM001SAL1;


public class Staff {
  private String NAME;
  private String ID;
  private double salesValue;
  private int salesNumber;
  private boolean manager;
  
  // constructor
  public Staff(String nm, String id, boolean mng){
    NAME = nm;
    ID = id;
    manager = mng;
    salesValue = 0.0;
    salesNumber = 0;
  }
  
  // getter
  public String getName() {
    return NAME;
  }
  
  // getter
  public double getSalesValue() {
    return salesValue;
  }
  
  // getter
  public int getSalesNumber() {
    return salesNumber;   
  }
  
  // setter
  public boolean isManager() {
    return manager;
  }
  
  // setter
  public void setManager(boolean mgr) {
  manager = mgr;
  }
  
  // getter
  @Override
  public String toString() {
   String summary = "Staff name is  " + getName()
       + " with an ID  "+ ID + " and a sales value of " 
       + "\n" + getSalesValue() + " and a total of " 
       + getSalesNumber() + " sales."
       + " Mangerial status:" + isManager();
    return summary;
  }
  
  // getter
  public boolean checkID(String check){
    return (check.equals(ID));
  }
  
  // setter
  public void recordSale(Sale rec){
    salesNumber++;
    salesValue += rec.getCost();
  }
  
} // end of class Staff