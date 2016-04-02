/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab04_AB;
import javax.swing.*;


/**
 *
 * @author 0303077
 */
public class Numbers_A {

    public static void main(String[] args){

        String output = "";

        for (int i = 1; i <= 100; i++ ) {
            output += i + " ";			
        }
        JOptionPane.showMessageDialog(null, output);

    }
}
