package javaLab03.SOLNS;

/*
 * GenderAndAge.java
 * inputs 'm' or 'f' and enters age
 * returns man/woman/boy/girl
 */

// import swing package to use JOptionPane
import javax.swing.*;
/*
 */
public class GenderAndAge{
    public static void main(String[] args){
        String strGender,strAge;
        int age;
        char gender;

        strGender = JOptionPane.showInputDialog(null,
                "what is the persons gender (m or f)");
        gender = strGender.charAt(0);

        strAge = JOptionPane.showInputDialog(null,
                "what is the persons age");
        age = Integer.parseInt(strAge);

        if(gender == 'm' && age >= 18){
            JOptionPane.showMessageDialog(null,"Person is a man");
        }
        if(gender == 'm' && age < 18){
            JOptionPane.showMessageDialog(null,"Person is a boy");
        }
        if(gender == 'f' && age >= 18){
            JOptionPane.showMessageDialog(null,"Person is a woman");
        }
        if(gender == 'f' && age < 18){
            JOptionPane.showMessageDialog(null,"Person is a girl");
        }
    } //end main
} // end GenderAge
