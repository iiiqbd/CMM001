package javaLab03.Solns03;

import javax.swing.*;
/**
 * @author  dpl (Oct 2012)
 * Quadratic.java
 */
public class Quadratic{
    public static void main(String[] args){
        String strUser;
        double a,b,c,determinant,x1,x2;

        // get numbers a,b,c representing quadratic ax^2+bx+c=0
        strUser = JOptionPane.showInputDialog(null,
                "what is the number a in ax^2+bx+c=0");
        a = Double.parseDouble(strUser);
        strUser = JOptionPane.showInputDialog(null,
                "what is the number b in ax^2+bx+c=0");
        b = Double.parseDouble(strUser);
        strUser = JOptionPane.showInputDialog(null,
                "what is the number c in ax^2+bx+c=0");
        c = Double.parseDouble(strUser);

        determinant = b*b-4*a*c;

        // calculate the cost
        if(a == 0.0){
          JOptionPane.showMessageDialog(null,
                "Sorry, not a quadratic if a=0");
        }
        else{
            if (determinant < 0){
              JOptionPane.showMessageDialog(null,
                  "that equation has no real solutions");
            }
            else if (determinant > 0){
              x1 = (-b + Math.sqrt(determinant))/(2.0*a);
              x2 = (-b - Math.sqrt(determinant))/(2.0*a);
              JOptionPane.showMessageDialog(null,
                  "that equation has two real solutions"
                  + "\n x1 = " + x1
                  + "\n x2 = " + x2);
            }
            else{
              x1 = -b/(2.0*a);
              JOptionPane.showMessageDialog(null,
                  "that equation has one real solution"
                  + "\n x = " + x1);
            }
        }
    } //end main
} //end Quadratic
