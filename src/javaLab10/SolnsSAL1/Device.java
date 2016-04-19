package javaLab10.SolnsSAL1; // Solns to Sample Assessesd Lab 1

 /**
 * Class encapsulating type and stock number of electronic 
 * devices sold by a specialist retailer
 * @author dpl0795
 */
public class Device {
    // instance properties of Device objects 
    private final String NAME;  // brand name of the device
    private double basiccost;   // cost of device without memory upgrade
    private int stock;          // number of devices in stock

 /**
 * @value cost64GB     class variable representing cost of fitting 64GB of memory
 */
    private static double cost64GB = 50.00;
 /**
 * @value cost128GB     class variable representing cost of fitting 128GB of memory
 */
    private static double cost128GB = 100.00;
 /**
 * @value cost256GB     class variable representing cost of fitting 256GB of memory
 */
    private static double cost256GB = 200.00;
    
 /**
 * Constructor for Device object, takes 3 parameters.
 * @param n    String object representing the name of the type of device
 * @param c    double value representing the basic cost of the device 
 *              (where device no memory upgrade and so has has 32GB of memory) 
 * @param s    int value representing the initial number of devices in stock
 */
    public Device(String n, double c, int s){
        NAME = n;
        basiccost = c;
        stock = s;
    }
    
 /**
 * object method returning brand name of a Device
 * @return      String object equal to NAME property of this Device
 */
    public String getName(){
        return NAME;
    }
    
 /**
 * void object method allowing basic (no memory upgrade) 
 * cost of a Device to be changed
 * @param c      double value representing the new cost of this Device
 */
    public void setBasicCost(double c){
        basiccost = c;
    }
    
 /**
 * object method returning number of Devices in stock
 * @return      int value equal to stock property of this Device
 */    
    public int checkStock(){
        return stock;
    }
 /**
 * void object method that removes one item from stock when a Device is sold
 */
    public void sell(){
        stock -= 1;
    }
 
 /**
 * void object method allowing more Devices to be added to stock
 * @param n      int value representing the number of new Devices added to stock
 *               parameter n is added to instance value stock
 */
    public void addStock(int n){
        stock +=n;
    } 
    
    
 /**
 * object method returning the cost of a device taking any memory upgrades into account
 * @param memory      int value representing the GB of memory installed on the device
 * @return  a double value equal to the basiccost plus the cost of any memory upgrade
 */
    public double getCost(int memory){
        double cost = basiccost;
        if(memory == 64) cost += cost64GB;
        if(memory == 128) cost += cost128GB;
        if(memory == 256) cost += cost256GB;
        return cost;
    }
   

 /**
 * void class level method allowing cost of extra memory to be set
 * @param c64       int value representing the cost of 64GB memory
 * @param c128      int value representing the cost of 128GB memory
 * @param c256      int value representing the cost of 256GB memory
 */    
    public static void setMemoryPrices(double c64, double c128, double c256){
        cost64GB = c64;
        cost128GB = c128;
        cost256GB = c256;
    }   

 /**
 * object method that returns a String object summarising the properties of a Device object  
 * @return     a String: in the format:  device name, basic cost, number in stock
 *             e.g. Tablet, basic cost £250, 52 in stock
 *                  Laptop, basic cost £600, 12 in stock
 */    
    @Override
    public String toString(){
        String message = NAME;
        message += ", basic cost = " + basiccost;
        message += ", " + stock + " in stock: ";
        return message;
    }
}
