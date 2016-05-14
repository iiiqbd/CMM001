package CMM001ALPart1;

/**
 * @author David
 * @version 1.0 - May 2016
 * Base class encapsulates properties associated with a pizza base. 
 * Base can be "thick" or thin", and can be crispy or not.
 */
public class Base {
    
    // object-level properties of pizza Base object
    private final String TYPE;
    private boolean crispy;

    /** 
  * @value cost   class-level property representing the default cost of a 7-inch pizza base 
  * of a Topping
  */    
    private static double cost = 4.00;
    
   /**
 * Constructor for default (thin and non-crispy) Base object         
 */
    public Base(){
        TYPE = "thin";
        crispy = false;
    }

    /**
 * Constructor for bespoke pizza Base object
 * @param t    a String used to select "thin" or "thick" base  
 * @param c    a boolean used to initialise crispy property          
 */
    public Base(String t, boolean c){
        if(t.toLowerCase().equals("thick")) {
          TYPE = "thick"; // refer (should read "thick")
        }
        else {
          TYPE = "thin";
        }
        crispy = c;
    }

    /**
 * object method that returns the TYPE of a Base object 
 * @return     a String: equal to TYPE property
 */
    public String getTYPE(){
        return TYPE;
    }

    /**
 * object method that indicates whether a pizza Base is crispy or not
 * @return     a boolean: equal to crispy property
 */    
    public boolean isCrispy(){
        return crispy;
    }
 
   /**
 * object method for setting the crispy property to true
 */
    private void makeCrispy(){
        crispy = true;
    }

   /**
 * object method that summarising the properties of a Base object 
 * @return     a String: containing indication if crispy, and whether "thin" or "thick"
 */
    @Override
    public String toString(){
        String message = "";
        if(crispy) {
          message += "crispy ";
        }
        message += TYPE + " base";
        return message;
    }

   /**
 * class-level method that allows cost property to be updated
 * @param c     a double: used to change cost property of the class
 */
    public static void setCost(double c){
        cost = c;
    }
    
   /**
 * class-level method that returns the cost of all Base objects 
 * @return     a double: equal to cost class-level property
 */   
    public static double getCost(){
        return cost;
    }
    
    
   /**
  * class-level main method containing some simple test code
  */
    public static void main(String[] args){
        Base b1 = new Base("thin", false);
        Base b2 = new Base("thick", false);
        Base b3 = new Base("ThIn", true);
        Base b4 = new Base("thinner", true);
//        Pizza p = new Pizza(7,b1);
//        if (p.getPrice)
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
