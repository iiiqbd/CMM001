/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab05;
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author Uche
 */


public class ContactList_P3Q1B {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> numbers = new ArrayList<>();
    // String response = "";
    int num;
    while (JOptionPane.showConfirmDialog(null,"Add a contact?") == 0){
      String response = JOptionPane.showInputDialog("Enter contact name");
      names.add(response);
      response = JOptionPane.showInputDialog("Enter contact number");
      numbers.add(response);
    }
    JOptionPane.showMessageDialog(null, printList(names, numbers));
  } // end main
    static String printList(ArrayList<String > nm, ArrayList<String> num) {
      String output = "";
      for (int i = 0; i < nm.size(); i++) {
       output += (i + 1) + " " + nm.get(i) + " " + num.get(i) + "\n";
      }
      return output;
  } // end mthd printList

} // end class ContactList
