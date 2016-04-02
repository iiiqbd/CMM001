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
public class DateTest {

  public static void main(String[] args) {
    
    Date einsteinsBirthday = new Date(14, 3, 1879);
    
    Date today = new Date(31, 03, 2016);
    
    System.out.println(today); // replaced 'today.toString()' with 'today'
    
    System.out.println(einsteinsBirthday);
  }
}
