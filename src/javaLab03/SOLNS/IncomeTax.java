package javaLab03.SOLNS;

/*
 * IncomeTax.java
 */

import javax.swing.*;
/**
 * @author ge, updated by ia, updated by dpl (Oct 2015)
 */
public class IncomeTax{
    public static void main(String[] args){
        String strAnnualIncome;
        double annualIncome;
        double tax=0.0;

        strAnnualIncome = JOptionPane.showInputDialog(null,
                "what is your annual Income");
        annualIncome = Double.parseDouble(strAnnualIncome);
        
        /* all pound sterling symbols removed to suppress Netbeans error message */
        // 45% above 160600
        int limit40 = 160600;// 40% between 42385 and 160600
        int limit20 = 42385; // 20% between 10000 and 42385
        int limit0 = 10600;  // 0% on 10600 or lower

        if(annualIncome <= limit0){ // we could use actual number here, but easier to maintain code if we use variables
              tax = 0.0;
        }
        else if(annualIncome < limit20){
              tax = (annualIncome - limit0)*0.2;

        }
        else if(annualIncome < limit40){
              tax = (annualIncome - limit20)*0.4 + (limit20 - limit0)*0.2;
        }
        else{
              tax = (annualIncome - limit40)*0.45 + (limit40 - limit20)*0.4 + (limit20-limit0)*0.2;
        }

        JOptionPane.showMessageDialog(null,
                "the tax due on an income of " + annualIncome +
                "\n" + " is "+tax);
    } //end main

} // end IncomeTax
