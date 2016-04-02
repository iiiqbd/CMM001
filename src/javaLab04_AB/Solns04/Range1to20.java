package javaLab04_AB.Solns04;


import javax.swing.*;



public class Range1to20
{
    public static void main(String[] args)
    {
        String response;
        int number;


		do{
                response = JOptionPane.showInputDialog(null,
                        "Please enter an integer in the range 1-20 \n" );
				number = Integer.parseInt(response);

				if(number <0 || number >20)
				{
					JOptionPane.showMessageDialog(null,
						        "Sorry, I can't accept numbers outside the range 1-20");
				}
				else
				{
					JOptionPane.showMessageDialog(null,
						        "The number you entered was " + number);
				}

		} while(true);   // this loop will go on forever
   }
}