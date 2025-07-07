public class SumPrintNum {
    public static void SumNum(int n, int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        SumNum(n-1, sum);
    }
    public static void main(String[] args) {
        SumNum(5, 0);
    }
}
