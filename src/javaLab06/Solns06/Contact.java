package javaLab06.Solns06;

import javax.swing.*;

public class Contact{
    private String name;  // stores name
    private String number;  // stores telephone number

    public Contact(String newname, String newnumber){
      name = newname;
      number = newnumber;
    }

    public String getName(){
      return name;
    }

    public String getNumber(){
      return number;
    }

    public void setName(String newname){
      name = newname;
    }

    public void setPhone(String newnumber){
      number = newnumber;
    }

    /*  Classes designed for creating objects can have main methods
     *  These can be used for simple testing of the class */
    public static void main(String[] args) {

      Contact[] mycontacts = new Contact[3];

      for(int i=0; i<mycontacts.length; i++) {
         String nm = JOptionPane.showInputDialog("Enter name of contact " + (i+1));
         String ph = JOptionPane.showInputDialog("Enter phone number of contact " + (i+1));
         mycontacts[i] = new Contact(nm,ph);
      }

      for(int i=0; i<mycontacts.length; i++) {
         System.out.println(mycontacts[i].getName() + "   "  + mycontacts[i].getNumber() );
      }
    }
} //end of Contact
