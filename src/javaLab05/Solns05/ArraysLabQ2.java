package javaLab05.Solns05;

import javax.swing.*;
import java.util.Arrays;
public class ArraysLabQ2 {
  public static void main(String[] args) {

    int[] data = new int[] { 40, -2, 12, 56, 0, 12};

    System.out.println("element data[0] is " + data[0] + "\n");
    System.out.println("element data[3] is " + data[3] + "\n");
    System.out.println("element data[6] does not exist and attempting \n" +
                        "to refer to it would result in " +
                        "an ArrayIndexOutOfBoundsException \n");
    // uncomment the following line to show an ArrayIndexOutOfBoundsException
    //System.out.println("element data[6] is " + data[6]);
    System.out.println("data.length is " + data.length + "\n");
    System.out.println("Arrays.toString(data) dsiplays " + Arrays.toString(data));
 }
}

