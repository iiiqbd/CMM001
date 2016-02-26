package javaLab02;

import javax.swing.JOptionPane;

public class MyProgram
{
  public static void main(String[] args)
  {
    int x1, x2, x3, x4;
    int y = 31, z = 28;
    x1 = y + z / 7;     // 35
    x2 = (y + z) / 7;   // 8
    x3 = y + z % 7;     // 31
    x4 = (y + z) % 7;   // 3
    System.out.println("x1 = " + x1 + "\nx2 = " + x2) ;
    System.out.println("x3 = " + x3 + "\nx4 = " + x4) ;

		// char manipulation
    char pi = '\u03c0';
    char de = '\u0414';
    char naira = '\u20a6';
    JOptionPane.showMessageDialog(null, "pi = " + pi + "\nde = " + de + "\nnaira = " + naira);

    int i = 100; char c = 'a';
	double x = (double) i;		// double x = i; also works, though may be frowned upon

	JOptionPane.showMessageDialog(null, "x = " + x);
  }
}
