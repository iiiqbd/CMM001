
package javaLab12_SAL1_FINAL;

/**
 * Class representing a staff member of technology retailer
 */
public class Staff {
    // instance variables of Staff class
    private final String NAME;  // represents staff member's name
    private final String ID;    // represents staff member's staff ID
    private double salesValue;  // represents value of sales made by staff member
    private int salesNumber;    // represent number of sales made by staff member
    private boolean manager;    // indicates whether staff member is of managerial level
    
 /**
 * Constructor creating a Staff object, takes 3 parameters
 * returns      a Staff object
 * @param n a String used to initialise NAME property of Staff object
 * @param id a String value used to initialise ID property of Staff object
 * @param m a boolean value used to initialise manager property of Staff object
 */
    public Staff(String n, String id, boolean m){
        NAME = n;
        ID = id;
        manager = m;
        salesNumber = 0;
        salesValue = 0.0;
    }

 /**
 * object method returning a String representing the name of Staff member
 * @return      String object equal to name property of Staff object
 */
    public String getName(){
        return NAME;
    }
 
 /**
 * object method returning the value of sales made by this Staff member
 * @return      double value equal to salesValue property of Staff object
 */
    public double getSalesValue(){
        return salesValue;
    }

  /**
 * object method returning the number of sales made by this Staff member
 * @return      int value equal to salesNumber property of Staff
 */
    public double getSalesNumber(){
        return salesNumber;
    }
    
 /**
 * object method returning a boolean value indicating if staff member is at managerial level
 * @return      boolean value equal to manager property of Staff object
 */
    public boolean isManager(){
        return manager;
    }


 /**
 * void object method that sets the manager property of Staff object 
 * @param m      a boolean value equal to true if Staff is a manager
 *                               equal to false if Staff is not a manager
 */
    public void setManager(boolean m){
        manager  = m;
    }

 /**
 * object method that checks the Staff ID against a String entered as the 
 * parameter and returns a boolean value if the String parameter matches the Staff ID 
 * @param id      a String representing an id to check against the ID of the Staff member
 * @return        a boolean value, true only if parameter equals staff ID
 */
    public boolean checkID(String id){
        return (ID.equals(id));
    }

 /**
 * void object method that adds details of a Sale to the cumulative salesNumber 
 * and salesValue properties of the Staff object 
 * @param sale     a Sale object representing a sales transaction made by Staff member
 */
    public void recordSale(Sale sale){
        salesNumber++;
        salesValue += sale.getCost();
    }    
    
 /**
 * object method that returns a String summarising properties of a Staff object
 * @return a String object formed from  name property, 
 *                                      ID property, 
 *                                      salesNumber property
 *                                      salesValue property
 *                                plus  message conditional on managerial status
 */
    @Override
    public String toString(){
        String message =  "name: " + NAME;
        message += ", ID: " + ID;
        message += ", number of sales: " + salesNumber;
        message += ", of total value: " + salesValue;
        if (manager) message += ", is a manager";
        return message;
    }
}
