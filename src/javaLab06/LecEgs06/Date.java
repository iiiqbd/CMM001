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
public class Date {
  // instatnce variables encapsulating properties of the Date object
  private int day;
  private int month;
  private int year;
  
  // constructor: uses setDate method to avoid code-repetition
  public Date (int dd, int mm, int yyyy) {
    setDate(dd, mm, yyyy);
  }
  
  //transformer: allows date to be set using 3 parameters
  public void setDate(int dd, int mm, int yyyy) {
    day = dd;
    month = mm;
    year = yyyy;
  }
  
  // getters/accessors: grant access to properties of the Date object
  public int getDay() {
    return day;
  }
  
  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }
  
  //setters/transformers: allow prpoerties of Date object to be set of modified
  public void setDay(int dd) {
    day = dd;
  }
  
  public void setMonth(int mm) {
    month = mm;
  }

  public void setYear(int yyyy) {
    year = yyyy;
  }

  // helper method: converts months from numbers to letters
  private String getMonthName(int monthNum) { // not public!!!
    String monthName = "";
    switch (monthNum) {
      case 1:  monthName = "Jan"; break;
      case 2:  monthName = "Feb"; break;
      case 3:  monthName = "Mar"; break;
      case 4:  monthName = "Apr"; break;
      case 5:  monthName = "May"; break;
      case 6:  monthName = "Jun"; break;
      case 7:  monthName = "Jul"; break;
      case 8:  monthName = "Aug"; break;
      case 9:  monthName = "Sep"; break;
      case 10: monthName = "Oct"; break;
      case 11: monthName = "Nov"; break;
      case 12: monthName = "Dec"; break; // is this last break necessary?      
    }
    return monthName;
  }

  // accessor: returns all data describing the Date object as a String
  @Override
  public String toString() {
    String dateStr = this.day + " " + getMonthName(this.month) + " " + this.year;
    return dateStr;
  }

} // end class Date
