package javaLab04_AB.Solns04;

/*
 * Grades.java
 */

import javax.swing.*;
/**
 *
 * @author ge, updataed by ia, updated by dpl
 */
public class Grades {

    public static void main(String[] args) {
      String strNumber;
      int mark = 0; // variable to hold user entered values
      int gradeA = 0; // counter for number of grade A's
      int gradeB = 0; // counter for number of grade B's
      int gradeC = 0; // counter for number of grade C's
      int gradeD = 0; // counter for number of grade D's
      int sum = 0; // variable to hold total of all grades
      int average;
      int count = 0;
      String output = "";

      JOptionPane.showMessageDialog(null,
        "this program will prompt you to enter marks" +
        "\n"+
        "the marks have to between 0 and 100" +
                "\n"+
        "the program will then sort the marks into grades" +
        "\n"+
                "to end the program enter -1 as the mark");

      while(mark != -1){
            strNumber = JOptionPane.showInputDialog("enter the mark");
            mark = Integer.parseInt(strNumber);
            if (mark >= 0 && mark <= 100){
              if (mark >= 80){
                 gradeA++;
                 sum += mark;
                 count++;
                 output += "\n" + mark + " yields grade A";
              }
              else if (mark >= 60){
                 gradeB++;
                 sum += mark;
                 count++;
                 output += "\n" + mark + " yields grade B";
              }
              else if (mark >= 40){
                 gradeC++;
                 sum += mark;
                 count++;
                 output += "\n" + mark + " yields grade C";
              }
              else{
                 gradeD++;
                 sum += mark;
                 count++;
                 output += "\n" + mark + " yields grade D";
            }
          }
    }
    average = sum / (gradeA + gradeB + gradeC + gradeD);
    JOptionPane.showMessageDialog(null,
                        "there were "+count +" marks" +
                        "\n" +
                        "there were "+gradeA +" Grade A marks" +
                        "\n" +
                        "there were "+gradeB +" Grade B marks" +
                        "\n"  +
                        "there were "+gradeC +" Grade C marks" +
                        "\n" +
                        "there were "+gradeD +" Grade D marks" +
                        "\n" +
                        "the average of the marks was " +
                         average + "\n" + output);
  }

}
