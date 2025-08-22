
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

    
    // QUETION COUNTEVEN IN ARRAY
    // Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
    // countEvens([2, 1, 2, 3, 4]) → 3
    // countEvens([2, 2, 0]) → 3
    // countEvens([1, 3, 5]) → 0
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }


// Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
// sum13([1, 2, 2, 1]) → 6
// sum13([1, 1]) → 2
// sum13([1, 2, 2, 1, 13]) → 6
    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }

        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    }
}
