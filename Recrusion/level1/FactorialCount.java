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

//     Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
//     Compute the result recursively (without loops).


// factorial(1) → 1
// factorial(2) → 2
// factorial(3) → 6

// public int factorial(int n) {
//   if(n==1){
//     return 1;
//   }
//   return n*factorial(n-1);
// }


}
