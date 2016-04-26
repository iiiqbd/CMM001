package cmm001;
 /** 
 * Class encapsulating properties of fuel sold by a filling station
 * Fuel class for CMM001 2014-15 Semester 2 Assessment
 * Author: David Lonie
 */

public class Fuel{
  // Instance variables
  private String name;            // name of fuel
  private double pricePerLitre;   // cost per litre of fuel in pounds
  private double stock;           // current stock of fuel in litres
  private final double CAPACITY;  // max capacity of filling station's fuel storage tank in litres
  
  /** 
   * @value discount   class-level property storing discount rate applied to
   * members of loyalty scheme for Fuel sales
   */
  private static double discount = 0.02;


  /**
 * Constructor for Fuel object, takes 4 parameters.
 * @param f    String object representing the name of the Fuel
 * @param p    double value representing the price per litre of this Fuel 
 * @param s    double value representing the initial stock of this Fuel in litres
 * @param c    double value representing the maximum capacity in litres  of the storage tank holding this fuel
 * Constraints are that pricePerLitre should be positive, CAPACITY should be positive, and
 * CAPACITY should be greater than or equal to stock 
 */
  public Fuel(String f, double p, double s, double c){
       name = f;
       if(p > 0) pricePerLitre = p;
       if(c > 0.0) {CAPACITY = c;}
       else { CAPACITY = 0.0;}

       if(s > CAPACITY) { stock = CAPACITY;}
       else if (s > 0) { stock = s; }
  }

  /**
 * object method returning name of the fuel
 * @return      String object equal to name property of this Fuel
 */
  public String getName(){
       return name;
  }
  
  /**
 * void object method for setting the price of this Fuel
 * @param   s double value to which name property is set
 */
  public void setName(String s){
     name = s;
  }
  
  /**
 * object method returning the price of the fuel
 * @return      double value equal to pricePerLitre property of this Fuel
 */
  public double getPrice(){
       return pricePerLitre;
  } 
  
  /**
 * void object method for setting the price of this Fuel
 * @param   p double value to which pricePerLitre property is set
 */
  public void setPrice(double p){
     pricePerLitre = p;
  }
  
  /**
 * object method returning the current volume of fuel left in the tank
 * @return      String object equal to stock property of this Fuel
 */
  public double getStock(){
       return stock;
  }

  /**
 * void object method used to fill the fuel storage tank to its maximum capacity
 * by setting stock property equal to CAPACITY property
 */
  public void refill(){
     stock = CAPACITY;
  }

  /**
 * object method returning the maximum capacity of the Fuel storage tank
 * @return      double value equal to CAPACITY property of this Fuel
 */
  public double getCAPACITY(){
       return CAPACITY;
  }
  /**
 * object method returning a text description of the Fuel object
 * @return      String object summarising Fuel name, pricePerLitre, stock, and tank CAPACITY
 */
  @Override
  public String toString(){
         return name  
                 + ":  Stock = " + stock 
                 + "  Capacity = " + CAPACITY
                 + "  Price = £" +  pricePerLitre + " per litre " ;
  }
  
  /**
 * object method modelling the removal of a specified volume of this Fuel 
 * from its storage tank 
 * @param       amount a double value representing the number of litres of Fuel requested
 * constraint is that stock should be greater than or equal to amount              
  */
  public void pumpFuel(double amount){
        if(stock >= amount) stock -= amount;
        else stock=0.0;
  }

  /**
 * class-level method returning the tax to be paid on Fuel
 * @param   d double value used to update the Fuel class property discount
 */
  public static void setDiscount(double d){
       discount = d;
  }

    /**
 * class-level method returning discount applicable to purchases made by 
 * members of the filling station loyalty scheme
 * @return      double value equal to the class-level property discount
 */
  public static double getDiscount(){
       return discount;
  }
} // end of Fuel.class