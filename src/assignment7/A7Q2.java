/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;


import java.util.Scanner;

public class A7Q2 {

    public static void main(String[] args) {
        // creates scanner 'input'
        Scanner input = new Scanner(System.in);

        // asks for the grade and stores the value
        System.out.print("Enter grade (in %): ");
        double markIn = input.nextDouble();
        System.out.print("\n");

        // initiates examGrade method and uses the grade value
        examGrade(markIn);
    }

    // initiates the method
    public static void examGrade(double mark) {
        // prints F if mark is less than 50
        if (mark < 50) {
            System.out.println("F");
        
        // prints D if mark is 50-59
        } else if (mark >= 50 && mark < 60) {
            System.out.println("D");

        // prints C if mark is 60-69
        } else if (mark >= 60 && mark < 70) {
            System.out.println("C");

        // prints B if mark is 70-79
        } else if (mark >= 70 && mark < 80) {
            System.out.println("B");

        // prints A if mark is greater or equal to 80
        } else if (mark >= 80) {
            System.out.println("A");

        }
    }
}