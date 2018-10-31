/*
 * Anton dela Cruz
 * October 26, 2018
 * The purpose of this program is to simplify given power
 */

package u2a2;

import java.util.Scanner;

/**
 *
 * @author andel7651
 */

public class U2A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        
        // Declaring variables
        int choice, base, exp, ans = 1;
      
        //Exit variables
        
         
        //Selection Menu
        System.out.println("-----Cubes and Squares and Powers Program! (-__-)-----");
        System.out.println("");
        
        do {
        System.out.println("Option 1: Square your number(x)(x)");
        System.out.println("Option 2: Cube your number(x)(x)(x)");
        System.out.println("Option 3: Find the value of a number, to any power");
        System.out.println("Option 4: Exit");
        System.out.println("");
        System.out.println("Choose option:");
        
        choice = keyedInput.nextInt();
        
        System.out.println("");
        System.out.println("-----------------------------------");
        
        
        if (choice == 1) {
            System.out.println("Enter in base number");
            base = keyedInput.nextInt();
            
            for (int i = 1; i < 2; i ++) {
            ans = base * base;
            }
            System.out.println ("the value squared is " + ans); 
            System.out.println ("------------------------------");
        
        }
        
        else if (choice == 2) {
            System.out.println("Enter in base number");
            base = keyedInput.nextInt();
            
            for (int i = 0; i < 3; i ++) {
            ans *= base;
        }
            System.out.println ("the value cubed is " + ans);
            System.out.println ("------------------------------");
        }
        
        else if (choice == 3) {
           System.out.println("Enter in base number");
           base = keyedInput.nextInt();
           
           System.out.println("Enter exponent");
           exp =  keyedInput.nextInt();
           
           for (int i = 0; i < exp; i++) {
               ans *= base;
           }
               System.out.println ("the power equals " + ans);
               System.out.println ("------------------------------");
           }
        
        else if  (choice == 4) { 
           System.out.println("Goodbye!");
           System.out.println("---------------PROGRAM TERMINATED---------------");
           
        }
        
        }
            while(choice != 4);
    }
}
       
    







