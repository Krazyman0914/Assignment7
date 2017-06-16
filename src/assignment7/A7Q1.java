/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

public class A7Q1 {

    public static void main(String[] args) {
        // creates scanner 'input'
        Scanner input = new Scanner(System.in);

        // asks for the radius and stores the value
        System.out.print("Enter the radius: ");
        double radiusIn = input.nextDouble();
        System.out.print("\n");

        // initiates the circleArea method and uses the radius value
        circleArea(radiusIn);
    }

    // initiates the method
    public static void circleArea(double r) {
        // creates double area and makes it "πr2"
        double area = (Math.PI) * Math.pow(r, 2);
        // prints out the area
        System.out.println("Area of the circle is: " + area + " units.");
    }
}