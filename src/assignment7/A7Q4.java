/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

public class A7Q4 {
    
    public static void main(String[] args) {
        // creates scanner 'input'
        Scanner input = new Scanner(System.in);
        
        // asks for initial amount and stores the value
        System.out.print("What is your initial amount?: ");
        double pIn = input.nextDouble();
        System.out.print("\n");
        
        // asks for interest rate and stores the value
        System.out.print("What is the interest rate?: ");
        double rIn = input.nextDouble();
        System.out.print("\n");
        
        // asks for number of years and stores the value
        System.out.print("How many years?: ");
        int nIn = input.nextInt();
        System.out.print("\n");
        
        // initiates the compoundInterest method and uses the values above
        compoundInterest(pIn, rIn, nIn);
        
    }
    
    // initiates method
    public static double compoundInterest(double p, double r, int n){
        
        // creates rate
        double rate = 1 + r;
        
        // compound interest formula
        double b = p * Math.pow(rate, n);
        
        // prints out the balance
        System.out.println("After " + n + " years, your balance will be: $" + String.format( "%.2f", b ));
        return b;
        
    }
    
}