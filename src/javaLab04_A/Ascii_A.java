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
public class Ascii_A {
    public static void main(String[] args){
        String output = "";
        char c;
        for (int i = 65; i <= 95; i++) {
            c = (char) i;
            output += c + " ";
        }

    JOptionPane.showMessageDialog(null, output);

    }
}
