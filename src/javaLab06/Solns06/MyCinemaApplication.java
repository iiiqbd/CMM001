// Cinema booking application using the CinemaBooking class
package javaLab06.Solns06;


import javax.swing.*;

public class MyCinemaApplication {
  public static void main(String[] args) {

    int nseats = Integer.parseInt(JOptionPane.showInputDialog(
          "How many seats are there in the Cinema?"));
    CinemaBooking app = new CinemaBooking(nseats);
    String response;
    char choice;

    do {
        response = JOptionPane.showInputDialog(null,
            "Please choose one of the following options:" + "\n" +
            "1 - Book" + "\n" +
            "2 - Cancel" + "\n" +
            "3 - Enquire" + "\n" +
            "q - Quit");

        choice = response.charAt(0);
        switch (choice)
        {
          case '1':
            response = JOptionPane.showInputDialog (null,
                  "Enter the number of seat to book:");
            int request = Integer.parseInt(response);

            if (request <= app.enquire()){   
                app.book(request);
                JOptionPane.showMessageDialog(null,
                  "Remaining seats: " + app.enquire());
            }
            else{
                JOptionPane.showMessageDialog(null,
                 "Sorry only " + app.enquire() + " seats are available");
            }
            break;

          case '2':
            response = JOptionPane.showInputDialog(null,
                "Enter the number of seat to cancel :");
            int numToCancel = Integer.parseInt(response);
            
            if ((numToCancel + app.enquire()) <= app.getNUMSEATS()){   
                app.cancel(numToCancel);
                JOptionPane.showMessageDialog(null,
                  "Remaining seats: " + app.enquire());
            }
            else{
                JOptionPane.showMessageDialog(null,
                 "Sorry can't refund " + numToCancel + " tickets");
            }           
            break;

          case '3':
            JOptionPane.showMessageDialog(null,
              "Remaining seats: " + app.enquire());
            break;

          case 'q':
            JOptionPane.showMessageDialog(null,
              "Thank you for using the system");
            break;
    }
    } while(choice!='q');
  }
}


