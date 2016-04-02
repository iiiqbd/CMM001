/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package javaLab04_AB.Solns04;

/*  program to play Rock-Paper-Scissors against computer
 *  author dpl oct 2012
 *  CMM001 Lab 5 challenge exercise */

import javax.swing.*;

public class RockPaperScissorsPlus
{
  public static void main(String[] args)
  {
    int computerScore = 0;
    int playerScore = 0;
    int totalDraws = 0;
    int computerChoice = 0;
    int playerChoice = 0;
    char input;
    int count = 0;
    int more;
    String message = "";
    do
    {
      computerChoice = (int) Math.round(3.0 * Math.random() - 0.5); // generates random number 0, 1 or 2
      count++;
      do{
        input = JOptionPane.showInputDialog(null,
                  "Make your choice:\n"
                  +  "[1] Rock\n"
                  +  "[2] Paper\n"
                  +  "[3] Scissors").charAt(0);
        switch(input)
        { case '1': playerChoice = 0; //Player has Rock
                  if(computerChoice == 1) {computerScore++; message = "Status: You lose!"; break;}  // Rock loses to paper
                  if(computerChoice == 2) {playerScore++; message = "Status: You win!"; break;}     // Rock beats Scissors
                  message = "Status: Draw"; totalDraws++; break;
          case '2': playerChoice = 1;
                  if(computerChoice == 0) {playerScore++; message = "Status: You win!"; break;}   // paper beats rock
                  if(computerChoice == 2) {computerScore++; message = "Status: You lose!"; break;}      // Paper loses to Scissors
                  message = "Status: Draw"; totalDraws++; break;
          case '3': playerChoice = 2;
                  if(computerChoice == 0) {computerScore++; message = "Status: You lose!"; break;}   // scissors loses to rock
                  if(computerChoice == 1) {playerScore++; message = "Status: You win!"; break;}  // scissors beaks paper
                  message = "Status: Draw"; totalDraws++; break;
        }
      }while(input !='1' && input != '2' && input != '3');
      more = JOptionPane.showConfirmDialog(null, "You chose " + nameOfChoice(playerChoice)
                      + "\nComputer chose " + nameOfChoice(computerChoice)
                      + "\n" + message
                      + "\n\nAfter " + count + " rounds\n"
                      + "Player score is: "   + playerScore
                      + "\nComputer score is: "   + computerScore
                      + "\nTotal Draws is: " + totalDraws
                      + "\n\n Another round?");
      /* in next line, changed from "more != JOptionPane.NO_OPTION 
      so as to also end the game when user clicks 'Cancel'" */
    }while(more == JOptionPane.YES_OPTION);
    JOptionPane.showMessageDialog(null, "Thank's for playing!");
  }

  /* helper method returning string representing choice
   * 0 -> Rock      1-> Paper     2 or default-> Scissors    */
  public static String nameOfChoice(int num)
  {
    if(num == 0) return "Rock";
    if(num == 1) return "Paper";
    return "Scissors";
  }
}
