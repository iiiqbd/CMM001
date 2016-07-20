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
public class TestClass {
  public static void main(String[] args) {
  // Add test code here
 
  
//    float value1 = 102; // ok
//    float value2 = (int)102.0; // ok
//    float value3 = 1f * 0.0; // poss. lossy conversion
//    float value4 = 1f * (short)0.0; // ok
//    float value5 = 1f * (boolean)0; // forbidden: int to bool
//  
//  Add any print statements here
//  System.out.println("Hello World!");

        int x = 0;
        while(++x < 5) {
          x+=1;
        }

        //String message = (x > 5) ? "Greater than" : "Less Than";
        String message = x > 5 ? "Greater than" : "Less Than";

        System.out.println(message+","+x);
        //System.out.println(message+", " + x);


  }
}

