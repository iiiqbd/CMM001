/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab01.LecEgs01;

/**
 *
 * @author Uche
 */
public class MathTest {

  public static void main (String [] args) {
    System.out.println(Math.pow(2.0, 5));
    System.out.println( Math.exp(1.0) - Math.E );
    System.out.println(Math.E);
    System.out.println(Math.PI);
    int x = 10;
    int y = 20;
    int a = 10;
    int b = 20;    
    System.out.println(x + (y - x) * Math.random());
    
    System.out.println((int)( a + (b - a + 1) * Math.random()));
  }

}
