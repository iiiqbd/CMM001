package javaLab05.Solns05;

import javax.swing.*;
import java.util.ArrayList;

public class ContactList{
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> numbers = new ArrayList<String>();
    String response="";
    int num;
    while(JOptionPane.showConfirmDialog(null,"Add a contact?")==0){ //0,1,2: "yes,no,cancel"
       response=JOptionPane.showInputDialog("Enter contact name");
       names.add(response);
       response=JOptionPane.showInputDialog("Enter contact number");
       numbers.add(response);
    }
    JOptionPane.showMessageDialog(null,printList(names,numbers));
  }

  static String printList(ArrayList<String> nam, ArrayList<String> num) {
    String output="";
    for (int i=0; i<nam.size(); i++) {
        output += (i+1) + " " + nam.get(i) + " " + num.get(i) + "\n"; }
    return output;
  }
}
