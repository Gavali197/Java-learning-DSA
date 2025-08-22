public class TakeUpForward {
    public static void main(String[] args) {
        int n = 12345;   // Example input
        int count = 0;

        while (n > 0) {
            n = n / 10;   // remove last digit
            count++;      // increase digit count
        }

        System.out.println(count);  // Output: 5
    }
}
