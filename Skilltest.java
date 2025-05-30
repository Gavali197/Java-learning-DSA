public class Skilltest {
    public static void main(String[] args) {
        // 1.	Write a Java program to find the largest number in an array.
          int[] numbers = {32, 16, 33};

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < largest) {
                largest = numbers[i];
            }
        }

        System.out.println("this is large number :" + largest);
        
        // 2.	Write a program to calculate the sum of all elements in an array.

        int[] sum = {1,2,3,4};

        int t = 0;

        for(int i = 1; i < sum.length; i++){    //array chalaya jab tk length 0 ho jaye 
            t = t + sum[i];                     // t ko sum ke sath + kiya
        }
        System.out.println("this is your total sum of array : " + t);


        // 3.	Write a program to search for a specific number in an array.

        int[] num1 = {1, 2, 3, 4 , 5};
        boolean found = false;
        int num2 = 6;

        for(int i = 1; i < num1.length; i++){ // loop ko chalaya jab tk khatm na ho jaye array
            if(num1[i] == num2){                //num1 ko num2 se compare kiya
                System.out.println("match the number " + num2);
                found = true;                   //if found true ho gaya toh loop ko break kr do
                break;
            }
        }

        if(!found){
            System.out.println("number not match");
        }

        // 4.	Write a program to sort an array in ascending order.

        int[] ar = {2, 36, 14, 2, 10};
        System.out.println("original array " + java.util.Arrays.toString(ar));
        java.util.Arrays.sort(ar);
        System.out.println("sorted array " + java.util.Arrays.toString(ar));
        

        // 5.	Write a program to count even and odd numbers in an array.

        int[] evenod = {16, 15, 2, 6, 9};

        int evenCound = 0;
        int oddCount = 0;

        for(int i = 0; i < evenod.length; i++){
            if(evenod[i] % 2 == 0){
               evenCound++;
            }else{
                oddCount++;
            }
        }
        System.out.println("it is arrays of " + java.util.Arrays.toString(evenod));
        System.out.println("its all of the total even numbers : " + evenCound);
        System.out.println("it all of the odd numbers : " + oddCount);

    }
}
