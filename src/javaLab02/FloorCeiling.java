package javaLab02;

public class FloorCeiling
{

   public static void main(String args[]){
      double d = 100.675;
      double e = 100.500;
      double f = 100.200;

      double a = 100.675;
      double b = 100.500;
      double c = 100.200;

      double g = 100.675;
      double h = 100.500;
      double i = 100.200;

      System.out.println("Round-int:");
      System.out.println(Math.rint(d));
      System.out.println(Math.rint(e));
      System.out.println(Math.rint(f));

      System.out.println("\nCeiling:");
      System.out.println(Math.ceil(a));
      System.out.println(Math.ceil(b));
      System.out.println(Math.ceil(c));

      System.out.println("\nFloor:");
      System.out.println(Math.floor(g));
      System.out.println(Math.floor(h));
      System.out.println(Math.floor(i));
      System.out.println();
   }
}