package javaLab03.Solns03;

import javax.swing.*;

public class DaysInMonth{
  public static void main(String[] args){

    int month, numberDays;
    String response, monthName;

    response = JOptionPane.showInputDialog(null,"Please enter the number of the month in range 1-12");
    month = Integer.parseInt(response);
    switch (month){
      case 1:
        monthName = "January";
        numberDays = 31;
        break;
      case 2:
        monthName = "February";
        response = JOptionPane.showInputDialog("Is this a leap year (y or n)?");
        char yesOrNo = response.charAt(0);
        if(yesOrNo =='y'){
           numberDays = 29;}
        else{
           numberDays = 28;};
        break;
      case 3:
        monthName = "March";
        numberDays = 31;
        break;
      case 4:
        monthName = "April";
        numberDays = 30;
        break;
      case 5:
        monthName = "May";
        numberDays = 31;
        break;
      case 6:
        monthName = "June";
        numberDays = 30;
        break;
      case 7:
        monthName = "July";
        numberDays = 31;
        break;
      case 8:
        monthName = "August";
        numberDays = 31;
        break;
      case 9:
        monthName = "September";
        numberDays = 30;
        break;
      case 10:
        monthName = "October";
        numberDays = 31;
        break;
      case 11:
        monthName = "November";
        numberDays = 30;
        break;
      case 12:
        monthName = "December";
        numberDays = 31;
        break;
      default:
        monthName = "Invalid";
        numberDays = 0;
    }
        JOptionPane.showMessageDialog(null,"Month " + month + " is " + monthName
                + " which has " + numberDays + " days");
    }
}

