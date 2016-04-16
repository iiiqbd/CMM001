package javaLab08.Solns08;
/**
 * @author dpl
 * Address.java  Class encapsulating properties of a UK address
 */
public class Address {
    private String number;
    private String street;
    private String town;
    private String postcode;

 /**
 * Constructor creating a Person object, takes 4 parameters
 * @return      a Person object
 * @param n a String used to initialise number property of Address object
 * @param s a String used to initialise street property of Address object
 * @param t a String used to initialise town property of Address object
 * @param p a String used to initialise postcode property of Address object
 */
    public Address(String n, String s, String t, String p){
        number = n;
        street = s;
        town = t;
        postcode = p;
    }

 /**
 * Accessors method returning number property of Address object
 * @return     String representing house or flat number  
 */
    public String getNumber(){
        return number;
    }
    
 /**
 * Accessors method returning street property of Address object
 * @return     String representing street, road, avenue etc. of Address  
 */   
    public String getStreet(){
        return street;
    }

 /**
 * Accessors method returning town property of Address object
 * @return     String representing town, city, village etc. of Address  
 */ 
    public String getTown(){
        return town;
    }
    
 /**
 * Accessors method returning postcode property of Address object
 * @return     String representing postcode of Address  
 */
    public String getPostcode(){
        return postcode;
    }

 /**
 * Returns String summarising properties of a Adsress object
 * @return a String object in the format 
 * e.g. 123, John Street, Smithtown, AB12 3CD           
 */
    public String getAddress(){
        String message =  number + ", " + street +  ", " +
                            town + ", " + postcode;

        return message;
    }

 /**
 * void main method for simple testing of Address class functionality
 */
    public static void main(String[] args){
        Address david = new Address("123", "Union Street", "Aberdeen", "AB10 5XY");
        System.out.println(david.getAddress());
        Address scarlett = new Address("1234","Rodeo Drive", "Hollywood", "90210");
        System.out.println(scarlett.getAddress());
   }
}
