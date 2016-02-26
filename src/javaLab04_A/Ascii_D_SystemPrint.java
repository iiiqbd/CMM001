package javaLab04_A;


/**
 *
 * @author 0303077
 */
public class Ascii_D_SystemPrint {
    public static void main(String[] args){
        String output = "";
        char c;
        for (int i = 1; i <= 255; i++) { 
          c = (char) i;
          if (i == 13) {
            continue; 
          }          
          output += i + " = " + c + "\n";
        }
        System.out.print(output);
    }
}