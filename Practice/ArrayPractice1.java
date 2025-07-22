
import java.util.Scanner;

public class ArrayPractice1 {
    // 1. Write a Java program to find the largest number in an array.

    static void FindLargeNum(Scanner sc) {
        System.out.println("How many number are you inserted : ");
        int size = sc.nextInt();
        int number[] = new int[size];
        int largest = number[0];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the Number " + (i + 1) + ":");
            number[i] = sc.nextInt();
        }

        for (int i = 1; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }

        System.out.println("The largest number " + largest);

    }

    // 2. Write a program to calculate the sum of all elements in an array.
    static void SumArray(Scanner sc) {
        int arr[] = {24, 25, 26};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println("Total Item are Sum of : " + sum);
    }

    // 3 take an array of names as input from the user and print them on the screen.
    static void average(Scanner sc) {
        System.out.println("Enter the how many name store in array : ");
        int size = sc.nextInt();
        String arr[] = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + "Name");
            arr[i] = sc.next();
        }

        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + " " + arr[i]);
        }

    }

    // 4 Find Maximum and Minimum Write a Java program to find the largest and smallest element in an array
    static void minmax() {

    }

    static void Fibonacci(Scanner sc) {
        // System.out.println("Enter the how many number print in fibbonacci serius : ");
        int n = 10;
        int a = 0;
        int b = 1;
        for (int i = 2; i < n; i++) {
            System.out.println(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    }
}
