/* Fuel.java - Fuel class encapsulating properties of all Fuel objects
 * Author: U. Adiele
 * Date: 15 Apr 2016
 */

package CMM001SAL2;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class Fuel {

  // instance-level properties/variables
  private String name;
  private double pricePerLitre;
  private double stock;
  private final double CAPACITY; // constants are always final

  // class-level property/variable
  private static double discount = 0.02;
  DecimalFormat to2DP = new DecimalFormat("0.00"); // to2DP.format

  /* object-level methods - constructor(s), getters and setters  */

  // constructor
  Fuel (String nm, double ppl, double stk, double cap) {

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

    if (stk > CAPACITY) {
      stock = CAPACITY;
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
    return name // return name
        + ":\n"
        + "\nCapacity = "
        + to2DP.format(stock) // stock
        + " litres.\nPrice = " 
        + to2DP.format(pricePerLitre) // pricePerLitre
        + " per litre.";
  }

  // class-level method
  public static double getDiscount() {
    return discount;
  }

    // class-level method
  public static void setDiscount(double disc) {
    discount = disc;
  }
  
  // main method to test 
  public static void main (String [] args) {
    Fuel f1 = new Fuel("Petrol", 99.9, 33000, 33000);
    Fuel f2 = new Fuel("Diesel", 102.3, 34000, 40000);
    //System.out.print(f1);
    
    ArrayList<Fuel> fuels = new ArrayList<>();
    fuels.add(f1);
    fuels.add(f2);
    
    for(Fuel f : fuels) {
      System.out.print(f);
    }
    
    
  }  

} // end class Fuel
