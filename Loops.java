
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
      
      //for loops
        // for(int i = 10; i > 1; i--){
        //     System.out.println(i);
        // }

        //while loops

        // int i = 10;

        // while(i>1){
        //     System.out.println(i);
        //     i--;
        // }

        Scanner sc = new Scanner(System.in);
        int num = 0;

        do{
            System.out.println("Enter Some Number: ");
            num = sc.nextInt();
            System.out.println("this is your number :");
            System.out.println(num);
        }while (num > 0);
        System.out.println("the end");
    }
}
