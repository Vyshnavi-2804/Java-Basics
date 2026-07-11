import java.util.*;
public class Loops{
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-While
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 5);

        // Enhanced For Loop
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("\nEnhanced For Loop:");
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        //Multiplication Table using For Loop using input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for multiplication table: ");
        int n = sc.nextInt();
        System.out.println("Multiplication Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        //Reverse Multiplication Table using For Loop using input

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number for reverse multiplication table: ");
        int m = sc1.nextInt();
        System.out.println("Reverse Multiplication Table of " + m + ":");
        for (int i = 10; i >= 1; i--) {
            System.out.println(m + " x " + i + " = " + (m * i));
        }
        sc1.close();
        //Multiplication Table using while Loop using input
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter a number for while loop multiplication table: ");
        int p = sc2.nextInt();
        int i = 1;
        System.out.println("Multiplication Table of " + p + " using while loop:");
        while (i <= 10) {
            System.out.println(p + " x " + i + " = " + (p * i));
            i++;
        }
        sc2.close();
    }
}