/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab06.LecEgs06;

/**
 *
 * @author Uche
 */
public class RGUContactTest {
  
  public static void main(String[] args) {
    
    RGUContact david = new RGUContact("Uche", "Adiele", true, "1234567");
    System.out.println(david);
    
    RGUContact casely = new RGUContact("Casely", "Adiele", false, "12345");
    System.out.println(casely);
    
    RGUContact.setEmailDomain("robertgordon.ac.uk");
    
    RGUContact john = new RGUContact("John", "Doe", true, "1234987");
    System.out.println(john);    
  }
    
}
