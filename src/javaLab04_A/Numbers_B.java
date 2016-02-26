package javaLab04_A;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0303077
 */
public class Numbers_B {

    public static void main(String[] args){

        String output = "";
        String input = JOptionPane.showInputDialog(null, "Enter a number");
        int num = Integer.parseInt(input);
        int sum = 0;

        for (int i = 1; i <= num; i++ ) {
            sum += i;
            output += i + " ";			
        }
        JOptionPane.showMessageDialog(null, output);

    }
}
