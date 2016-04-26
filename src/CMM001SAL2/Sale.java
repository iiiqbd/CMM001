/* Sale.java - Sale class encapsulating properties of all Sale objects
 * Author: U. Adiele
 * Date: 15 Apr 2016
 */

package CMM001SAL2;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Sale {

  // object-level properties
  private Fuel fueltype;
  private double litres;
  private boolean discounted;
  private Cashier staff;

  // class-level properties
  private static double totalValue = 0.0;
  private static int totalNumber = 0;
  
  DecimalFormat to2DP = new DecimalFormat("0.00"); // to2DP.format

  // object and class methods

  // constructor
  public Sale(Fuel ft, double lts, boolean dsc, Cashier stf) {
    fueltype = ft;

    if(ft.getStock() < litres) {
      litres = ft.getStock();
    } else {
      litres = lts;
    }

    discounted = dsc;
    staff = stf;
    totalNumber++;
    totalValue += litres * fueltype.getPrice();
    // OR totalValue += this.getCost();
  } // end constructor

  // other object-level methods

  // getter
  public Fuel getFuel() {
    return fueltype;
  }

  // getter
  public double getLitres() {
    return litres;
  }

  // getter
  public boolean isDiscounted() {
    return discounted;
  }

  // getter
  public Cashier getStaff() {
    return staff;
  }

  // getter
  public double getCost() {
    if (isDiscounted()) {
      return getLitres() * getFuel().getPrice() * (1 - Fuel.getDiscount());
    } else {
      return getLitres() * getFuel().getPrice();
    }
  }
  
  // OR without taking acct of the discount 
//  public double getCost() {
//    return litres * fueltype.getPrice();
//  }

  // getter - toString method
  @Override
  public String toString() {
    return
    "Summary of sales, listed by Fuel type:\n"
    + Sale.getTotalNumber()
    + " sales, totalling "
    + to2DP.format(Sale.getTotalValue());
  }

  // class-level methods

  // class-level method
  public static double getTotalValue() {
    return totalValue;
  }

    // class-level method
  public static int getTotalNumber() {
    return totalNumber;
  }

  // class-level method
  public static ArrayList<Sale> byCashier(Cashier cashyr, ArrayList<Sale> sale) {
    ArrayList<Sale> temp = new ArrayList<>();   
    for (Sale item : sale) {
      if (cashyr.equals(item.getStaff())) {
        temp.add(item);
      }
    }
    return temp;
  }
  
//  public static ArrayList<Sale> byCashier(Cashier cashier, ArrayList<Sale> list) {
//    ArrayList<Sale> sublist = new ArrayList<>();   
//    for (Sale s : list) {
//      if (list.equals(cashier.getStaff())) {
//        sublistlist.add(s);
//      }
//    }
//    return sublist;
//  }
  

  // class-level method
  public static ArrayList<Sale> ofFuel(Fuel ftype, ArrayList<Sale> sale1) {
    ArrayList<Sale> temp1 = new ArrayList<>();  
    for (Sale item : sale1) {
      if (ftype.equals(item.getFuel())) {
        temp1.add(item);
      }
    }
    return temp1;
  }
  
  
//  public static ArrayList<Fuel> ofFuel(Fuel fuel, ArrayList<Sale> list) {
//    ArrayList<Sale> sublist = new ArrayList<>();   
//    for (Sale s : list) {
//      if (s.getFuel().equals(fuel)) {
//        sublist.add(s);
//      }
//    }
//    return sublist;
//  }  

} // end class Sale