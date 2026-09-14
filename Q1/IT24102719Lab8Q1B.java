import java.util.Scanner;

public class IT24102719Lab8Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = sc.nextInt();
        }

        // First pass - count even numbers
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                count++;
            }
        }

        int[] evenArray = new int[count];

        // Second pass - store even numbers
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[index] = myArray[i];
                index++;
            }
        }

        System.out.println();
        System.out.println("Even numbers:");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}