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

class Node{
    int data;
    int next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkList{
   Node head;

   public void add(int data){
    Node newNode = new Node(data);

    if(head == null){
        head = newNode;
    }else{
        Node curr = head;
        while (curr.next != null) { 
            curr = curr.next;
        }
    }
   }
}
