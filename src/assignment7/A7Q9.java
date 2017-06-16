/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

public class A7Q9 {

    public static void main(String[] args) {
        // creates scanner 'input'
        Scanner input = new Scanner(System.in);

        // asks for a number and stores the value
        System.out.print("Enter a number: ");
        int numIn = input.nextInt();
        System.out.print("\n");

        // if allDigitsOdd returns true
        if(allDigitsOdd(numIn)){
            // prints this
            System.out.println("All digits are odd: TRUE");
            
        } else {
            // if it does not return true, print this
            System.out.println("All digits are odd: FALSE");
        }

    }

    // this won't work if the first digit is 0...      because java ignores the 0 as it is the first digit
    public static boolean allDigitsOdd(int num) {
        // stores the number entered into a digit array
        char numArray[] = ("" + num).toCharArray();

        // scans the array
        for (int i = 0; i < numArray.length; i++) {
            // if one of the numbers found is a 0 or even
            if (numArray[i] % 2 == 0 || numArray[i] == 0) {
                // returns method as false
                return false;
            }
        }
        // if no even numbers found, return method as true
        return true;

    }
}