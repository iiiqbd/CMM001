package javaLab04_AB.Solns04;

import javax.swing.*;

public class Pythagoras {
    public static void main(String[] args) {
        double h;
        for(int x = 1; x <= 100; x++){
          for(int y = 1; y <= x; y++){
            h = Math.sqrt(x*x+y*y);
            if(h == (int)h){
           // fllg stmt produces an unordered first column    
           // System.out.println(x + " " + y + " " + h + " " + (x*x+y*y) + " " + h*h);
              System.out.println(x + " " + y + " " + h + " " + (x*x+y*y) + " " + h*h);
            }
          }
        }
    }
}
