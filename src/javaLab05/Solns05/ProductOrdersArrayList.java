package javaLab05.Solns05;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class ProductOrdersArrayList{
  public static void main(String[] args) {

    ArrayList<String> products = new ArrayList<String>();
    ArrayList<Double> costs = new ArrayList<Double>();

    products.add("Pen    ");      costs.add(1.25);
    products.add("Paper  ");    costs.add(2.80);
    products.add("Diary  ");    costs.add(3.50);
    products.add("4GB USB");  costs.add(6.20);

    String response="";
    int code=0, num=0;
    double total=0.0;
    String menu = "Stockcode  Product    Unit Cost";
    DecimalFormat to2dp = new DecimalFormat("0.00");

    for(int i=0; i < products.size(); i++) {
      menu +=   "\n      " + i + "               " + products.get(i) + "         " + to2dp.format(costs.get(i));
    }

    do{
       code = Integer.parseInt(JOptionPane.showInputDialog(menu + "\n\n Enter a product code 0 to 3, or -1 to exit"));
       if( (code>=0) && (code < products.size()) ) {
         num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of " + products.get(code) + "s required"));
         total = costs.get(code)*num;
         JOptionPane.showMessageDialog(null, " Cost of " + num + " " + products.get(code) + "s is " + to2dp.format(total) );
       }
    }while(code!=-1);
  }
}
