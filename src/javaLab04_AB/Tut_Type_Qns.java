/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab04_AB;

/**
 *
 * @author 0303077
 */
public class Tut_Type_Qns {
  
  public static void main (String [] args) {

    System.out.println("===============1A===============");      
    int x = 0;
    for (int i=1; i<=10; i++){
    x += i;
    System.out.print(x + " ");
    }

    System.out.println();
    System.out.println();
    
    System.out.println("===============1B===============");     
    int y = 0;
    for (int i=1; i<=10; i++){
    if (i % 2 == 0) y += i;
    else y -= i;
    System.out.print(y + " ");
    }

    System.out.println();
    System.out.println();
    
    System.out.println("===============1C===============");
    
    int f = 1;
    for (int i=1; i<=5; i++){
    f *= i;
    System.out.print(f + " ");
    }
    

    System.out.println();
    System.out.println();
    
    System.out.println("===============3A===============");

    for (int i = 0; i < 10; i++) {
        for (int j = 0 ; j < 5; j++)
            System.out.print("*");
    System.out.println( );
    }


    System.out.println();
    System.out.println();
    
    System.out.println("===============3B===============");
    
    for (int i = 0 ; i < 10 ; i++) {
        for (int j = 0 ; j < i; j++)
            System.out.print(" ");
        for (int k = 0 ; k < 5; k++)
            System.out.print("*");
    System.out.println();
    }


    System.out.println();
    System.out.println();
    
    System.out.println("==============Q4===============");

    for (int i = 0 ; i <= 20 ; i++){
        for (int j = 0 ; j <= 10 ; j++)
            if ((i % 5 == 0) || (j % 5 == 0))
                System.out.print("*");
            else
                System.out.print(" ");
        System.out.println( );
    }

    System.out.println();
    System.out.println();

    System.out.println("==============Q5===============");
    
    int total=0;
    for (int i = 0 ; i <= 100 ; i++) {
        total += i;
        i++; // THIS WILL CAUSE i TO BE INCREMENTED TWICE WITHIN THE LOOP THUS RESULTING IN UNEXPECTED OUTPUT
    }
    System.out.println("WEIRD OUTPUT -- Total = " + total) ;

    System.out.println();
    System.out.println();

    System.out.println("==============Q6A===============");
    
    for (int i = 0 ; i < 5 ; i++){
        for (int j = 0 ; j < i ; j++)
            System.out.print("*") ;
    System.out.println( ) ;
    }

    System.out.println("==============Q6A - ANALYSIS===============");
    
    for (int i = 0 ; i < 5 ; i++){
        for (int j = 0 ; j < i ; j++)
            System.out.print("j"+j) ;
    System.out.println("i"+i) ;
    }    
    
    System.out.println();
    System.out.println();

    System.out.println("==============Q6B===============");
      
    for (int i = 0 ; i < 5 ; i++){
        for (int j = 5 ; j > i ; j--)
            System.out.print("*") ;
    System.out.println( ) ;
    }
    System.out.println("==============Q6B - ANALYSIS===============");
      
    for (int i = 0 ; i < 5 ; i++){
        for (int j = 5 ; j > i ; j--)
            System.out.print("j"+j) ;
    System.out.println("i"+i) ;
    }    

    System.out.println();
    System.out.println();

    System.out.println("==============Q6C===============");
      
    for (int i = 5 ; i > 0 ; i--) {
        for (int j = 0 ; j < i ; j++)
            System.out.print("*") ;
        System.out.println( ) ;
    }

    System.out.println("==============Q6C - ANALYSIS===============");
      
    for (int i = 5 ; i > 0 ; i--) {
        for (int j = 0 ; j < i ; j++)
            System.out.print("j"+j) ;
    System.out.println("i"+i) ;
    }
    
    System.out.println();
    System.out.println();
    
    System.out.println("==============Q6D===============");
      
    for (int i = 5 ; i > 0 ; i--){
        for (int j = 5 ; j >= i ; j--)
            System.out.print("*") ;
        System.out.println( ) ;
    }

    System.out.println("==============Q6D - ANALYSIS===============");
      
    for (int i = 5 ; i > 0 ; i--){
        for (int j = 5 ; j >= i ; j--)
            System.out.print("j"+j) ;
    System.out.println("i"+i) ;
    }
    
  }
}
