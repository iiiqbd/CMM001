/* Sale.java - Sale class encapsulating properties of all Sale objects
 * Author: U. Adiele
 * Date: 15 Apr 2016
 */

package CMM001SAL2;

import java.util.ArrayList;

public class Sale {

  // object-level properties
  private Fuel fueltype;
  private double litres;
  private boolean discounted;
  private Cashier staff;

  // class-level properties
  private static double totalValue = 0.0;
  private static int totalNumber = 0;

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
    totalValue += ft.getPrice();
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

  // getter - toString method
  @Override
  public String toString() {
    return getFuel()
      + ": "
      + "Volume left: "
      + getLitres()
      + ", Cashier: "
      + staff.getName()
      + "\n";
  }

  // class-level methods

  // class-level method
  public static double getTotalValue() {
    return totalValue;
  }

    // class-level method
  public static double getTotalNumber() {
    return totalNumber;
  }

  // class-level method
  public static ArrayList<Sale> byCashier(Cashier cashyr, ArrayList<Sale> sale) {
    for (Sale item : sale) {
      if (cashyr.equals(item.getStaff())) {
        sale.add(item);
      }
    }
    return sale;
  }

  // class-level method
  public static ArrayList<Sale> ofFuel(Fuel ftype, ArrayList<Sale> sale1) {
    for (Sale item : sale1) {
      if (ftype.equals(item.getFuel())) {
        sale1.add(item);
      }
    }
    return sale1;
  }

} // end class Sale