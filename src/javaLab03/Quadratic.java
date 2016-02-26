package javaLab03;

/*
Quadratic.java
Implement a Java application that solves the quadratic equation ax*x + bx + c = 0
-ask the user to enter three double values a, b, and c
-calculate a double value d = b * b – 4ac
-if d < 0 then display "That quadratic does not have any solutions"
-if d = 0 then there is one solution given by d = −b/2a
so display the solution within a message such as "That quadratic has one solution x = ..."
-if d > 0 then there are two solutions x1, x2 = -b/2a +/-sqrt(d)/2a
display the solutions in a message such as "That quadratic has two solutions x1 = ... and x2 = ...
To calculate a square root of value d in Java, use the method Math.sqrt(x)

*/



import javax.swing.*;

public class Quadratic {

	public static void main(String[] args){

		double a, b, c, d, x1, x2;
		String aA = JOptionPane.showInputDialog("Enter a");
		a = Double.parseDouble(aA);
		String bB = JOptionPane.showInputDialog("Enter b");
		b = Double.parseDouble(bB);

		String cC = JOptionPane.showInputDialog("Enter c");
		c = Double.parseDouble(cC);

		d = Math.sqrt(b * b - (4.0 * a * c));

	  if (d == 0) {
				   x1 = -b/(2 * a);
				   JOptionPane.showMessageDialog(null, "That quadratic has one solution\n"
						+  "x1 = x2 = " + x1);
		}

		else if (d > 0) {
			x1 = (-b + d)/(2 * a);
			x2 = (-b - d)/(2 * a);
			JOptionPane.showMessageDialog(null, "That quadratic has two solutions\n" + x1 + " and " + x2);
		}
		else {
			JOptionPane.showMessageDialog(null, "That quadratic does not have any solutions");
		}

	}
}


