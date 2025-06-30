
import java.util.Scanner;



public class ArrayPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 take an array of names as input from the user and print them on the screen.
        int array[] = {1, 2,3, 4,5};
        int left = 0;
        int right = array.length - 1;

        

        while (left < right) { 
            swap(array[left], array[right]);
        }


        // for (int num : array) {
        //     sum = num + sum;
        // }
        // System.out.println(sum);

        /**Find Maximum and Minimum
        Write a Java program to find the largest and smallest element in an array.**/

        

    }
}