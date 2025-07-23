package Recrusion.level3;

public class pairCountGuest {

    public static int calGuest(int n) {
        // base class
        if (n <= 1) {
            return 1;
        }

        //for single 
        int ways1 = calGuest(n - 1);
        //for pairs 
        int ways2 = (n - 1) * calGuest(n - 2);

        //calculate the total of pairs
        return ways1 + ways2;
    }

    public static void main(String[] args) {
        System.out.println(calGuest(4));
    }
}
