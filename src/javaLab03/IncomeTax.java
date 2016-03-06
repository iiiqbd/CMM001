package javaLab03;

import javax.swing.JOptionPane;

/*
 [IncomeTax.java]
UK income tax in the tax year 2015-16 was charged at the following rates:
· the first £10600 of annual income is not taxed
· income between £10600 and £42385 is taxed at 20%
· any income between £42385 and £160600 is taxed at 40%
· any income above £160600 is taxed at 45%
Implement a Java application, which will prompt the user for their annual
income (use double data type).
The program should calculate and output the amount of tax to be paid.
[Note that some programmers would avoid using the double type for currency,
and would work in pence using an int or long type to avoid rounding issues.
It makes little difference in this example]
 */

/**
 *
 * @author 0303077
 */
public class IncomeTax {
  public static void main(String[] args) {
    // TODO code application logic here
    double grossIncome, taxDue1 = 0.0, taxDue2 = 0.0, taxDue3 = 0.0;
    double netIncome = 0.0, totalTax = 0.0;
    String yourIncome = JOptionPane.showInputDialog("Please"
            + " enter your annual grossIncome in £");
    grossIncome = Double.parseDouble(yourIncome);

    if (grossIncome >= 0.0 && grossIncome < 10600) {
          JOptionPane.showMessageDialog(null, "Congrats, you are tax exempt!");
    }
    else if (grossIncome >= 10600 && grossIncome < 42385) {
      taxDue1 = 0.2 * grossIncome;
      netIncome = grossIncome - taxDue1;
      JOptionPane.showMessageDialog(null, "Your tax for the year is:\n"
      + "£" + taxDue1 + "\nYour net income is\n" + "£" + netIncome);
    }
    else if (grossIncome >= 42385 && grossIncome < 160600) {
      taxDue1 = 0.2 * (42385 - 10600);
      taxDue2 = 0.4 * (160600 - 42385);
      totalTax = taxDue1 + taxDue2;
      netIncome = grossIncome - totalTax;
      JOptionPane.showMessageDialog(null, "Your tax for the year is:\n"
      + "£" + totalTax + "\nYour net income is\n" + "£" + netIncome);
    }
    else {                  /*if (grossIncome > 160600) unnecessary here */
      taxDue1 = 0.2 * (42385 - 10600);
      taxDue2 = 0.4 * (160600 - 42385);
      taxDue3 = 0.45 * (grossIncome - 160600);
      totalTax = taxDue1 + taxDue2 + taxDue3;
      netIncome = grossIncome - totalTax;
      JOptionPane.showMessageDialog(null, "Your tax for the year is:\n"
      + "£" + totalTax + "\nYour net income is\n" + "£" + netIncome);
    }
  }    
}
