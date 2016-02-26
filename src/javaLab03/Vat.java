/*
Write a Java application that can calculate the cost of an order for a number of identical
items. The requirements are that:
The user should be prompted for the following information:
· cost per item (as a double value)
· the number of items ordered (as an integer)
· whether the item is subject to Valued Added Tax (VAT) (as a char value ‘y’ or ‘n’)
The application should then calculate and display the cost of the order, adding VAT if
appropriate. [Note: when VAT is added it increases the cost by 20% (i.e. multiplies it by 1.2)]
 */
package javaLab03;

import javax.swing.JOptionPane;

/**
 *
 * @author 0303077
 */
public class Vat {
  public static void main(String [] args) {
    int noOfItems;
    double costPerItem, orderCost = 0.0;
    char vat;
    String items = JOptionPane.showInputDialog("Enter total no of items");
    noOfItems = Integer.parseInt(items);
    String cost = JOptionPane.showInputDialog("Enter cost of items in £");
    costPerItem = Double.parseDouble(cost);
    vat = JOptionPane.showInputDialog(null,
            "Enter VAT if applicable ('Y' or 'N'):").toUpperCase().charAt(0);
    if (vat == 'Y'){
      orderCost = costPerItem * noOfItems *  1.2;
    }
    else if (vat == 'N'){
      orderCost = costPerItem * noOfItems;
    } else {
      JOptionPane.showMessageDialog(null, "Please enter 'Y' or 'N' for vat rate");
    }
    if (noOfItems < 0 || costPerItem < 0.0) {
       JOptionPane.showMessageDialog(null, "Please enter positive numbers"); 
    }
    JOptionPane.showMessageDialog(null, "The total cost of your order was\n"
       + "£" + orderCost);
  }
}
