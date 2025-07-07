public class FactorialCount {
    public static void count(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum*=n;
        count(n-1, sum);
    }
    public static void main(String[] args) {
        count(10, 1);
    }
}
