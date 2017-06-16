/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

public class A7Q3 {

    public static void main(String[] args) {
        // creates scanner 'input'
        Scanner input = new Scanner(System.in);
        
        // asks for the number and stores the value
        System.out.print("Enter the number: ");
        int numIn = input.nextInt();
        System.out.print("\n");
        
        // initiates factors method and uses the number value
        factors(numIn);
    }
    
    // initiates the method
    public static void factors(int num){
        // prints out factors of the number
        System.out.print("Factors of " + num + " are: [");
        for(int i = 1; i <= num; i++){
            // if the number is divisible by 'i', has no remainder, and it is not equal to the number, print it
            if(num % i == 0 && i != num){
                System.out.print(i + ", ");
                
            // prints the last factor, the number itself
            } else if (i == num){
                System.out.println(i + "]\n");
            }
        }
    }
}