
package javaLab08.Solns08;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dpl0795
 */
public class Numbers {
    
    public static void main(String[] args){
        
        int n = Integer.parseInt(
                JOptionPane.showInputDialog("How many numbers?"));
        
        ArrayList<Double> num = new ArrayList<>();
        ArrayList<Double> square = new ArrayList<>();
        ArrayList<Double> root = new ArrayList<>();
               
        for(int i=1; i<=n; i++){
            double x = i;
            num.add(x);
            square.add(x*x);
            root.add(Math.sqrt(x));
        }
        
        for(int i=0; i<num.size(); i++){
            System.out.println("num:" + num.get(i) 
                            + " Square: " + square.get(i)
                            + " Root: " + root.get(i));
        }
        
        System.out.println("sum of numbers is:" + sum(num));
        System.out.println("sum of numbers is:" + sum(square));
        System.out.println("sum of numbers is:" + sum(root));
        
    }
    
    public static double sum(ArrayList<Double> data){
        double total = 0;
        for(int i=0; i<data.size() ;i++){
            total += data.get(i);
        }       
        return total;
    }
    
}
