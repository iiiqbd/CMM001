package javaLab05.Solns05;

import javax.swing.*;
import java.util.ArrayList;

public class WordsArrayList{
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> numbers = new ArrayList<String>();
    String response="";
    int num;
    while(JOptionPane.showConfirmDialog(null,"Add a contact?")==0){
       response=JOptionPane.showInputDialog("Enter contact name");
       names.add(response);
       response=JOptionPane.showInputDialog("Enter contact number");
       numbers.add(response);
    }
    JOptionPane.showMessageDialog(null,printList(names,numbers));

    do{
     num = Integer.parseInt(JOptionPane.showInputDialog(
                    printList(names,numbers) + "\nEnter an index to change a number, or -1 to quit"));
     if( (num >= 0) && (num < names.size()) ) {
         response = JOptionPane.showInputDialog("Enter a new number for " + names.get(num));
         numbers.set(num,response);
     }
    }while(num!=-1);

      names.clear();

        System.out.println( names.toString() );
        // prints []

        System.out.println( names.size() );
    // prints 0
  }

  static String printList(ArrayList<String> nam, ArrayList<String> num) {
    String output="";
    for (int i=0; i<nam.size(); i++) {
        output = output + (i) + " " + nam.get(i) + " " + num.get(i) + "\n"; }
    return output;
  }
}
