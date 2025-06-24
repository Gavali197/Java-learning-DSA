
public class Pattern {
    public static void main(String[] args) {
        // 1. squre Pattern
        // for(int i = 1; i <=4; i++){
        //     for(int j = 1; j<=5; j++){
        //         System.out.print("*");
        //     } 
        //     System.out.println("");
        // }


        // holow reactangle Pattern

        // for (int i= 1; i<=4; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         if(i==1 || j==1 || i==4 || j==5){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // 3. print the half paramint

        // for(int i=1; i<=5; i++){

        //     for(int j=1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }



        // for(int i=1; i<=5; i++){
        //     // print for loop are spce 
        //     for(int j=1; j<=5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        // int n = 4;
        // int m = 5;

        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // inverted half piramint (rotated by 180 deg)
        
        // int n=4;
        // for(int i = 1; i<= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // number pattern rows

        // int n = 5;

        // for(int i = 1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println(" ");
        // }

        // half piramint pattern in number inverted

        // int n=5;

        // for(int i=n; i>=1; i--){
        //     for(int j= 1; j <=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println(" ");
        // }
        
        // floid piramint pattern 

        int n = 5;
        int number = 1;

        for(int i = 1; i <= n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

    }
}






    //     1
    //    121
    //   12321
    //  1234321
    // 123454321