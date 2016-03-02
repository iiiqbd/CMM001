/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab05;

/**
 *
 * @author 0303077
 */
public class Lab05_Part1_Q2 {
  
  public static void main(String[] args) {
    int[] data = new int[] {40, -2, 12, 56, 0, 12};
    
    System.out.println("data.length-1 = " + ((data.length)-1));
    
    System.out.println("data.length = " + data.length);
    
    
    /* ArrayIndexOutOfBoundsException */
//    System.out.println("data[6] = " + data[6]);
    System.out.println("data[5] = " + data[5]);
    
    System.out.println("data[3] = " + data[3]);
    
    System.out.println("data[0] = " + data[0]);
  }
    
}
