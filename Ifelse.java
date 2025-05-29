
import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 30;
        int c = 30;
        if (a < b && b < c) {
            System.out.println("both are value same");
        }
        else if(a<b || b< c){
            System.out.println("One side value are true");
        }
        else{
            System.out.println("both are value are not same");
        }
    }
}
