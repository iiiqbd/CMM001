/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab04_A;

import javax.swing.JOptionPane;

/**
 *
 * @author 0303077
 */
public class Ascii_B {
    public static void main(String[] args){
        String output = "";
        char c;
        for (int i = 1; i <= 127; i++) {
            c = (char) i;
            if (i == 13) {
               continue; 
            }             
            output += c + " ";
        }
    JOptionPane.showMessageDialog(null, output);
    }
}
