/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab03;

import javax.swing.JOptionPane;

/**
 *
 * @author Uche
 */
public  class TwoInegers2 {
  public static void main(String [] args)
  {
    int num1, num2;
    String myString1, myString2;

    myString1= JOptionPane.showInputDialog(null," Enter Integer Value 1");
    num1= Integer.parseInt(myString1);
    myString2 = JOptionPane.showInputDialog(null," Enter Integer Value2");
    num2= Integer.parseInt(myString2);

    if(num1 >=0 && num2 >=0)
    {
      JOptionPane.showMessageDialog(null," Both Are Positive");
    }

    if(num1 <0 && num2 <0)
    {
      JOptionPane.showMessageDialog(null," Both Are Negative");
    }
    if(num1 <0 && num2 >=0)
    {
      JOptionPane.showMessageDialog(null," One  Negative,  One Positive");
    }
    if(num1 >=0 && num2 <0)
    {
      JOptionPane.showMessageDialog(null," One  Positive,  One Negative");
    }
  }
}
