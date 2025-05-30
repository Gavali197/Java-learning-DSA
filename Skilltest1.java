
import java.util.Scanner;

public class Skilltest1 {

    public static void main(String[] args) {
        // 1.	Write a Java program to find the length of a string.
        String a = "Hemant Is Good Boy ";
        System.out.println(a.length());
        // 2.	Write a program to convert a string to uppercase and lowercase.
        String b = "it is all lowere case";
        String b1 = "it is all upper case";
        System.out.println(a.toUpperCase());
        System.out.println(b1.toLowerCase());
        // 3.	Write a program to check if two strings are equal or not.
        String c = "hemant";
        String c1 = "rahul";
        if(c == c1){
            System.out.println("both are same string");
        }else{
            System.out.println("both are not same.");
        }
        // 4.	Write a program to reverse a string.
        String rev = "Brotherhood";
        StringBuilder sc = new StringBuilder(rev);
        sc.reverse();
        System.out.println(sc);
        // 5.	Write a program to count the number of vowels in a string.
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter YOur String : ");
        String put = input.nextLine();

       put = put.toLowerCase();

        int vowelCount = 0;
        for(int i = 0; i < put.length(); i++){
            char ch  = put.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
        }

        System.out.println("Number of vowels : " + vowelCount);

    }
}