package javaLab03;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0303077
 */
public class IncomeTax_1 {
  public static void main(String[] args) {
    // TODO code application logic here
    double income, taxBand1 = 0.0, taxBand2 = 0.0, taxBand3 = 0.0;
    double rate1 = 0.2, rate2 = 0.4, rate3 = 0.45;
    String yourIncome = JOptionPane.showInputDialog("Please"
            + " enter your annual income in £");
    income = Double.parseDouble(yourIncome);
    taxBand1 = income * rate1;
    taxBand2 = income * rate2;
    taxBand3 = income * rate3;
    if (income < 10600) {
      JOptionPane.showMessageDialog(null, "Congrats, you are tax exempt!");
    }
    else if (income >= 10600 || income < 42385) {
      JOptionPane.showMessageDialog(null, "Your tax for the year is:\n"
      + taxBand1);
    }
    else if (income >= 42385 || income <= 160600) {
      JOptionPane.showMessageDialog(null, "Your tax for the year is:\n"
      + taxBand2);
    }
    else if (income > 160600) {
      JOptionPane.showMessageDialog(null, "Your tax for the year is:\n"
      + taxBand3);
    }
    else {
      JOptionPane.showMessageDialog(null, "Please enter a valid income"
            + " - not less than £0.0");
    }
  }    
}
