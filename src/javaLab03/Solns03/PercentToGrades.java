package javaLab03.Solns03;

/*
 * PercentToGrades.java
 * inputs number 0-100 and converst to grades
 */

// import swing package to use JOptionPane
import javax.swing.*;
/*
 */
public class PercentToGrades {
    public static void main(String[] args){
        String str;
        int percent;
        char gradeChar;

        str = JOptionPane.showInputDialog(null,
                "what is the percentage mark (in range 0-100)");
        percent = Integer.parseInt(str);


        if(percent >= 0 && percent <= 100){
          if(percent < 35){
              gradeChar = 'F';
          }
          else if(percent <40){
              gradeChar = 'E';
          }
          else if(percent <50){
              gradeChar = 'D';
          }
          else if(percent <60){
              gradeChar = 'C';
          }
          else if(percent <70){
              gradeChar = 'B';
          }
          else{
              gradeChar = 'A';
          }
          JOptionPane.showMessageDialog(null,"mark of " + percent + " corresponds to Grade " + gradeChar);
        }
        else{
          JOptionPane.showMessageDialog(null,"Sorry " + percent + " is outside the range 0-100");
        }
    } //end main
} // end PercentToGrades
