package javaLab02.SOLNS;

/*
 * Program to seperate the digits of a 5-digit integer
 * by repeated division and remainder calculations by 10
 */
import javax.swing.*;

public class SeparateDigits {

    public static void main(String[] args) {
        String strFiveDigit;
        int fiveDigit;
        int digit1, digit2, digit3, digit4, digit5;
        int rem1, rem2, rem3;

        strFiveDigit = JOptionPane.showInputDialog(null,
                      "Enter a five digit number (for example 12345)");

        // "mathematical solution requires us to convert inout String to an int first
        fiveDigit = Integer.parseInt(strFiveDigit);
        /* divide by powers of ten to extract most significant digit
           use remainder % to remove the most significant digit */
        digit1 = fiveDigit / 10000;
        rem1 = fiveDigit % 10000;
        digit2 = rem1 / 1000;
        rem2 = rem1 % 1000;
        digit3 = rem2 / 100;
        rem3 = rem2 % 100;
        digit4 = rem3 / 10;
        digit5 = rem3 % 10;

        JOptionPane.showMessageDialog(null,
                "The five digit number " + fiveDigit + " can be displayed as " +
                "\n" + digit1 + "   " + digit2 + "   " + digit3 +
                "   " + digit4 + "   " + digit5);

        /* Alternative is to read-off characters from the String
           using the charAt() method */
        char char1 = strFiveDigit.charAt(0);
        char char2 = strFiveDigit.charAt(1);
        char char3 = strFiveDigit.charAt(2);
        char char4 = strFiveDigit.charAt(3);
        char char5 = strFiveDigit.charAt(4);
        JOptionPane.showMessageDialog(null,
                "The five digit number " + fiveDigit + " can be displayed as " +
                "\n" + char1 + "   " + char2 + "   " + char3 +
                "   " + char4 + "   " + char5);
    }

}
