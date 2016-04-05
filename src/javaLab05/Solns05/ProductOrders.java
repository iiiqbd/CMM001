package javaLab05.Solns05;

import javax.swing.*;
import java.text.DecimalFormat;

public class ProductOrders{
  public static void main(String[] args) {
    String[] products = new String[] {"Pen", "Paper", "Diary", "4GB USB"};
    double[] costs = new double[] {1.25, 2.80, 3.50, 6.20};
    String response="";
    int code=0, num=0;
    double total=0.0;
    double sumTotal = 0; // added to enable calculation of total cost of goods
    String menu = "Stockcode  Product    Unit Cost";
    DecimalFormat to2dp = new DecimalFormat("0.00");

    for(int i=0; i < products.length; i++) {
      menu +=   "\n      " + (i+1) + "               " + products[i] + "         " + costs[i];
    }

    do{
       code = Integer.parseInt(JOptionPane.showInputDialog(menu + "\n\n Enter a product code (STRICTLY 0 to 3), or -1 to exit"));
       if( (code>=0) && (code < products.length) ) {
         num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of " + products[code] + "s required"));
         total = costs[code]*num;
         JOptionPane.showMessageDialog(null, " Cost of " + num + " " + products[code] + "s is " + to2dp.format(total) );
       }
    }while(code!=-1);
    // added to enable total cost of goods to be displayed
    sumTotal += total;
    JOptionPane.showMessageDialog(null, "\nThe total cost of goods purchased is: " + to2dp.format(sumTotal)); 
  }
}
