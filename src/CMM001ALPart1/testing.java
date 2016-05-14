/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMM001ALPart1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Uche
 */
public class testing {
      public static void main(String[] args){
   //creating  topping objects
        Topping tomato = new Topping("tomato", true, 15.5);
        Topping ham = new Topping("ham", false, 150.4);
        Topping chicken = new Topping("chicken", true, 15);
        Topping pepper = new Topping("pepper", true, 23.4);
        Topping onions= new Topping("onions", true, 30.3);
        Topping pork = new Topping("pork", false, 15.5);
        //creating an empty arraylist to contain all the topping objects created
        ArrayList<Topping> collect = new ArrayList<>();
        //Adding the objects into the arraylist
        collect.add(tomato);
        collect.add(ham);
        collect.add(chicken);
        collect.add(pepper);
        collect.add(onions);
        collect.add(pork);
        //Trying to create an arraylist of pizza objects to record all pizza sales
            ArrayList<Pizza> plist = new ArrayList<>();
        //creating a meanu for the user to select an activity
        char c;
        do{
        String ans = JOptionPane.showInputDialog("Choose a Number\n"
          + "\n[1] To buy a pizza"
          + "\n[2] To sell a pizza"
          + "\n[3] View the List of sales made"
          + "\n[4] To eat a pizza"
          + "\n[5] To view topping details"
          + "\n[0] To Exit" 
        );
        //pick the number from the answer the person enters
        c=ans.charAt(0);
        switch (c){
          case '5':{
            String x="";
            for (Topping t : collect){
             x+=collect.indexOf(t)+ t.getName()+ t.getCost() +"\n";
             
            }
            JOptionPane.showMessageDialog(null, x);
          break;
          }
          case '0':{
              JOptionPane.showMessageDialog(null, "Goodbye");
          break;
          }
          
//<editor-fold defaultstate="collapsed" desc="Case 2 code">
          case '2':{
            int a= 0;
            int x=0;
            do{
              try{
                String s= JOptionPane.showInputDialog("Choose a size between 7 and 24?");
                a = Integer.parseInt(s);
                
              }
              catch(Exception e){
                JOptionPane.showMessageDialog(null ,"Please enter the number in figures");
                x=1;
              }
            }while(x == 1);
            
            
            //to let the user select a type of pizza
            String z = JOptionPane.showInputDialog("What do you want? Enter \"thick\" for thick pizza?");
            
            //to let the user select if its cripsy pizza or not
            int d =JOptionPane.showConfirmDialog(null, "Do you want Crispy or not");
            //trying to get a boolean value out of "d"
            boolean em;
            switch (d){
              case 0:
                em= true;
                break;
              default:
                em= false;
            }
            Base b = new Base(z,em);
            Pizza p = new Pizza (a,b);
            plist.add(p);
            
           break; 
          }
          
//</editor-fold>
          case '3':{
            String est=" ";
            for (Pizza item : plist){
              
              est+=item.toString();
                    
                  }
                JOptionPane.showMessageDialog(null, est);
          break;
          }
            
           
          }
          
        }while(c != 0);
  
}
}
