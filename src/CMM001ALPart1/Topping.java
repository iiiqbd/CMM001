package CMM001ALPart1;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * @author David
 * @version 1.0 - May 2016
 * Topping class encapsulates properties associated with an individual
 * pizza topping. Toppings have a name, a cost and can be vegetarian or not. 
 */
public class Topping {
    
    // object-level properties of Topping object
    private String name;
    private double cost;
    private final boolean VEG;
    
    /** 
  * @value standardCost   class-level property representing the default cost 
  * of a Topping
  */
    private static double standardCost = 0.75;
    
    
    /**
 * Constructor for Topping object, cost initialised to standardCost
 * @param n    a String used to initialise name property  
 * @param v    a boolean used to initialise VEG property          
 */
    public Topping (String n, boolean v){
        name = n;
        cost = standardCost;
        VEG = v;
    }

    /**
 * Constructor for Topping object, cost initialised to standardCost
 * @param n    a String used to initialise name property  
 * @param v    a boolean used to initialise VEG property
 * @param c    a double used to initialise cost property
 */
    public Topping (String n, boolean v, double c){
        name = n;
        cost = c;
        VEG = v;
    }

    
    /**
 * object method that summarising the properties of a Topping object 
 * @return     a String: containing name, cost, and VEG status of Topping
 */
    @Override
    public String toString(){
        String message = "Topping name: " + name;
        message +=  ", cost: " + cost;
        message +=  ", vegetarian: " + VEG;
        return message;
    }

    /**
 * object method that returns the name of a Topping object 
 * @return     a String: equal to name property
 */
    public String getName(){
        return name;
    }

    /**
 * object method that returns the cost of a Topping object 
 * @return     a double: equal to cost property
 */
    public double getCost(){
        return cost;
    }

    /**
 * object method that indicates whether a Topping is suitable for vegetarians
 * @return     a boolean: equal to VEG property
 */
    public boolean isVeg(){
        return VEG;
    }

    /**
 * object method for setting the name associated with a Topping
 * @param      n a String used to set the name property 
 */
    public void setName(String n){
        name = n;
    }

    /**
 * object method for setting the cost associated with a Topping
 * @param      c a double used to set the cost property 
 */
    public void setCost(double c){
        cost = c;
    }
    
    /**
 * class-level method for setting the standardCost associated with a Topping class
 * @param      c a double used to set the standardCost property 
 */
    public static void setStandardCost(double c){
        standardCost = c;
    }
    
    
  /** ADDITIONAL METHOD - NOT ASKED FOR IN PART 1
 * class-level method for creating a text menu from a list of Topping objects
 * @param      list an ArrayList of Topping objects
 * @return     a String of vegetarian with one line per Topping object in the list
 *              presented in format [0] name £0.75 etc
 */
    public static String menu(ArrayList<Topping> list){
        String m = "";
        DecimalFormat dp = new DecimalFormat("0.00");
        for(int i = 0; i < list.size(); i++){
            m += "\n[" + i + "] " + list.get(i).getName() + " £" + dp.format(list.get(i).getCost()) + ""; 
        }
        return m;
    }

    /**
  * class-level main method containing some simple test code
  */
    public static void main(String[] args){
        Topping t1 = new Topping("Ham", false);
        Topping t2 = new Topping("Cheese", true); 
        Topping t3 = new Topping("Pepper", true); 
        Topping t4 = new Topping("Spicy Chicken", false, 1.25); 
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        
        System.out.println("\nTesting menu class-level method");
        ArrayList<Topping> testList = new ArrayList<Topping>();
        testList.add(t1); testList.add(t2); testList.add(t3); testList.add(t4);
        System.out.println(Topping.menu(testList));
       
    }
    
}
