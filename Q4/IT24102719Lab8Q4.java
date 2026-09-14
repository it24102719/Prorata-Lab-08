import java.util.Scanner;

public class IT24102719Lab8Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentsArray = new int[8];

        int i = 0;
        while (i < 8) {
            System.out.print("Enter Student ID " + (i + 1) + ": ");
            int id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Error: Please enter a valid Student ID");
            } else {
                studentsArray[i] = id;
                i++;
            }
        }

        System.out.print("Enter a Student ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;
        for (i = 0; i < 8; i++) {
            if (studentsArray[i] == searchId) {
                found = true;
                break;
            }
        }

        System.out.println();
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        sc.close();
    }
}