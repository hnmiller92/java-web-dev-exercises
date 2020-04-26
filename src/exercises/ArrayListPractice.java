package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i + 1);
        }
        ArrayList<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letter count: ");
        int amount = input.nextInt();

        words.add("Hannah");
        words.add("apple");
        words.add("banana");
        words.add("Oliver");
        words.add("Lola");
        words.add("Boone");
        words.add("Binxy");
        for (int b = 0; b < words.size(); b++) {
            if (words.get(b).length() == amount) {
                System.out.println(words.get(b));
            }
        }
    }
}

