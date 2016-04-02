package javaLab05.Solns05;

import javax.swing.*;
public class Words{
  public static void main(String[] args) {
    String[] words = new String[5];
    String response="";
    int num=0;
    do{
       response=JOptionPane.showInputDialog("Enter a Word");
       words[num] = response;
       num++;
    }while(!( response.equals("end")||(num>=words.length) ));

    printWords(words);

    do{
       num = Integer.parseInt(JOptionPane.showInputDialog("Enter an index, or -1 to quit"));
       if( (num>=0) && (num<words.length) ) {
         response = JOptionPane.showInputDialog("Enter a new word");
         words[num] = response;
         printWords(words);
       }
    }while(num!=-1);
  }

  public static void printWords(String[] array) {
    String output="";
    for (int i=0; i<array.length; i++) {
        output = output + (i)+ " " + array[i] + "\n"; }
    JOptionPane.showMessageDialog(null, "Words are:\n" + output);
  }
}
