package javaLab07.Solns07;

// SmartPhone class for CMM001 Lab
// Author: David Lonie

public class SmartPhone{

  // instance variable data for SmartPhone account object
  private String name;      // name of Account holder
  private double balance;   // balance of Account in pounds

  // values common to all accounts as class variables
  // could use arrays for PENCE_PER_SECOND and COST_PER_TEXT
  private static double pencePerSecond = 0.0017;
  private static double pencePerText = 0.12;

  /* constructor: creates SmartPhone object with name = newName
   * balance = openBalance and accountType = type */
  public SmartPhone(String newName, double openBalance){
      name = newName;
      balance = openBalance;
  }

  // Transformer: adds topupAmount to balance
  public void topup(double topupAmount) {
      balance += topupAmount;
  }

  // Transformer: deducts cost of numberSeconds from balance
  // after checking for sufficient funds
  public void deductCallCost(double numberSeconds) {
      double costOfCall;
      // Calculate cost of Call
      costOfCall = pencePerSecond * numberSeconds;
      // if cost of call greater than balance then use all balance
      if (costOfCall > balance)  {costOfCall = balance;}
      balance -= costOfCall;
  }

  // Transformer: deducts cost of one text from balance
  public void deductTextCost() {
      if (pencePerText <=balance) balance -= pencePerText;
  }

  // Transformer: deducts cost of App from balance
  // after checking for sufficient funds
  public void deductAppCost(double costOfApp) {
      if(costOfApp< balance ) balance -= costOfApp;
  }

  // Accessor: return balance in the account in Pounds
  public double getBalancePence() {
      return balance;
  }

  // Accessor: return balance in the account in Pounds
  public double getBalancePounds() {
      return balance/100.00;
  }

  // Accessor: returns name of Account holder
  public String getName() {
      return name;
  }


  // Accessor: returns full info about the Account
  @Override
  public String toString() {
      return   "name: "   + name
             + ", balance: £" + balance;
  }

  // Transformer/Accessor: empty account and return balance
  public double closeAccount() {
      double closingBalance = balance;
      balance = 0.0;
      return closingBalance;
  }

  // Class-level method for setting cost per second for calls
  public static void setPencePerSecond(double pps){
      pencePerSecond = pps;
  }

  // Class-level method for setting cost per second for calls
  public static void setPencePerText(double ppt){
      pencePerText = ppt;
  }

  // ADDED FOR TASK D
  // Method for transferring funds from this account to another account
  public void transfer(SmartPhone another, double amount) {
      if (this.getBalancePence() >= amount) {
          this.balance -= amount;
          another.balance +=amount;
      }
  }
} //end of SmartPhone class
