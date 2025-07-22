
import java.util.Scanner;

public class PracticeSet2 {

    // 1 Enter 3 numbers from the user & make a function to print their average.
    static void AvgNum(Scanner sc) {
        System.out.print("Enter 3 Number : ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        double avg = (a + b + c) / 3.0;
        System.out.println("average " + avg);
    }

    // 2 Write a function to print the sum of all odd numbers from 1 to n.
    static void OddSum(Scanner sc) {
        System.out.print("Enter The N Sum Of odd  : ");
        int a = sc.nextInt();
        int b = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 != 0) {
                b += i;
            }
        }
        System.out.println(b + "  its your odd number sum ");
    }

    // 3 Write a function which takes in 2 numbers and returns the greater of those two.
    static void GreatestNum(Scanner sc) {
        System.out.println("Enter Frist Numver  : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("A is greter then B");
        } else {
            System.out.println("B is greter then A");
        }

    }

    // 4 Write a function that takes in the radius as input and returns the circumference of a circle.
    static void CircumferenceSum(Scanner sc) {
        System.out.println("Enter Your Circle radius : ");
        double radius = sc.nextDouble();
        double pi = Math.PI;
        double circumference = 2 * pi * radius;
        System.out.println(" Circumference for radius " + radius + " is " + circumference);
    }

    // 5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    static void VoteElegibility(Scanner sc) {
        System.out.println("Cheack Are you vote for  :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Elegible Vote " + age);
        } else {
            System.out.println("Not ELegible Vote " + age);
        }
    }

    // 6 Write an infinite loop using do while condition.
    //sovle using deepseek ai
    static void infiniteLoop() {
        do {
            System.out.println("infyninite");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (true);
    }
    // 7 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 Enter 3 numbers from the user & make a function to print their average.
        // AvgNum(sc);
        // 2 Write a function to print the sum of all odd numbers from 1 to n.
        // OddSum(sc);
        // 3 Write a function which takes in 2 numbers and returns the greater of those two.
        // GreatestNum(sc);
        // 4 Write a function that takes in the radius as input and returns the circumference of a circle.
        // CircumferenceSum(sc);
        // 5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
        // VoteElegibility(sc);
        // 6 Write an infinite loop using do while condition.
        // infiniteLoop(sc);
        /*
        try sovle but not very long quetion to understand
         */
        // 7 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
        // 8 Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
        // 9 Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
        //10 Write a program to print Fibonacci series of n terms where n is input by user :
        //11 1 1 2 3 5 8 13 21 ..... 
        //12 In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
        // (BONUS)
    }
}
