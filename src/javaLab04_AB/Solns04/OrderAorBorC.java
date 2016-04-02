package javaLab04_AB.Solns04;


import javax.swing.*;



public class OrderAorBorC
{
    public static void main(String[] args)
    {
        String response;
        char choice;
        double costA = 5.67;
        double costB = 6.78;
        double costC = 7.89;
        int number;

		do{
                response = JOptionPane.showInputDialog(null,
                        "Please enter one of the following options \n" +
                        "A to order product A at " + costA + " each  \n" +
                        "B to order product B at " + costB + " each  \n" +
                        "C to order product C at " + costC + " each  \n" +
                        "Enter Q to quit the program");
				choice = response.charAt(0);

				switch(choice)
				{
					case 'A':
						number = Integer.parseInt(JOptionPane.showInputDialog(
							"How many of product A do you require"));
						JOptionPane.showMessageDialog(null, number + " at £" + costA +
							" each costs a total of £" + number*costA);

					break;
					case 'B':
						number = Integer.parseInt(JOptionPane.showInputDialog(
							"How many of product B do you require"));
						JOptionPane.showMessageDialog(null, number + " at £" + costB +
							" each costs a total of £" + number*costB);
					break;
					case 'C':
						number = Integer.parseInt(JOptionPane.showInputDialog(
							"How many of product C do you require"));
						JOptionPane.showMessageDialog(null, number + " at £" + costC +
							" each costs a total of £" + number*costC);
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