package javaLab02.SOLNS;


// import the Java util library that contains the Scanner method
import java.util.*;

public class Addition2 {
  public static void main(String[] args) {
    String strNum1, strNum2;
    int num1, num2;

    // create a Scanner input object
    Scanner sc = new Scanner(System.in);

    // ask the user to input an integer
    System.out.println("Enter an integer value for num1: ");
    // input the next integer input into num1
    num1 = sc.nextInt();

    // ask the user to input another integer
    System.out.println("Enter another integer value for num2: ");
    // input the next integer input into num2
    num2 = sc.nextInt();

    // display num1 and num2
    System.out.println("num1 = " + num1 + " and num2 = " + num2 +
                "\n num1 + num2 = " + (num1 + num2) );
  } // end of main
} //end of Addition 2

