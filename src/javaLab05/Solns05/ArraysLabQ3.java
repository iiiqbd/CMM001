package javaLab05.Solns05;

import javax.swing.*;
import java.util.Arrays;
public class ArraysLabQ3 {
  public static void main(String[] args) {

    int[] data = new int[5];

//    for(int i=0; i<data.length; i++) {
//      data[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter integer number " + i + " : "));
//    }
//
//    String output="";
//    for(int i=0; i<data.length; i++) {
//      output += data[i] + " ";
//    }
//    JOptionPane.showMessageDialog(null,output);


    /* to avoid the chance of NumberFormatException runtime errors
       in event that user enters a non-numeric input
       we could put the parseInt method inside a try-catch */

    for(int i=0; i<data.length; i++) {
      try {
        data[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter integer number " + (i+1) + " : "));
      }
      catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,"Sorry, that was not a number");
        i--;
      }
    }
    // Arrays.sort(data);
    String output2="";
    for(int i=0; i<data.length; i++) {
         output2 += data[i] + " ";
    }
    JOptionPane.showMessageDialog(null,output2);
  }//end of main()
} //end of ArraysLabQ3

