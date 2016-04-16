
package javaLab08.Solns08;

import java.util.Date;

public class Person {
    // instance data of Person class
    private String name;
    private Date birthday;
    private Address address;

 /**
 * Constructor creating a Person object, takes 4 parameters
 * @param n a String value used to initialise name property of Person object
 * @param d a Date object reference to associate with the birthday property of Person object
 * @param a an Address object reference to associate with the Address property of Person object
 */
    public Person(String n, Date d, Address a){
        name = n;
        birthday = d;
        address = a;
    }

 /**
 * Accessor method returning name property of Person object
 * @return     String representing name of of Person
 */
    public String getName(){
        return name;
    }


 /**
 * Accessors method returning birthdate property of Person object
 * @return     Date object representing date of birth of Person
 */
    public Date getBirthday(){
        return birthday;
    }

/**
 * Accessors method returning address property of Person object
 * @return     Address object representing address of birth of Person
 */
    public Address getAddress(){
        return address;
    }

/**
 * Accessors method returning age in years of Person object
 * @return     integer representing age of the Person
 * There will be MANY different ways of solving this problem
 * Simply using now.getYear()-birthday.getYear(); is fine
 * if date in the year now is after the birthday e.g. now 25 Oct, birthday 24 Apr
 * but given an answer one year out if the date in the year now is before 
 * the birthday e.g. now 23 Mar, birthday 24 Apr
 * So there has to be some fiddle if statements taking this into account.
 */
    public int getAge(){
        Date now = new Date();
        if(now.getMonth() > birthday.getMonth()){
            
            return now.getYear()-birthday.getYear();
        }
        else if((now.getMonth() == birthday.getMonth()) && (now.getDate() >= birthday.getDate()) ){
            return now.getYear()-birthday.getYear();
        }
        else{ 
            return now.getYear()-birthday.getYear() - 1;
        } 
    }

 /**
 * Returns String summarising properties of a Person object
 * @return a String object formed from name,
 *              getAge(), and string representation of address object
 */
    @Override
    public String toString(){
        String message =  name +
                " (age " + getAge() + ") " +
                address.getAddress();
        return message;
    }

 /**
 * void main method for simple testing of Person class functionality
 *
 */
    public static void main(String[] args){
        // Person constructor needs Date and Address objects
        // these can be saved as Date and Person objects e.g.
        Address rgu = new Address("108", "Garthdee Road", "Aberdeen", "AB10 7GJ");
        Date d1 = new Date(95,00,02);
        // then just pass object names to constructor
        Person david = new Person("David", d1, rgu);
        System.out.println(david.toString());

        // or the Date and Address parameters can be constructed
        // directly when calling the Person constructor
        Person scarlett = new Person("Scarlett Johansson",
                new Date(84,10,22),
                new Address("1234","Rodeo Drive", "Hollywood", "90210"));
        System.out.println(scarlett.toString());
   }

}
