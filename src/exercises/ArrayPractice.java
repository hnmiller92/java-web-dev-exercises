package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] placeholder = phrase.split("\\.");
        System.out.println(Arrays.toString(placeholder));

//        for (int nums : numbers) {
//            if (nums % 2 != 0) {
//                System.out.println(nums);
//            }
//        }
    }
}
