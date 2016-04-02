package javaLab05.Solns05;

import javax.swing.*;
import java.util.Arrays;
public class ArraySorter
{
  public static void main(String[] args)

 {
	 int N = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of an array: "));
	 String [] names = new String[N];

	 for (int i=0; i<names.length; i++)
	 {
		 names[i] = JOptionPane.showInputDialog("Enter name " + (i+1) +": ");
     }

     Arrays.sort(names);

     String output = "";
     for (int i=0; i<names.length; i++)
	 {
	 	 output += (names[i] + "\n");
     }
     JOptionPane.showMessageDialog(null, "Sorted array elements are is: \n" + output);

     String searchname;
     do{
       searchname = JOptionPane.showInputDialog("Enter name to search for (enter q to quit) :");
       int location = Arrays.binarySearch(names, searchname);

       if(location>=0) JOptionPane.showMessageDialog(null, searchname + " occurs as element " + location);
       else JOptionPane.showMessageDialog(null, searchname + " is not an element in the array ");
     }while(!searchname.equals("q"));

 }
}

