
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



        for(int i=1; i<=5; i++){
            // print for loop are spce 
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
