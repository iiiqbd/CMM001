/* Sales.java
 * Authors: F. Malik, N. Offorma, U. Egbue, & I. Adiele.
 * Date: 12 April 2016.
 * Purpose: Sales class encapsulating the properties of all Sales objects
 *   as defined below.
 */
package CMM001AL1;


public class Sale {
  
  // object-level properties
  private Device device;
  private int memory;
  
  //class-level properties
  private static double totalValue = 0.0;
  private static int totalNumber = 0;

  // constructor for creating new Sale objects
  public  Sale (Device dev, int mem) {
    // device reference parameter assigned to relevant class property
    device = dev;
    
    // switch statement assigns relevant memory types to memory property of object
    switch (mem) {
      case 64:
        memory = mem;
        break;
      case 128:
        memory = mem;
        break;
      case 256:
        memory = mem;
        break;
      default:
        memory = 32;
        break;
    }
    totalNumber++;
    device.sell();
    totalValue += this.getCost();
  } // end Sale constructor
  
  // getter
  public double getCost() {
    return device.getCost(memory);    
  }

  // getter
  public Device getDevice() {
    return device;
  }
  
  // getter
  public int getMemory() {
    return memory;
  }
  
  // getter
  @Override
  public String toString() {
    String info = "Device name is " + device.getName() + " with memory of  " + getMemory() + "GB";
    return info;
  }
  
  // getter
  public static double getTotalValue() {
    return totalValue;
  }
  
  // getter
  public static int getTotalNumber() {
    return totalNumber;
  }

} // end of class Sale