public class powerN {
    public static int Powercalc(int base, int n){
        if(n==1){
            return base;
        }
        int print = base * Powercalc(base, n-1);
        System.out.println(print);
        return  print;
    }
    public static void main(String[] args) {
        Powercalc(3, 3);

    }
}
