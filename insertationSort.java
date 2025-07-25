
public class insertationSort {

    public static void main(String[] args) {
        int arr[] = {3, 4, 8, 1, 2};

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

}
