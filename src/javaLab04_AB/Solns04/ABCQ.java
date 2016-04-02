package javaLab04_AB.Solns04;


import javax.swing.*;



public class ABCQ
{
    public static void main(String[] args)
    {
        String response;
        char choice;
        do{
                response = JOptionPane.showInputDialog(
                        "Please enter one of the following options \n" +
                        "A \n" +
                        "B \n" +
                        "C \n" +
                        "Enter Q to quit the program");
        choice = response.charAt(0);

        switch(choice)
        {
          case 'A':
            JOptionPane.showMessageDialog(null,
                    "You chose A");
          break;
          case 'B':
                    JOptionPane.showMessageDialog(null,
                    "You chose B");
          break;
          case 'C':
            JOptionPane.showMessageDialog(null,
                    "You chose C");
                    break;
                    case 'Q':

                    break;
                    default:
            JOptionPane.showMessageDialog(null,
                    "Pleas choose A,B,C or Q");
        }

    }while(choice!='Q');
   }
}