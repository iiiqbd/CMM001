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
public class Person {
  private String name;
  private int birthYear;
  public Person (String n, int y) {
    name = n;
    birthYear = y;
  }
  public String getName() {
    return name;
  }
  public void setName (String n) {
    name = n;
  }
  public int getAge(int now) {
    return now - birthYear;
  }
  
}
