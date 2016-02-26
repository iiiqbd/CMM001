package javaLab02.SOLNS;


// import the Java swing library that contains the JOptionPane methods
import javax.swing.*;

public class Addition {
  public static void main(String[] args) {
    String strNum1, strNum2;
    int num1, num2;

    // read a String from JOptionPane
    strNum1 = JOptionPane.showInputDialog(
              "Enter an integer value for num1: ");
    // read another String from JOptionPane
    strNum2 = JOptionPane.showInputDialog(
              "Enter an integer value for num2: ");

    // convert the String variables to int variables
    num1 = Integer.parseInt(strNum1);
    num2 = Integer.parseInt(strNum2);

    // display num1 and num2
    JOptionPane.showMessageDialog(null,
                "num1 = " + num1 + " and num2 = " + num2 +
                "\n num1 + num2 = " + (num1 + num2) );
    } //end of main
} //end of Addition

