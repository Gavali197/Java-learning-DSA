
import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        // 1 input user array string calculate string length

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter String   :  ");
        int size = sc.nextInt();
        String arrays[] = new String[size];
        int tot = 0;

        for(int i = 0; i < size; i++){
            arrays[i] = sc.next();
            tot += arrays[i].length();
        }
        System.out.println(tot);
    }
}
