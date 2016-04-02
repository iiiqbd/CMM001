package javaLab04_AB.Solns04;

/*
 * Grades.java
 */

import javax.swing.*;
/**
 *
 * @author ge, updataed by ia, updated by dpl
 */
public class Gradesv2 {

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
      String str = "";

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
                 str += "\n" + mark + " yields grade A";
              }
              else if (mark >= 60){
                 gradeB++;
                 sum += mark;
                 count++;
                 str += "\n" + mark + " yields grade A";
              }
              else if (mark >= 40){
                 gradeC++;
                 sum += mark;
                 count++;
                 str += "\n" + mark + " yields grade A";
              }
              else{
                 gradeD++;
                 sum += mark;
                 count++;
                 str += "\n" + mark + " yields grade A";
            }
          }
    }
    average = sum / (gradeA + gradeB + gradeC + gradeD);
    String output = "A ";
    for(int i = 1; i <= gradeA; i++){output += "*";}
    output += "\nB ";
    for(int i = 1; i <= gradeB; i++){output += "*";}
    output += "\nC ";
    for(int i = 1; i <= gradeC; i++){output += "*";}
    output += "\nD ";
    for(int i = 1; i <= gradeD; i++){output += "*";}
    JOptionPane.showMessageDialog(null, output + "\n" + str);
  }

}