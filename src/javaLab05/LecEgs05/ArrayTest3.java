/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab05.LecEgs05;

import java.util.Arrays;

/**
 *
 * @author Uche
 */
public class ArrayTest3 {
  
  public static void main(String[] args) {
    char[] initials = new char[2];
    String[] names = new String[] {"John", "James"};
    for (int i = 0; i < initials.length; i++) { // also used 'names.length'
      initials[i] = names[i].charAt(0);
    }
  System.out.println(Arrays.toString(initials));
  }
  
}
