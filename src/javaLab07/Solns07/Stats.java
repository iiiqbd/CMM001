package javaLab07.Solns07;

import javax.swing.*;

// Class has a main method for testing purposes, see foot of Class file
public class Stats
{
  // Instance variables
  private double[] data ;
  private int number ;

  // Constructor (takes single int param and creates data array of size n)
  public Stats (int n) {
    number = 0;
    data = new double[n];
  }

  // Constructor (takes single int param and creates data array of size n)
  public Stats (double[] d) {
    number = d.length;
    data = d;
  }

  //Transformer: initialises data to empty state
  public void reset(){
    number = 0 ;
    for(int i=0; i < data.length; i++){
      data[i]=0;
    }
  }

//Accessor: returns the number of data values in data set
  public int getNumber(){
    return number ;
  }

  //Accessor: returns the sum of the data
  private double getTotal(){
    double total = 0;
    for(int i=0; i<data.length; i++){
       total+=data[i];
    }
    return total;
  }

  //Accessor returns the average of the data
  private double getAverage(){
      double average;
      if(number == 0) average = 0;
      else average = getTotal()/number;
      return average;
  }

  //Accessor returns the average of the data
  private double getMax(){
      if(number==0) return 0.0;
      double max = data[0];
      for(int i=1; i<number; i++){
          if(data[i]>max) max=data[i];
      }
      return max;
  }

  //Accessor returns the average of the data
  private double getMin(){
      if(number==0) return 0.0;
      double min = data[0];
      for(int i=1; i<number; i++){
          if(data[i]<min) min=data[i];
      }
      return min;
  }

  //Transformer: initialises data to empty state
  public void displayData(){
    for(int i=0; i<number; i++){
      System.out.println(data[i]);
    }
  }

  // Transformer: adds new number to set of data
  public void randomFill(double min, double max){
      for(int i=0; i<data.length; i++){
        data[i]=Math.random()*(max-min) + min;
        number++ ;
      }
  }

// Transformer: adds new number to set of data
  public void userFill(){
    for(int i=0; i<data.length; i++){
      data[i]=Double.parseDouble(JOptionPane.showInputDialog("please enter a number"));
      number++;

      if(JOptionPane.showConfirmDialog(null, "Add more data?")!=0) break;
        /* this line not in requirements, but added to allow user to
         * enter fewer data values if wished */
    }
  }

  // Accessor: returns a String summarising all properties of data set
  public String getSummary(){
    String message = "";
    message += "number of values: " + getNumber();
    message += "\ntotal of values: " + getTotal();
    message += "\nmaximum value: " + getMax();
    message += "\nminimum value: " + getMin();
    message += "\naverage of values: " + getAverage();
    return message;
  }

  public static void main (String [] args){
      Stats dataset = new Stats(10);
      dataset.randomFill(40,80);
      dataset.displayData();
      System.out.println(dataset.getSummary());

      Stats dataset2 = new Stats(5);
      dataset2.userFill();
      dataset2.displayData();
      System.out.println(dataset2.getSummary());

      double[] somedata = new double[]{3.4,9.2,-6.5,12.1};
      Stats dataset3 = new Stats(somedata);
      dataset3.displayData();
      System.out.println(dataset3.getSummary());
  }

}