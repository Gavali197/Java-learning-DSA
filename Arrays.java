



public class Arrays {
    public static void main(String[] args) {
        int myArray[] = new int[3]; //init java array
        int seArray[] = {35, 16, 32}; //direct java array

        myArray[0] = 10;
        myArray[1] = 12;
        myArray[2] = 14;

        System.out.println(myArray[1]);
        System.out.println(seArray[1]);

        java.util.Arrays.sort(seArray);
        System.out.println(seArray[0]);


       final float PI = 3.14F; // final keyword use for permanent store some value in varriable
    }
}
