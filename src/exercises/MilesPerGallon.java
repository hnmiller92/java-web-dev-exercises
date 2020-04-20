package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles you have driven:");
        Integer miles = input.nextInt();
        System.out.println("Please enter how many gallons of gas you have consumed:");
        Integer gas = input.nextInt();
        System.out.println("You are getting " + miles / gas + " miles-per-gallon.");
    }
}