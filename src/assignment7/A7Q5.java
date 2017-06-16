/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Random;
import java.util.Scanner;

public class A7Q5 {
    
    public static void main(String[] args) {
        // creates scanner 'input'
        Scanner input = new Scanner(System.in);
        
        // asks for a number and stores the value
        System.out.print("Enter a number: ");
        int numIn = input.nextInt();
        System.out.print("\n");
        
        // initiates the method and uses the number
        chaotic(numIn);

    }
    
    // initiates the method
    public static void chaotic(int num){
        // creates random number generator
        Random rand = new Random();
        int randNum;
        
        for(int i = 0; i < 7; i++){
            // creates the random number that ranges from 1 - 'number'
            randNum = rand.nextInt(num) + 1;
            
            for(int x = 0; x < randNum; x++){
                // prints out the stars depending on what random number generated
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}