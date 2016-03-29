package javaLab03.Solns03;

/*
 * Vat.java
 *
 * Created on 17 October 2005, 12:53
 *
 */


import javax.swing.*;
/**
 * @author ge, updated by ia, updated dpl (Oct 2011)
 */
public class Vat{
    public static void main(String[] args) {
        String strCostOfItem;
        double costOfItem;
        String strNoOfItems;
        int noOfItems;
        String strVAT;
        char vatDue;
        double totalCost =0.0;

        // get cost, number and VAT status from user and convert
        strCostOfItem = JOptionPane.showInputDialog(null,
                "what is the cost of the single item");
        costOfItem = Double.parseDouble(strCostOfItem);
        strNoOfItems = JOptionPane.showInputDialog(null,
                "how many of these items do you wish to buy");
        noOfItems = Integer.parseInt(strNoOfItems);
        strVAT = JOptionPane.showInputDialog(null,
                "is this item subject to VAT, type y or n");
        strVAT = strVAT.toLowerCase();
        vatDue = strVAT.charAt(0);

        // calculate the cost
        if(vatDue =='y'){
            totalCost = noOfItems * costOfItem * 1.2;
        }
        else{
            totalCost = noOfItems * costOfItem;
        }
        //notice that we have not tided up our display of the double totalCost
        JOptionPane.showMessageDialog(null,
                "the total cost of " + noOfItems + " items is " + totalCost);
        // below can be used to achieve tidier code, though not very accurate
        System.out.printf("\nThe total cost of %d items is %.2f\n", noOfItems, totalCost);
    } //end main
} //end Vat
