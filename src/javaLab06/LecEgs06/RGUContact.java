/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLab06.LecEgs06;

/**
 *
 * @author Uche
 */
public class RGUContact {
    
  // instance variables
  private String firstname;
  private String lastname;
  private boolean student;
  private final String ID; // set to final as unique and thus immutable

  // class variables
  private static String emailDomain = "rgu.ac.uk";

  // constructor
  public RGUContact (String f, String l, boolean s, String i) {
    firstname = f;
    lastname = l;
    student = s;
    ID = i;
  }

  // other methods: getters first
  public String getFirstName() {
    return firstname;
  }
  
  public String getLastName() {
    return lastname;
  }
    
  public boolean isStudent() {
    return student;
  }

  public String getID() {
    return ID;
  }
  
  // setter methods now
  public void setNames(String fn, String ln) {
    firstname = fn;
    lastname = ln;
  }
  
  public void setStudent(boolean isStud) {
    
  }
  
  public String getEmail() {
    String email = firstname.charAt(0) + "." + lastname + "@" + emailDomain;
    return email.toLowerCase();
  }
  
  @Override
  public String toString() {
    String message = "Name: "
                      + firstname + " "
                      + lastname;
    if(student) {
                      message += ", Student, ";
    } else {
                      message += ", Non-Student, ";
    }
    message += "ID number: " + ID + "; ";
    message += "Email address: " + getEmail() + ".";
    
    return message;
  }
  
  // finally, class-level methods that interact with class-level data
  public static void setEmailDomain(String e) {
    emailDomain = e;
  }

  public static String getEmailDomain(String e) {
    return emailDomain;
  }

  
} // end class RGUContact