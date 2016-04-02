

/** BankApplication.java using the Account class */
package javaLab06.Solns06;

public class BankApplication {
    public static void main(String args[]) {
      // Declare an Account object
      Account account1;                               // LINE 1.1
      // construct an Account object
      account1 = new Account(1000.0, "Account01") ;   // LINE 1.2

      // Declare another account object
      Account account2;
      // Use default Constructor to initialise Account object
      account2= new Account() ;                     // LINE 1.3
      // check the current state of each account
      System.out.println(account1.toString() ) ;
      System.out.println(account2.toString() ) ;

       // transfer money from account1 to account2 using transfer method
      double amount = 200.0 ;
      account1.transfer(amount, account2) ;
      account2.setName("Account02") ;

      // close down account2
      double cash = account2.close() ;
      account2 = null ; // "mark" for garbage collection

      // open another account to accept cash
      Account account3 = new Account(cash,"Account03") ;

      // check on the state of the new account
      System.out.println( account3.toString() ) ;

      // testing for Question 5's enhanced constructor
       Account account4 = new Account(-100,"Dodgy Person") ;
       System.out.println("\nDodgy Person attempts to open account with balance -100\n"
                          + account4.toString()
                          + "\n") ;

       // testing for Question 6's hasSufficientFunds() method
       Account account5 = new Account(1000,"Richy Cash") ;
       Account account6 = new Account(10,"Poor Fellow") ;
       Account account7 = new Account(0,"Gimme Hundred") ;
       System.out.println(account5.toString() ) ;
       System.out.println(account6.toString() ) ;
       System.out.println(account7.toString() ) ;
       if(account5.hasSufficientFunds(100)) account5.transfer(100,account7);
       System.out.println("\nRichy Cash attempts to transfer 100 to Gimme Hundred\n") ;
       System.out.println(account5.toString() ) ;
       System.out.println(account7.toString() ) ;
       if(account6.hasSufficientFunds(100)) account6.transfer(100,account7);
       System.out.println("\nPoor Fellow attempts to transfer 100 to Gimme Hundred\n") ;
       System.out.println(account6.toString() ) ;
       System.out.println(account7.toString() ) ;

    }
}

