package javaLab03.SOLNS;

/*
 * TwoIntegers.java
 * Compares signs of two integers input by user
 */

// import swing package to use JOptionPane
import javax.swing.*;
/*
 */
public class TwoIntegers{
    public static void main(String[] args){
        String strFirst, strSecond;
        int int1, int2;

        strFirst = JOptionPane.showInputDialog(null,
                "what is the first integer");
        int1 = Integer.parseInt(strFirst);
        strSecond = JOptionPane.showInputDialog(null,
                "what is the second integer");
        int2 = Integer.parseInt(strSecond);

        if(int1 >0 && int2 >0){
            JOptionPane.showMessageDialog(null,"both positive");
        }
        else if(int1 <0 && int2 <0){
            JOptionPane.showMessageDialog(null,"both negative");
        }
        else if((int1 < 0 && int2 >0) || (int1 > 0 && int2 < 0)){
            JOptionPane.showMessageDialog(null,"one negative, one positive");
        }
        else{
            JOptionPane.showMessageDialog(null,"at least one number was zero");
        }
    } //end main
} // end TwoIntegers
