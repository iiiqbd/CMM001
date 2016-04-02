/** file: Account.java  class of objects which simulate
 *                      transactions on a basic bank account */
package javaLab06.Solns06;

public class Account {
    // declare instance variables
    private double balance ;
    private String name ;

    // default (parameterless) constructor
    public Account() {
        balance = 0.0 ;
        name="";
    }

    // overloaded constructor initialises balance and name
    public Account( double openingBalance, String nm ) {
        name = nm;
        /* initially the specification would require just
        balance = openingBalance ;
        but to extend it to solve Exercise 5, balance = openingBalance ;
        can be replaced by the following condition
        */
        if(openingBalance > 0) {
          balance = openingBalance ;
        }
        else{
          balance =0.0;
        }
    }

    // getBalance: accessor method returning double balance
    public double getBalance() {
        return balance ;
    }

    // getName: accessor method returning String name
    public String getName() {
        return name ;
    }

    // toString: accessor method returning status of object
    @Override
    public String toString() {
        String info = "Account held by " + getName();
        info = info + " has balance " + getBalance();
        return info ;
    }

    //setName: transformer method, assigns nm to name
    public void setName(String nm) {
        name = nm;
    }

    //deposit: transformer method, increase balance by amount
    public void deposit(double amount) {
        balance = balance + amount ;
    }

    //withdraw: transformer method, decrease balance by amount
    public void withdraw(double amount) {
        balance = balance - amount ;
    }

    //transfer: transformer method, decrease balance by amount
    public void transfer(double amount, Account other) {
        this.withdraw(amount);
        other.deposit(amount);
    }

    //hasSufficientFunds: accessor, returns true if balance >= parameter
    public boolean hasSufficientFunds(double amount) {
        return (balance >= amount);
    }
    /* note that return (balance >= amount); does exactly the same as
       if(balance >= amount){ return true; }
       else {return false; }
     */

    // transformer/accessor method to close account and return funds
    public double close() {
        double closingBalance = balance ;
        balance = 0.0 ;
        return closingBalance ;
    }

    /* In any class we can use a main mathod for some basic testing
     * creating and using objects of the class to check that the
     * methods work as expected*/
    public static void main(String[] args ){
		Account account = new Account(2000.00,"David");
		Account account2 = new Account(100.00,"Scarlett");
		System.out.println(account.toString());
		System.out.println(account2.toString());

		account.withdraw(200.00);
		System.out.println(account.toString());

		account.transfer(1250.00,account2);
		System.out.println(account.toString());
		System.out.println(account2.toString());
	}
}
