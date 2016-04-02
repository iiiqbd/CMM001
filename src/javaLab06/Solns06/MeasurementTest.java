// Simple class with main method to test functionality of Measurement class
package javaLab06.Solns06;

import javax.swing.*;
import java.io.*;

public class MeasurementTest {
  public static void main(String[] args) {

  // Test constructor
  Measurement m1 = new Measurement(200.0,"ft");
  Measurement m2 = new Measurement(350.0,"ft");
  Measurement m3 = new Measurement(50.6,"m");
  // Test toString
  System.out.println(m1.toString() + "\n" + m2.toString() + "\n" + m3.toString());
  // Test toString
  System.out.println("Should be true m1.hasSameUnit(m2) " + m1.hasSameUnit(m2));
  System.out.println("Should be false m1.hasSameUnit(m3) " + m1.hasSameUnit(m3));
  // Test setters and getters
  m1.setValue(8888);
  m1.setUnit("Newtons");
  System.out.println(m1.getValue() + "=8888?  " + m1.getUnit() + "=Newtons?");


  Measurement[] data = new Measurement[5];
  for(int i = 0; i < data.length; i++){
      double v = Double.parseDouble(JOptionPane.showInputDialog("Enter a value: "));
      String u = JOptionPane.showInputDialog("Enter unit of value " + v);
      data[i] = new Measurement(v,u);
  }

  for(int i = 0; i < data.length; i++){
      System.out.println(data[i].getValue() + " " + data[i].getUnit());
  }

  }
}


