package javaLab04_AB;

//import javax.swing.*;

public class VariousForLoopExamples {

	public static void main(String [] args) {

		System.out.println("Performs 5 times, i=1,2,3,4,5");

		for (int i = 1; i <= 5; i++){
			System.out.print(i + ",");
		} // performs 5 times, i=1,2,3,4,5

		System.out.println("\n\nPerforms statements 4 times, j=1,2,3,4");

		for (int j = 1; j < 5; j++){
			System.out.print(j + ",");
		} // performs statements 4 times, j=1,2,3,4

		System.out.println("\n\nPerforms statements 11 times, k=0,1,2, -- ,10");

		for (int k = 0; k <= 10; k++){
			System.out.print(k + ",");
		} // performs statements 11 times, k=0,1,2,…,10

		System.out.println("\n\nPrints 2,4,6, -- ,18,20,");

		for (int i = 2; i <= 20; i+=2){
			System.out.print(i + ",");
		} // prints 2,4,6,…,18,20,

		System.out.println("\n\nPrints 20,35,50,65,80,95,");

		for(int j =20; j<=100; j+=15){
			System.out.print(j + ",");
		} // prints 20,35,50,65,80,95,

		System.out.println("\n\nPerforms statements 99 times k=99,98,97, -- ,2,1,");

		for (int k = 99; k > 0; k--){
			System.out.print(k + ",");
		} // performs statements 99 times k=99,98,97,…,2,1,

		System.out.println("\n\nPrints 1,2,4,8,16,32,64,128,256,512,1024,");

		for(int n = 1; n < 2000; n *= 2){
			System.out.print(n + ",");
		} // prints 1,2,4,8,16,32,64,128,256,512,1024,

		System.out.println("\n\nPrints 2.0,2.5,3.0, -- ,10.0,10.5");

		for (double x = 2.0; x <= 10.5; x += 0.5){
			System.out.print(x + ",");
		} // prints 2.0,2.5,3.0,…,10.0,10.5

		System.out.println("\n\nPrints 1000,100,10,1,0.1,0.01,0.01,0.001,");

		for(double d = 1000; d > 0.0009; d /= 10){
			System.out.print(d + ",");
		} // prints 1000,100,10,1,0.1,0.01,0.01,0.001,

		System.out.println("\n\nPrints a,b,c,d,e, -- ,x,y,z");

		for(char c = 'a'; c <= 'z'; c++){
			System.out.print(c + ",");
		} // prints a,b,c,d,e,…,x,y,z

		System.out.println("\n\nFor every value taken by row in outer loop ( 1 , 2 and 3 )"
			+ " col in inner loop cycles through ( 1 , 2, 3, 4 and 5 )");

		for (int row = 1; row <= 3; row++){
				for (int col = 1; col <= 5; col++){
					System.out.print(row*col + " ");
				}
		System.out.println();
		}
		System.out.println();
		System.out.println();
	} // end main

} // end class