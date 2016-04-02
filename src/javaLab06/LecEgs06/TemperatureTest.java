/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab06.LecEgs06;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Uche
 */
public class TemperatureTest {
    public static void main(String[] args) {
    
    double hotC = Temperature.BOILING_POINT_C - 20.0;
    
    double hotF = Temperature.cToF(hotC);
    
    double hotK = Temperature.cToK(hotC);
    
    double aberdeenSummerInF =
            Temperature.FREEZING_POINT_F + 70.0;
    
    double aberdeenWinterInC =
            Temperature.fToC(40.0);
    
    DecimalFormat to2DP = new DecimalFormat("0.00");
    
    JOptionPane.showMessageDialog(null,
            "Formatted with \"DecimalFormat:\"" +
            "\nHot-C = " + to2DP.format(hotC) +
            "\nHot-F = " + to2DP.format(hotF) +
            "\nHot-K = " + to2DP.format(hotK) + 
            "\nAberdeen Summer in F = " + to2DP.format(aberdeenSummerInF) + 
            "\nAberdeen Winter in C = " + to2DP.format(aberdeenWinterInC));
    
    System.out.format("%n%s%n%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f%n",
            "Formatted with \"System.out.format:\"",
            "Hot-C = ", hotC,
            "Hot-F = ", hotF,
            "Hot-K = ", hotK, 
            "Aberdeen Summer in F = ", aberdeenSummerInF, 
            "Aberdeen Winter in C = ", aberdeenWinterInC);

    System.out.printf("%n%s%n%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f%n",
            "Formatted with \"System.out.printf:\"",
            "Hot-C = ", hotC,
            "Hot-F = ", hotF,
            "Hot-K = ", hotK, 
            "Aberdeen Summer in F = ", aberdeenSummerInF, 
            "Aberdeen Winter in C = ", aberdeenWinterInC);     
  }
}
