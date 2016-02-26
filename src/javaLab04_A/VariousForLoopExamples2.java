package javaLab04_A;

import javax.swing.*;

public class VariousForLoopExamples2 {

	public static void main(String [] args) {

		String output = "";

		output += "Performs 5 times, i=1,2,3,4,5\n";

		for (int i = 1; i <= 5; i++){
			output += i + ",";
		} // performs 5 times, i=1,2,3,4,5

		output += "\n\nPerforms statements 4 times, j=1,2,3,4\n";

		for (int j = 1; j < 5; j++){
			output += j + ",";
		} // performs statements 4 times, j=1,2,3,4

		output += "\n\nPerforms statements 11 times, k=0,1,2, -- ,10\n";

		for (int k = 0; k <= 10; k++){
			output += k + ",";
		} // performs statements 11 times, k=0,1,2,�,10

		output += "\n\nPrints 2,4,6, -- ,18,20,\n";

		for (int i = 2; i <= 20; i+=2){
			output += i + ",";
		} // prints 2,4,6,�,18,20,

		output += "\n\nPrints 20,35,50,65,80,95,\n";

		for(int j =20; j<=100; j+=15){
			output += j + ",";
		} // prints 20,35,50,65,80,95,

		output += "\n\nPerforms statements 99 times k=99,98,97, -- ,2,1,\n";

		for (int k = 99; k > 0; k--){
			output += k + ",";
		} // performs statements 99 times k=99,98,97,�,2,1,

		output += "\n\nPrints 1,2,4,8,16,32,64,128,256,512,1024,\n";

		for(int n = 1; n < 2000; n *= 2){
			output += n + ",";
		} // prints 1,2,4,8,16,32,64,128,256,512,1024,

		output += "\n\nPrints 2.0,2.5,3.0, -- ,10.0,10.5\n";

		for (double x = 2.0; x <= 10.5; x += 0.5){
			output += x + ",";
		} // prints 2.0,2.5,3.0,�,10.0,10.5

		output += "\n\nPrints 1000,100,10,1,0.1,0.01,0.01,0.001,\n";

		for(double d = 1000; d > 0.0009; d /= 10){
			output += d + ",";
		} // prints 1000,100,10,1,0.1,0.01,0.01,0.001,

		output += "\n\nPrints a,b,c,d,e, -- ,x,y,z\n";

		for(char c = 'a'; c <= 'z'; c++){
			output += c + ",";
		} // prints a,b,c,d,e,�,x,y,z

		output += "\n\nFor every value taken by row in outer loop ( 1 , 2 and 3 )"
			+ " col in inner loop cycles through ( 1 , 2, 3, 4 and 5 )\n";

		for (int row = 1; row <= 3; row++){
				for (int col = 1; col <= 5; col++){
					output += row*col + " ";
				}
		output += "\n";
		}
		System.out.println();
		JOptionPane.showMessageDialog(null, output);
		System.out.println();
	} // end main

} // end class