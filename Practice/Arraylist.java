
import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //list add 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //print
        System.out.println(list);
        //get element 
        System.out.println(list.get(2));
        //set element 
        System.out.println(list.set(0, 5));
        System.out.println(list);
        //delete item 
        list.remove(2);
        System.out.println(list);
        //size 
        int size = list.size();
        System.out.println(size);
    }
}
