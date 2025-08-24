
public class PrintNum {

    public static void Print(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        Print(n + 1);
    }

    public static void main(String[] args) {
        Print(5);
    }
}
