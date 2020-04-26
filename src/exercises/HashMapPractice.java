package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int id;
        String studentName;

        System.out.println("Enter the ID (or ENTER to finish):");

        do {
            System.out.print("Student Name: ");
            studentName = input.nextLine();

            if (!studentName.equals("")) {
                System.out.println("ID: ");
                id = input.nextInt();
                students.put(id, studentName);

                input.nextLine();
            }

        } while(!studentName.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
