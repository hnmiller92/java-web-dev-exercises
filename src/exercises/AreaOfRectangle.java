package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle:");
        Integer length = input.nextInt();
        System.out.println("Please enter the width of the rectangle:");
        Integer width = input.nextInt();
        System.out.println("The area of your rectangle is " + length * width + ".");
    }
}
