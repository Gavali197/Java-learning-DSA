package Recrusion.level3;

public class MatrixMoveCount {

    //in there a matrix count one position to target position moves 
    public static int countPath(int i, int j, int m, int n) {
        // this is base class
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // down forword 
        int down = countPath(i + 1, j, m, n);
        //right forword
        int right = countPath(i, j + 1, m, n);

        return down + right;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(countPath(0, 0, m, n));
    }

}
