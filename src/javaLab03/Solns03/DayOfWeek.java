package javaLab03.Solns03;

import javax.swing.*;

public class DayOfWeek{
    public static void main(String[] args){

        String response, dayName;

        response = JOptionPane.showInputDialog(null,"Please enter a number in range 1-7");
        int day = Integer.parseInt(response);

    switch (day){

      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tueday";
        break;
      case 3:
        dayName = "Wednesday";
        break;
      case 4:
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
      case 7:
        dayName = "Sunday";
        break;
      default:
        dayName = "Invalid";
    }
        JOptionPane.showMessageDialog(null,"Day " + day + " is " + dayName);
    }
}

