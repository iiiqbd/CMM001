package javaLab05.Solns05;

import javax.swing.*;
import java.util.ArrayList;

public class ArraysLabQ3ArrayList {
  public static void main(String[] args) {

    ArrayList<Integer> data = new ArrayList<Integer>();

    for(int i=0; i<3; i++) {
      int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter integer number " + (i+1) + " : "));
      data.add(number);
    }

    String output="";
    for(int i=0; i<data.size(); i++) {
      output += data.get(i) + " ";
    }
    JOptionPane.showMessageDialog(null,output);

  }//end of main()
} //end of ArraysLabQ3ArrayList

