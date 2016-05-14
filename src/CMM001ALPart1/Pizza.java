/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMM001ALPart1;

import java.util.ArrayList;

/**
 * @author David
 * @version 1.0 - May 2016
 * Pizza class encapsulates properties associated with an entire pizza
 * A Pizza class will be associated with:
 * - an Ingredients object (that in turn contains a name for the pizza style, 
 *    and the list of Toppings on the pizza)
 * - a Base object (representing the properties of the pizza base.
 * - a SIZE property that represents the diameter of the base/pizza, 
 *   and which is used to calculate the size
 */
public class Pizza {
    
    // object-level properties of pizza Base object
    private Base base;
    private Ingredients toppings;
    private final int SIZE; 

   /**
 * Constructor for a "build your own" pizza
 * @param s    an int representing the SIZE of the pizza 
 * @param b    a Base object representing the pizza base
 * "Empty" toppings list, with description"build your own"
 */
    public Pizza(int s, Base b){
        base = b;
        if(s<7) SIZE=7;
        else if(s>24) SIZE = 24;
        else SIZE = s;
        toppings = new Ingredients("Build your own");
    }
    

   /**
 * Constructor for a "Marguerita" pizza
 * @param s    an int representing the SIZE of the pizza 
 * Base object initialised as thin and non-crispy
 * "Empty" toppings list, with description "Marguerita", 
 * to which two ingredients are added using the addIngredient method
 */    
    public Pizza(int s){
        if(s<7) SIZE=7;
        else if(s>24) SIZE = 24;
        else SIZE = s;
        base = new Base("thin", false);
        toppings = new Ingredients("Marguerita");
        addTopping(new Topping("tomato",true));
        addTopping(new Topping("cheese",true));     
    }
    
  /**
 * object method that adds a Topping to the Ingredients of pizza 
 * @param     t Topping object: added to the toppings
 */
    public void addTopping(Topping t){
        toppings.addIngredient(t);
    }

   /**
 * object method that adds set of Toppings in an Ingredients object, to a pizza 
 * @param     r ingredients object: whose contents are added to pizza toppings
 */
    public void addToppings(Ingredients r){
        for (Topping t: r.getIngredients()){
            toppings.addIngredient(t);
        }
    }

  /**
 * object method that removes a Topping from the Ingredients of pizza 
 * @param     t Topping object: removed from the toppings
 */
    public boolean removeTopping(Topping t){
        return toppings.removeIngredient(t);
    }
    
    
  /**
 * object method that indicates whether ALL Toppings in pizza's ingredients are vegetarian
 * @return     a boolean that is true only of all Toppings are suitable for vegetarians
 */
    public boolean isVeggie(){
        return toppings.isVegetarian();
    }
    
   /**
 * object method that returns the cost of a pizza. It first uses the base 
 * and toppings to calculate the equivalent cost for a 7-inch pizza, and
 * scales that cost appropriately if the pizza is larger than 7 inches
 * @return     a double representing the cost of the pizza
 */   
    public double getPrice(){
        double c = Base.getCost() + toppings.getPrice();
        if(SIZE != 7){//not checking for less than 7
          c = c*SIZE/7.0;
        }
        
        return c;
    }
    
   /**
 * object method that returns the Ingredients associated with a pizza
 * @return     the toppings object of the pizza
 */    
    public Ingredients getIngredients(){
        return toppings;
    }
    
    
  /**
 * object method that summarises the description, base type, 
 * toppings and price of a pizza
 * @return     a String formed by applying relevant methods to the 
 * object properties of the pizza
 */
    @Override
    public String toString(){
        String message = SIZE + " inch " + toppings.getDescription() + ":\n";
        message += base.toString();
        message +=  toppings.listToppings();
        message += " £" + getPrice();
        return message;
    }

   /**
  * class-level main method containing some simple test code
  */
    public static void main(String[] args){
        Pizza p1 = new Pizza(7,new Base("thick",true));
        Pizza p2 = new Pizza(10,new Base("thin",true));
        Pizza p3 = new Pizza(14);
        
        p1.addTopping(new Topping("tomato",false));
        p1.addTopping(new Topping("ham",false));
        p1.addTopping(new Topping("olives",true));
        
        p2.addTopping(new Topping("tomato",false));
        p2.addTopping(new Topping("cheese",false));
        p2.addTopping(new Topping("pepperoni",false,2.00));
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        

    }
    
}
