package javaLab07.Solns07;

public class GradesApplication
{
  public static void main(String[] args)
  {
    // create two Grades objects with different grade boundaries
    Grades easy = new Grades(60,50,40) ;
    Grades difficult = new Grades(80,70,60) ;

    // check constructor correctly assigns values to instance variables
    System.out.println("Easy grading is:  " + easy.toString());
    System.out.println("Hard grading is:  " + difficult.toString() + "\n");

    int mark;
    // specify a mark and Grade according to the two grading schemes
    for(int i=1; i<=10; i++)
    {
      mark = i*10 ;
      System.out.print("mark " + mark + " is awarded   ") ;
      System.out.print("Grade " + easy.getGrade(mark) + " by Easy marker,  " ) ;
      System.out.println("Grade " + difficult.getGrade(mark) + " by Difficult marker") ;
    }

    // difficult marker has a change of heart
    difficult.setMinimums(70,60,50);
    System.out.println("\nHard grading is now:  " + difficult.toString() + "\n");
  }
}