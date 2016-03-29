package javaLab02.Solns02;


/**
 * Program that deliberately divides by zero to
 * illustrate the associated error message
 */

public class DivisionByZero {

    public static void main(String[] args) {
      // declare and initialise integer variables
      int topline = 1234;
      int bottomline = 0;
      int answer;
      System.out.println("In the following line we expect an error message");
      System.out.println("because we are trying to divide by 0\n");
      answer = topline/bottomline;
      // the following lines will not be executed
      // because a Division by Zero error will be displayed
      System.out.println("the result of " + topline + " / " + bottomline + " = " + answer);
    }
}
