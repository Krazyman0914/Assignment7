/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

public class A7Q7 {

    public static void main(String[] args) {
        // creates scanner 'input'
        Scanner input = new Scanner(System.in);
        
        // asks for initial amount and stores the value
        System.out.print("Enter a number: ");
        int numIn = input.nextInt();
        System.out.print("\n");
        
        // initiates the firstDigit method and uses the values above
        firstDigit(numIn);
    }
    
    // initiates method
    public static void firstDigit(int num){
        
        // while the number is a whole number (not a decimal)
        while (num < -9 || 9 < num){
            // divide it by 10
            num = num / 10;
        }
        // turn it into an absolute value (positive)
        int firstDigit = Math.abs(num);
        
        // print out the first digit
        System.out.println("The first digit is: " + firstDigit);
    }
    
}