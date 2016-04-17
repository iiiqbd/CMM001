/* Fuel.java
 * Author: U. Adiele
 * Date: 15 Apr 2016
 * Purpose: Fuel class encapsulating properties of all Fuel objects
 */

package CMM001AL2;


public class Fuel {
  
  // instance-level properties/variables
  private String name;
  private double pricePerLitre;
  private double stock;
  private double CAPACITY;
  
  // class-level property/variable
  private static double discount = 0.02;
  
  /* object-level methods - constructor(s), getters and setters  */
  
  // constructor
  Fuel (String nm, double ppl, double cap, double stk) {
    
    name = nm;
    
    if (ppl < 0.0) {
      pricePerLitre = 0.0;
    } else {
      pricePerLitre = ppl;
    }       
    
    if (cap < 0.0) {
      CAPACITY = 0.0;
    } else {
      CAPACITY = cap;
    }    
    
    if (stk > cap) {
      stock = cap;
    } else {
      stock = stk;
    }
    
  } // end constructor

  
  // setters and getters
  
  // setter - returns name of Fuel object
  public String getName() {
    return name;
  }
  
  // setter - modifies name of Fuel object
  public void setName(String nm) {
    name = nm;
  }
  
  // getter - returns price of Fuel object
  public double getPrice() {
    return pricePerLitre;
  }
  
    // setter - modifies price of Fuel object
  public void setPrice(double ppl) {
    pricePerLitre = ppl;
  }
  
  // getter - returns amount of fuel in stock
  public double getStock() {
    return stock;
  }
  
  // setter - refills the tank with fuel
  public void refill() {
    stock = CAPACITY;
  }
  
  // getter - returns max tank capacity
  public double getCapacity() {
    return CAPACITY;
  }
  
  // getter - returns amount of fuel in litres
  public void pumpFuel(double amount) {
    if (stock > amount) {
      stock -= amount;
    } else {
      stock = 0.0;
    }
  }
    
  // getter - toString method returns info about Fuel object
  @Override
  public String toString() {
    return "Fuel name: " + getName() + ", price: " + getPrice()
        + "stock: " + getStock() + ", tank capacity: " + getCapacity() + ".";
  }
  
  // class-level method
  public static double getDiscount() {
    return discount;
  }
  
    // class-level method
  public static void setDiscount(double disc) {
    discount = disc;
  }
  
} // end class Fuel
