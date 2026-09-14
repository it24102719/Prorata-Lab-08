import java.util.Scanner;

public class IT24102719Lab8Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Array in reverse order:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}