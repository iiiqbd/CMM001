package javaLab05.Solns05;

import javax.swing.*;
public class Towns{
  public static void main(String[] args) {

    String[] towns = new String[]{"Aberdeen","Dundee","Edinburgh","Glasgow","Inverness", "Perth"};
    int[][] distances = new int[][]{
                  {  0,  67, 125, 145, 105,  87},
                  { 67,   0,  79,  83, 138,  22},
                  {125,  79,   0,  46, 158,  44},
                  {145,  83,  46,   0, 171,  60},
                  {105, 138, 158, 171,   0, 113},
                  { 87,  22,  44,  60, 113,   0}};
    String menu="";
    int num1=0,num2=0;

    for(int i=0; i<6; i++) {
      menu += "[" + (i+1) + "] " + towns[i] + "\n";
    }

    do{
      num1 = Integer.parseInt(JOptionPane.showInputDialog(menu + "Enter a town 1-6, or 0 to exit"));
      if( (num1>=1) && (num1<=6) ) {
        num2 = Integer.parseInt(JOptionPane.showInputDialog(menu + "Enter a town 1-6"));
        if( (num2>=1) && (num2<=6) ) {
         JOptionPane.showMessageDialog(null,"Distance between " + towns[num1-1] + " and " +
                      towns[num2-1] +  " is " + distances[num1-1][num2-1] + " miles" );
        }
      }
    }while(num1!=0);
  }
}
