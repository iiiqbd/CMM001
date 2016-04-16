package javaLab08.Solns08;

import java.util.ArrayList;

// Product class for CMM001 May2012 Assessment
// Author: David Lonie
// Date: May 2102

public class Product{
  // Instance variables
  private final int CODE;    // String containing product description
  private String name;       // double containing unit cost of product
  private double unitcost;        // in containing the current number of products

  // general Constructor (initialises all instance variables from 3 inputs)
  public Product(int code, String n, double price){
       CODE = code;
       name = n;
       unitcost = price;
  }



  /* Accessor method returning code of the Product
   * @return int equal to CODE property of Product
  */
  public int getCODE(){
       return CODE;
  }
  
  /* Accessor method returning the product name of the Product
   * @return String object equal to name property of Product
  */
  public String getName(){
       return name;
  }

  /* Accessor method returning the cost per item of the Product
   * @return double equal to unitcost property of Product
  */
  public double getUnitCost(){
       return unitcost;
  }

  /* method returning cost of multiple Products
   * @param number int representing the number of Products
   * @return double equal to number*unitcost of Product
  */
  public double getCost(int number){
        if(number>0) return number*unitcost;
        else return 0.0;
  }

  /* Setter method fos assigning new name to the Product
   * @param n int representing new name of Product
  */
  public void setName(String n){
      name = n;
  }

  /* Setter method fos assigning new name to the Product
   * @param price double representing new name of Product
  */
  public void setUnitCost(double price){
      unitcost = price;
  }
  
 /**
 * Returns String summarising properties of a Product object
 * @return a String object formed from CODE, name, unitcost of Product
 */
    @Override
    public String toString(){
        String message =  "Product code: " + CODE +
                "\t Product name: " + name +
                "\t Product cost: " + unitcost + " each";

        return message;
    }
    
      /**
 * void main method for simple testing of Product class functionality
 * 
 */
    public static void main(String[] args){
        Product usb = new Product(123, "usb stick", 9.95);
        System.out.println(usb.toString());
        ArrayList<Product> products = new ArrayList<>();
        
        products.add(new Product(0, "Pen", 1.25));
        products.add(new Product(1, "Pad of paper", 2.80));
        
       
        System.out.println(products.get(0).toString());
   }
  
}