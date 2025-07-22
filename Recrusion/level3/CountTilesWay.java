package Recrusion.level3;

public class CountTilesWay {
    public static int countWay(int n, int m){
        //base case 
        if(n==m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        //vertically place tiles
        int vertically = countWay(n-m, m);
        //horizontally place tiles 
        
        int horizontally = countWay(n-1, m);

        return vertically + horizontally;
    }
    public static void main(String[] args) {
        System.out.println(countWay(12, 8));
    }
}
