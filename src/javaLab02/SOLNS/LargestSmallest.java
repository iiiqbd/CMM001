package javaLab02.SOLNS;

/*
 * LargestSmallest.java
 * using Console Window for output
 */

public class LargestSmallest
{
    public static void main(String[] args)
    {
        /* Integer.MAX_VALUE and Integer.MIN_VALUE are
           constants already stored within the Integer class*/
        int largest = Integer.MAX_VALUE;
        int smallest = Integer.MIN_VALUE;

        System.out.println("the largest integer is "  + largest);
        System.out.println("the smallest integer is " + smallest);

        System.out.println("\nLargest integer is "+ Integer.MAX_VALUE );
        System.out.println("Adding 1 to the largest integer gives " + (Integer.MAX_VALUE+1) + '\n');

        System.out.println("\nSmallest integer is "+ Integer.MIN_VALUE );
        System.out.println("Subtracting 1 from the smallest integer gives "+(Integer.MIN_VALUE-1));
        /* the results look strange, and are result of the way that
           Java stores int variable values
           ... do an internet search for 2's complement format if interested*/

        /* Other data types also have associated classes,
           Double for double, Long for long etc.*/

        double bigdouble = Double.MAX_VALUE;
        double tinydouble = Double.MIN_VALUE;

        System.out.println("\nthe largest double is "  + bigdouble);
        System.out.println("the smallest double is " + tinydouble);
        /* note that E is short for 10 to the power of */
    }

}
