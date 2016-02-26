/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab02;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Uche
 */
public class TestIO {
  public static void main(String [] args) {
    System.out.print("Hello, say hello back: ");
    Scanner input = new Scanner(System.in);
    String text = input.nextLine();
    System.out.println(text);
    
    JOptionPane.showMessageDialog(null, "Fancy Hello!");
    
    JOptionPane.showInputDialog("say Hello!");


  }
}
