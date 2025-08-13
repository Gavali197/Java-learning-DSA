import java.util.*;

// public class RouffWork {

//     // public static void main(String[] args) {
//     //     for (int i = 4; i >= 1; i--) {
//     //         for (int j = 1; j <= i; j++) {
//     //             System.out.print("*");
//     //         }
//     //         System.out.println(" ");

//     //     }
//     // }


//     // public String longestCommonPrefix(String[] strs) {
//     //     for(int i = 0; i < strs[0].length(); i++){
//     //         char currChar = strs[0].charAt(i);

//     //         for(int j = 1; j < strs.length; j++){
//     //             if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
//     //                 return strs[0].substring(0, i);
//     //             }
//     //         }
//     //     }
//     //     return strs[0];
//     // }


    

// }

// Node class (single responsibility: store data)
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class (manages nodes)
class LinkedList {
    Node head;

    // Add node at end
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // Print all nodes
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

// Main class (runs the program)
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(5);
        list.add(7);

        list.printList(); // Output: 1 -> 5 -> 7 -> null
    }
}
