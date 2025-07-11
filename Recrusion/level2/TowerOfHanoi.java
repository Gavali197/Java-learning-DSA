package Recrusion.level2;

public class TowerOfHanoi {
    public static void HanoiTower(int n, String src, String Helper, String deast){
        if(n==1){
            System.out.println("transfer disk" + n + "from"+src + "to" + deast);
            return;
        }
        HanoiTower(n-1, src, deast, Helper);
        System.out.println("transfer disk" + n + "from" + src + "to" + Helper);
        
        HanoiTower(n-1, Helper, src, deast);
    }

    public static void main(String[] args) {
        int n = 3;    
        HanoiTower(n, "A", "B", "C");
    }
}
