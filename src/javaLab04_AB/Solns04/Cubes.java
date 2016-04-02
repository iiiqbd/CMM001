package javaLab04_AB.Solns04;

import javax.swing.*;

public class Cubes {
    public static void main(String[] args) {
        int n = 1;
        int limit = 20000;

        while(n*n*n < limit){ // try n^2 and n^4
          n++;
        }

        System.out.println(n + " is first number who's cube is greater than " + 20000);
        System.out.println(n + " cubed is " + n*n*n);
        System.out.println((n-1) + " cubed is " + (n-1)*(n-1)*(n-1));
    }
}
