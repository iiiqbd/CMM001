package javaLab11.SolnsSAL2;

import java.util.ArrayList;
import java.util.List;

 /**
 * Class encapsulating the details of a Sale of Fuel by a Cashier
 * uses Fuel and Cashier classes
 * @author David Lonie
 */
public class Sale {
    private Fuel fueltype;          // represents the type of Fuel being sold   
    private double litres;          // represents the volume of Fuel being sold
    private boolean discounted;     // represents whether customer is is a member of discount loyalty scheme
    private Cashier staff;          // represents the cashier who is processing the Sale of Fuel

  /**
 * @value totalValue     class variable representing total value of all Sales
 */
    private static double totalValue = 0.0; 
  /**
 * @value totalNumber     class variable representing total number of all Sales
 */
    private static int totalNumber = 0;

  /**
 * Constructor for Customer object, takes 4 parameters.
 * @param f    Fuel object representing the type of fuel being purchased,
 * @param l    double value representing the number of litres of fuel being purchased, 
 * @param d    boolean value representing whether this Sale is discounted,
 * @param c    Cashier object representing the member of staff processing the Sale
 */
    public Sale(Fuel f, double l, boolean d, Cashier c){
        fueltype = f;
        discounted = d;
        staff = c;
        if(fueltype.getStock()<l){
            litres = fueltype.getStock();   
        }
        else litres = l;
        totalNumber ++;
        totalValue += getCost(); 
    }

  /**
 * object method returning a Fuel object associated with this Sale
 * @return      Fuel object reference to fueltype property of this Sale
 */ 
    public Fuel getFuel(){
        return fueltype;
    }

  /**
 * object method returning the number of litres of fuel associated with this Sale
 * @return      double value equal to the litres property of this Sale
 */    
    public double getLitres(){
        return litres;
    }

  /**
 * object method returning the Cashier object that facilitated this Sale
 * @return      boolean value equal to the discounted property of this Sale
 */    
    public boolean isDiscounted(){
        return discounted;
    }
 
  /**
 * object method returning the Cashier object that processed this Sale
 * @return      Cashier object reference to staff property of this Sale
 */    
    public Cashier getStaff(){
        return staff;
    }
    
 /**
 * object method returning cost of a fuel sale 
 * @return      double value equal to cost of specified litres of fueltype, 
 * taking into account whether loyalty discount is applicable or not
 */
    public double getCost(){
        double c;
        if(discounted) c = fueltype.getPrice()*litres*(1-Fuel.getDiscount());
        else c = fueltype.getPrice()*litres;
        return c;
    }
   
 /**
 * object method that returns a String object summarising the properties of a Sale object  
 * @return     a String: in the format e.g.
 *             40 litres of fueltype  cashier: cashiername, or
 *             40 litres of fueltype  (with 2% discount) cashier: cashiername
 */
    @Override
    public String toString(){
        String message = litres + " litres of " 
                + fueltype.getName();
        if(discounted) message += " (with " + (Fuel.getDiscount()*100) + "% discount)";
        message += ", cashier: " + staff.getName();
        return message;
    }
    
 /**
 * class-level method for accessing the class-level totalValue property 
 * that represents the combined value of sales made by all Cashiers
 * @return     double value equal to the class-level variable totalValue
 */
  public static double getTotalValue(){
       return totalValue;
  }
   
 /**
 * class-level method for accessing the class-level totalNumber property 
 * that represents the combined number of sales made by all Cashiers
 * @return      double value equal discounted cost of l litres of this fuel
 */
  public static int getTotalNumber(){
       return totalNumber;
  }
  
 /**
 * class-level method that filters List of Sales and returns those 
 * associated with a specified Cashier
 * @return  List of Sale objects
 * @param   c  a Cashier object reference
 * @param   tList List of Sale objects
 */
  public static ArrayList<Sale> byCashier(Cashier c, ArrayList<Sale> tList){
      ArrayList<Sale> cList = new ArrayList<>();
      for(Sale t: tList){
          if(t.getStaff().equals(c)) cList.add(t);
      }
      return cList;
  } 
 
  
 /**
 * class-level method that filters List of Sales and returns those 
 * associated with a specified Fuel type
 * @return  List of Sale objects
 * @param   f  a Fuel object reference
 * @param   tList List of Sale objects
 */
  public static ArrayList<Sale> ofFuel(Fuel f, ArrayList<Sale> tList){
      ArrayList<Sale> fList = new ArrayList<>();
      for(Sale t: tList){
          if(t.getFuel().equals(f)) fList.add(t);
      }
      return fList;
  }
} // end of Sale.class
