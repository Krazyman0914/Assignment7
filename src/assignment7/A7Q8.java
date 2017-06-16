/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

public class A7Q8 {

    public static void main(String[] args) {
        // creates scanner 'input'
        Scanner input = new Scanner(System.in);
        
        // asks for month and stores the value
        System.out.print("Enter the month number: ");
        int monthIn = input.nextInt();
        
        // asks for day and stores the value
        System.out.print("\nEnter the day: ");
        int dayIn = input.nextInt();
        System.out.print("\n");
        
        // initiates method
        season(monthIn, dayIn);
    }
    
    public static void season(int month, int day){
        
        // dates for winter
        if(month == 12 && day >= 16 && day <= 31){
            System.out.println("The season is Winter.");
        } else if (month >= 1 && month <= 2 && day >= 1 && day <= 31){
            System.out.println("The season is Winter.");
        } else if (month == 3 && day >= 1 && day <= 15){
            System.out.println("The season is Winter.");
            
        // dates for spring
        } else if (month == 3 && day >= 16 && day <= 31){
            System.out.println("The season is Spring.");
        } else if (month >= 4 && month <= 5 && day >= 1 && day <= 31){
            System.out.println("The season is Spring.");
        } else if (month == 6 && day >= 1 && day <= 15){
            System.out.println("The season is Spring.");
        
        // dates for summer
        } else if (month == 6 && day >= 16 && day <= 31){
            System.out.println("The season is Summer.");
        } else if (month >= 7 && month <= 8 && day >= 1 && day <= 31){
            System.out.println("The season is Summer.");
        } else if (month == 9 && day >= 1 && day <= 15){
            System.out.println("The season is Summer.");
        
        // dates for fall
        } else if (month == 9 && day >= 16 && day <= 31){
            System.out.println("The season is Fall.");
        } else if (month >= 10 && month <= 11 && day >= 1 && day <= 31){
            System.out.println("The season is Fall.");
        } else if (month == 12 && day >= 1 && day <= 15){
            System.out.println("The season is Fall.");
            
        // if the date doesnt fit into the ones above, print invalid date
        } else {
            System.out.println("Invalid date.");
        }
    }
    
}