package javaLab04_AB;

/*
 * TimesTable.java
 */

import javax.swing.*;
/**
 * @author ge, updated by ia, updated by dpl
 */
public class TimesTable_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strNumber;
        int number;
        int count;
        String table="";

        JOptionPane.showMessageDialog(null,
                "this program wil display the n times tables" +
                "\n"+
                "you will be prompted to enter a value for n");
        strNumber = JOptionPane.showInputDialog(null,
                "what times table do you wish to see displayed: ");
        number = Integer.parseInt(strNumber);

        count = 1;
        while(count<=12){
            table = table + "\n" + count+ " * " + number + " = " +(count*number);
            count++;
        }
        JOptionPane.showMessageDialog(null,table);
    }
}
