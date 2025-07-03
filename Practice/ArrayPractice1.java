
import java.util.Scanner;

public class ArrayPractice1 {
// 1.	Write a Java program to find the largest number in an array.

    static void FindLargeNum(Scanner sc) {
        System.out.println("How many number are you inserted : ");
        int size = sc.nextInt();
        int number[] = new int[size];
        int largest = number[0];
        
        for(int i = 0; i < size; i++){
            System.out.println("Enter the Number " + (i+1) + ":");
            number[i] = sc.nextInt();
        }

        for(int i = 1; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }

        System.out.println("The largest number " + largest);
        
    }


    // 2.	Write a program to calculate the sum of all elements in an array.

    static void SumArray(Scanner sc){
        int arr[] = {24, 25, 26};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
          sum = arr[i] + sum;
        }
        System.out.println("Total Item are Sum of : " + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 2 take an array of names as input from the user and print them on the screen.
        int array[] = {1, 2, 3, 4, 5};
        int left = 0;
        int right = array.length - 1;

        // for (int num : array) {
        //     sum = num + sum;
        // }
        // System.out.println(sum);
        /**
         * Find Maximum and Minimum Write a Java program to find the largest and
         * smallest element in an array.*
         */
        }
}
