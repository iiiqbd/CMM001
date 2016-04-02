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
public class Banking {
  public static void main(String[] args) {
    Account acc1 = new Account(500.00, "David");
    acc1.deposit(100.00);
    acc1.withdraw(260.00);
    System.out.println("Balance of " + acc1.getName() +
      " is " + acc1.getBalance());
    Account acc2 = new Account();
    acc2.setName("Scarlett");
    acc1.transfer(260.00, acc2);
    System.out.println(acc1);
    System.out.println(acc2);    
  } 
}
