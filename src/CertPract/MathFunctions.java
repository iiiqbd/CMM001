/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CertPract;

/**
 *
 * @author Uche
 */
public class MathFunctions {
  public static void addToInt(int x, int amountToAdd) {
    x = x + amountToAdd;
    System.out.println("x = " + x); // prints x by calling it within the method    
  }
  public static void main(String[] args) {
    int a = 15;
    int b = 10;
    float value = 102.0f; // or [float value = (float)102.0;] float value = 102.0; originally - loss of precision issue 
    MathFunctions.addToInt(a, b);
    System.out.println("a = " + a); // cannot print x as it is not visible here
  }

}
