package javaLab07.Solns07;

public class Grades{
  // instance variables to hold grade boundary values
  private int aMinimum, bMinimum , cMinimum ;

  // constructor
  public Grades(int a, int b, int c){
    setMinimums(a, b, c );
  }

  // transformer: sets the grade levels
  public void setMinimums(int a, int b, int c){
    aMinimum = a ;
    bMinimum = b ;
    cMinimum = c ;
  }

  // accessor: converts mark into a grade
  public char getGrade(int mark){
    if (mark >= aMinimum)
      return 'A' ;
    else if (mark >= bMinimum)
      return 'B' ;
    else if (mark >= cMinimum)
      return 'C' ;
    else
      return 'D' ;
    }

  public String toString(){
    String message =  "A >= " + aMinimum
                    + " B >= " + bMinimum
                    + " C >= " + cMinimum
                    + " D else";
    return message;
  }

/* Note that in the constructor we make use of the
 setLevels method to avoid repetition of code
 We could have used:
 public Grades(int a, int b, int c) {
    theAlevel = a ;
    theBlevel = b ;
    theClevel = c ;
  }
*/

}


