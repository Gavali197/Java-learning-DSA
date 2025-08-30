package Linkelist;

// Node class

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class MyLinkedList {
    Node head;

    public void addFr(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //count nodes
    public int size(){
        int count = 0;
        Node currNode = head;
        while (currNode.next != null) { 
            currNode = currNode.next;
            count++;
        }
        return count;
    }

    public boo find(int key){
        Node currNode = head;
        while (currNode != null) {
            if(currNode.data == key){

            }
        }
    }

    // Add a node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print linked list
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}

// Main class
public class LevelA {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);



        //add frist element one by one

        list.addFr(6);

        int nums = list.size();
        System.out.println(nums);
        list.printList();  // Output: 1->2->3->4->null
        
    }
}
