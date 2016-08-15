package CMM001ALPart1;

import java.util.ArrayList;

/**
 * @author David
 * @version 1.0 - May 2016
 * Ingredients class encapsulates a list of pizza Toppings 
 * and its associated description 
 */
public class Ingredients {
    
    // object-level properties of pizza Ingredients object
    ArrayList<Topping> ingredients;
    String description;
    
    
   /**
 * Constructor for empty and un-named Ingredients list         
 */
    public Ingredients(){
        description = ""; // description to be supplied by user
        ingredients = new ArrayList<>(); // list to be filled by user
    }

   /**
 * Constructor for empty but named ingredients list
 * @param n    a String used to describe this list of ingredients       
 */
    public Ingredients(String n){
        description = n; // description to be supplied by user
        ingredients = new ArrayList<>(); // list to be filled by user
    }

    /**
 * Constructor for named Ingredients list filled with Toppings passed as parameter
 * @param n    a String used to select "thin" or "thick" base  ??
 * @param t    a ArrayList of Topping object to initialise to ingredients - original version (o.v.)
 * //          an ArrayList of Topping objects to initialise the ingredients - modified version (m.v.)
 */
    public Ingredients(String n, ArrayList<Topping> t){
        description = n;
        ingredients = t;
    }

    /**
 * object method that returns the description of the Ingredients 
 * @return     a String: equal to description property
 */    
    public String getDescription(){
        return description;
    }

    /**
 * object method that adds a Topping to the list associated with Ingredients 
 * @param     t Topping object: added to the ingredients ArrayList
 */
    public void addIngredient(Topping t){
        ingredients.add(t);
    }

    /**
 * object method to remove a Topping from the list associated with Ingredients 
 * @param     t Topping object: all instances to be removed from the ingredients ArrayList
 * @return    a boolean: true if Topping was in ingredients and was removed
 *                       false if Topping was not present in ingredients
 */
    public boolean removeIngredient(Topping t){
        return ingredients.remove(t);
    }
   
   /**
 * object method that returns a specific Topping from the ingredients list
 * @param      i an int representing the index of the required Topping
 * @return     a Topping object
 */
    public Topping getIngredient(int i){
        return ingredients.get(i);
    }

  /**
 * object method that returns an ArrayList of Toppings
 * @return     the arraylist property ingredients
 */
    public ArrayList<Topping> getIngredients(){
        return ingredients;
    }

  /**
 * object method that indicates whether ALL Toppings in ingredients list are vegetarian
 * @return     a boolean that is true only of all Toppings are suitable for vegetarians - o.v.
 * //          a boolean that is true only if all Toppings are suitable for vegetarians - m.v.
 */    
    public boolean isVegetarian(){
        for(Topping t: ingredients){
            if(t.isVeg() == false) { // alternatively if(!t.isVeg())
                return false;   
                // leaves loop, returning false as soon as any Topping is not vegetarian
            }
        }
        return true;
    }

   /**
 * object method that returns the total cost of all Toppings in the ingredients list
 * @return     a double calculated by summing cost of all toppings in ingredients
 */
    public double getPrice(){
        double c = 0.0;
        for(Topping t: ingredients){
            c += t.getCost();
        }
        return c;
    }

    /**
 * object method that lists all Toppings in the list in a convenient single line form
 * @return     a String formed by looping through the ingredients list 
 *              and applying getName to Topping object
 */
//    public String listToppings(){
//        String m = "[";
//        for(Topping t: ingredients){
//            m += t.getName() + ", ";
//        }
//        m += "\b\b]"; // \b - backspace
//        /* the 2 backspace escape xtrs remove the ',' and 'space' characters 
//        from the the end of the list thus leaving a neat output:
//        so in place of [Ham, Olives, Pepperoni, ] - without backspaces
//        we get         [Ham, Olives, Pepperoni] - with backspaces */        
//        return m;
//    }
    

    public String listToppings() {
        String m = "[";
        for(int i = 0; i < ingredients.size(); i++) {
          
          /* simple(r) alternative(s) to m += "\b\b]";  - option 1  - using an if statement */                    
//          if(i > 0) {
//              m += ", "; // else {m += "";} - implied but unnecessary, see conditional below
//          } // end if
          /* simple(r) alternative(s) to m += "\b\b]";  - option 2 – using a conditional */                      
          m += (i > 0) ? ", " : "";
          
          m += ingredients.get(i).getName();
        } // end for
        m += "]";
        return m;
    }
  

   /**
 * object method that lists all Toppings in the list in a multi-line style 
 * together with a descriptive heading
 * @return     a String formed from the description property of the Ingredients 
 *              object, then adding a line per Topping in the ingredients list
 */
//    @Override
//    public String toString(){
//        String m = description;
//        for(int i = 0; i < ingredients.size(); i++){
//            m += "\n[" + i + "] " + ingredients.get(i).getName();
//        }
//        return m;
//    }
    
//    @Override
//    public String toString(){
//        String m = description;
//        for (Topping item : ingredients) {
//          // (ingredients.indexOf(item) + 1)  ??
//          m += "\n[" + ingredients.indexOf(item) + "] " + item.getName();
//        }
//        return m;
//    }
    
    @Override
    public String toString(){
        String m = description;
        for (Topping item : ingredients) {
          // (ingredients.indexOf(item) + 1)  ??
          m += "\n[" + ingredients.indexOf(item) + "] " + item.getName();
        }
        return m;
    }    
    
    
   /**
 * a class-level method that filters a set of Toppings and returns 
 * a new set containing only vegetarian Toppings
 * @param      all an Ingredients object (that contains a list of Toppings)
 * @return     another Ingredients object (that contains a list of only vegetarian Toppings)
 */    
    public static Ingredients getVegIngredients(Ingredients all){
        Ingredients subList = new Ingredients("Vegitarian Toppings");
        for(Topping t: all.getIngredients()){
            if(t.isVeg()) {
              subList.addIngredient(t);
            }
        }
        return subList;
    }

   /**
  * class-level main method containing some simple test code
  */
    public static void main(String[] args){
        Ingredients all = new Ingredients("Available Ingredients:");
        
        System.out.println(all
          + " This list is empty - as \"all\" contains nothing for now\n");
        
        all.addIngredient(new Topping("Ham",false));
        all.addIngredient(new Topping("Olives",true));
        all.addIngredient(new Topping("Pepperoni",false));
        
        System.out.println(all);
        System.out.println();
        
        Ingredients veg = Ingredients.getVegIngredients(all);
        System.out.println(veg);
        
        // testing toString and listToppings methods
        System.out.println("\nList of all toppings in straight line (testing backspace functionality!)");
        System.out.println(all.listToppings());
        System.out.println("\nList of all toppings in multi-line format");
        System.out.println(all);
    }
}
