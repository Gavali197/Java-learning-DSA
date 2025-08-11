
import java.util.ArrayList;

public class ArrayListQue {
// Create an ArrayList of integers and remove all even numbers.

// Store 5 student names in an ArrayList and sort them in alphabetical order.
// Merge two ArrayLists into one.
// Find the maximum and minimum number from an ArrayList.
// Count the frequency of each element in an ArrayList.
// Reverse the elements of an ArrayList without using Collections.reverse().
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.removeIf(n -> n % 2 == 0);
        System.out.println(list);

    }
}
