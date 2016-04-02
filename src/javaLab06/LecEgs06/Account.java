
package javaLab06.LecEgs06;

/**
 *
 * @author Uche
 */
public class Account {
  // object-level properties/variables
  private double balance;
  private String name;
  
  // class-level variables
  private static double interestRate = 0.025;
  
  // default constructor
  public Account() {
    balance = 0.0;
    name = "";
  }
  
  // overloaded constructor
  public Account(double amount, String n) {
    balance = amount;
    name = n;
  }
  
  // getters (accessors), setters (transformers) and helper methods
  public double getBalance() {
    return balance;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String n) {
    name = n;
  }

  public void deposit(double amount) {
    balance += amount;
  }
  
  public void withdraw(double amount) {
    balance -= amount;
  }
  
  @Override
  public String toString() {
    String info = "Account held by " + getName() +
      " has balance " + getBalance();
    return info;
  }
  
  public void transfer(double amount, Account other) {
    withdraw(amount);
    other.deposit(amount);
  }

  // calculates and adds monthly interest to outstanding balance
  public void addInterest(int months) {
    double interest = interestRate * months / 12 * balance;
    balance += interest;
  }
  
  // combo method - sets as well as gets
  public double close() {
    // setting portion of method
    double b = balance; // temporary method - stores the amount in "balance"
    // getter portion of method
    balance = 0.0; // resets the amount in teh account
    return b; // returns the amount in the accoungt prior to closure
  }
  
  // class-level method - sets rate of interest
  public static void setRate(double rate) {
    interestRate = rate;
  }
  
  public static double getRate() {
    return interestRate;
  }
  
} // end of class Account 