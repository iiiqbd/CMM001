package javaLab04_AB;

import javax.swing.*;

public class ForLoop_Continue_New {

	public static void main(String [] args) {

  // Print all numbers from 1 to 50 not divisible by 7

  for (int i = 1; i <= 50; i++ ) {
//      if (i > 1) {
//        System.out.print(", "); /* turned off as replacing factors of
//        of 7 with ", " - 1, 2, 3, 4, 5, 6, , 8 */
//      }
      if (i % 7 == 0) {  
        continue;
      }
      System.out.print(i + " ");
		}
    System.out.println();
  }

}