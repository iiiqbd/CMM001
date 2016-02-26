package javaLab03.SOLNS;

/*
 * NumbersToWordsV2.java
 * converts integer to english word equivalent
 * for integers in range 1 - 99
 */

// import swing package to use JOptionPane methods
import javax.swing.*;

public class NumbersToWordsV2 {


    public static void main(String[] args) {
        String strNumber;
        int number;

        // input the number
        strNumber = JOptionPane.showInputDialog(null,
                    "input the number you wish to convert to a word");
        number = Integer.parseInt(strNumber);

        //check if number lies outwith the accepted range
        if(number <1 || number>99)
        {
            JOptionPane.showMessageDialog(null,
                        "sorry this program only works for numbers between 1 and 99");
        }
        else
        {
          // declare two new integer variables tens and units
          // tens is the result of dividing number by 10
          // and units is the remainder when number is divided by 10
          int tens = number / 10;
          int units = number % 10;
          String strOutput ="";
          // consider first of all the special words for ten, eleven ,  .. nineteen
          if (tens == 1){
            switch (units){
                case 0: strOutput += ("ten"); break;
                case 1: strOutput += ("eleven"); break;
                case 2: strOutput += ("twelve"); break;
                case 3: strOutput += ("thirteen"); break;
                case 4: strOutput += ("fourteen"); break;
                case 5: strOutput += ("fifteen"); break;
                case 6: strOutput += ("sixteen"); break;
                case 7: strOutput += ("seventeen"); break;
                case 8: strOutput += ("eigthteen"); break;
                case 9: strOutput += ("nineteen"); break;
            }
          }
          else{
            switch (tens){// for all other numbers 1-9 and 20-99, construct word from tens and units
                case 2: strOutput += ("twenty"); break;
                case 3: strOutput += ("thirty"); break;
                case 4: strOutput += ("forty"); break;
                case 5: strOutput += ("fifty"); break;
                case 6: strOutput += ("sixty"); break;
                case 7: strOutput += ("seventy"); break;
                case 8: strOutput += ("eighty"); break;
                case 9: strOutput += ("ninety"); break;
            }
            switch (units){
                case 0: strOutput += (""); break;
                case 1: strOutput += ("one"); break;
                case 2: strOutput += ("two"); break;
                case 3: strOutput += ("three"); break;
                case 4: strOutput += ("four"); break;
                case 5: strOutput += ("five"); break;
                case 6: strOutput += ("six"); break;
                case 7: strOutput += ("seven"); break;
                case 8: strOutput += ("eigth"); break;
                case 9: strOutput += ("nine"); break;
            }
           } // end of else

           JOptionPane.showMessageDialog(null,"the number "+ number + " is " + strOutput);
        } //end of else

    } //end of main

} //end of class
