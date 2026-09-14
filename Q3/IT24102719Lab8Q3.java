import java.util.Scanner;

public class IT24102719Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];

        int i = 0;
        while (i < 6) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please enter a positive number");
            } else {
                numbers[i] = num;
                i++;
            }
        }

        int max = numbers[0];
        for (i = 1; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println();
        System.out.println("The maximum number is: " + max);

        sc.close();
    }
}