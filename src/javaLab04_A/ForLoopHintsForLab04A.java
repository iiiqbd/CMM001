package javaLab04_A;

public class ForLoopHintsForLab04A {

  public static void main(String [] args) {

    for (int num = 1; num <= 100; num++){
      System.out.print(" " + (num));
        if(num %5 == 0) {
          System.out.println();
        }
    } // prints numbers 1 to 100 in rows of 5 columns

    /* Hint for 2(c): A loop within a loop can enable
    you to display the output in a tabular format. e.g. */
    System.out.println();
    System.out.println();
    System.out.println();


    for (int row = 0; row < 5; row++){
      for(int col = 0; col < 8; col++){
        System.out.print(" " + (8 * row + col));
      }
    System.out.println();
    } // prints numbers 0 to 39 in 5 rows of 8 columns

  }

}