/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

public class A7Q6 {

    public static void main(String[] args) {
        // creates scanner 'input'
        Scanner input = new Scanner(System.in);
        
        // asks for initial amount and stores the value
        System.out.print("Enter a number: ");
        int numIn = input.nextInt();
        System.out.print("\n");
        
        // initiates the lastDigit method and uses the values above
        lastDigit(numIn);
    }
    
    // initiates method
    public static void lastDigit(int num){

        // finds the last digit of the number
        int x = num % 10;
        // turns the number into an absolute value (positive)
        int lastDigit = Math.abs(x);
        // prints out the last digit
        System.out.println("The last digit is: " + lastDigit);
    }
    
}
