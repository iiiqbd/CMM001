/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab05_Extra;

/**
 *
 * @author 0303077
 */
public class Example_1 {

  public static void main(String[] args) 
  { 
    int a = 25, b = 0; 
    try 
    { 
      System.out.println(a / b); 
    } 
    catch(ArithmeticException e) 
    { 
      System.out.println("don't be silly");
      System.out.println(e.getMessage()); 
      System.out.println(e.getCause()); 
      System.out.println(e.toString()); 
      e.printStackTrace(); 
    } 
  } 
} //end class