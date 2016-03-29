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
public class PersonTest {
  public static void main(String [] args) {
    Person david = new Person("David", 1970);
    System.out.println("I am " + david.getName());
    // david.getAge(2016);
    System.out.println("I am " + david.getAge(2016) + " years old.");
    david.setName("Enoch");
    System.out.println("My new name is " + david.getName());    
  }
}
