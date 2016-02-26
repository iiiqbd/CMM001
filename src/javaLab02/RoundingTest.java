package javaLab02;

public class RoundingTest
{
	public static void main(String[] args)
	{
		double x = Math.PI;

		System.out.println("1st d.p.\t" + Math.rint(x * 10.0) / 10.0);
		System.out.println("2nd d.p.\t" + Math.rint(x * 100.0) / 100.0);
		System.out.println("3rd d.p.\t" + Math.rint(x * 1000.0) / 1000.0);
		System.out.println("4th d.p.\t" + Math.rint(x * 10000.0) / 10000.0);
		System.out.println("5th d.p.\t" + Math.rint(x * 100000.0) / 100000.0);
		System.out.println("6th d.p.\t" + Math.rint(x * 1000000.0) / 1000000.0);
		System.out.println("7th d.p.\t" + Math.rint(x * 10000000.0) / 10000000.0);
		System.out.println("8th d.p.\t" + Math.rint(x * 100000000.0) / 100000000.0);
		System.out.println("9th d.p.\t" + Math.rint(x * 1000000000.0) / 1000000000.0);
		System.out.println("10th d.p.\t" + Math.rint(x * 10000000000.0) / 10000000000.0);
		System.out.println("11th d.p.\t" + Math.rint(x * 100000000000.0) / 100000000000.0);
		System.out.println("12th d.p.\t" + Math.rint(x * 1000000000000.0) / 1000000000000.0);
		System.out.println("13th d.p.\t" + Math.rint(x * 10000000000000.0) / 10000000000000.0);
		System.out.println("14th d.p.\t" + Math.rint(x * 100000000000000.0) / 100000000000000.0);
		System.out.println("15th d.p.\t" + Math.rint(x * 1000000000000000.0) / 1000000000000000.0);
		System.out.println("16th d.p.\t" + Math.rint(x * 10000000000000000.0) / 10000000000000000.0);
		System.out.println();

    System.out.printf("1st d.p.\t %.1f\n", x );
    System.out.printf("2nd d.p.\t %.2f\n", x );
    System.out.printf("3rd d.p.\t %.3f\n", x );
    System.out.printf("4th d.p.\t %.4f\n", x );
    System.out.printf("5th d.p.\t %.5f\n", x );
    System.out.printf("6th d.p.\t %.6f\n", x );
    System.out.printf("7th d.p.\t %.7f\n", x );
    System.out.printf("8th d.p.\t %.8f\n", x );
    System.out.printf("9th d.p.\t %.9f\n", x );
    System.out.printf("10th d.p.\t %.10f\n", x );
    System.out.printf("11th d.p.\t %.11f\n", x );
    System.out.printf("12th d.p.\t %.12f\n", x );
    System.out.printf("13th d.p.\t %.13f\n", x );
    System.out.printf("14th d.p.\t %.14f\n", x );
    System.out.printf("15th d.p.\t %.15f\n", x );
    System.out.printf("16th d.p.\t %.16f\n", x );
	}
}
