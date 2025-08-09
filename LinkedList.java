import java.util.*;


//TRY TO SCARATCH IMPLEMENTATION 
public class LinkedList {

    // ======= SCRATCH IMPLEMENTATION =======
    static class LL {
        Node head;
        private int size;

        LL() {
            size = 0;
        }

        public class Node {
            String data;
            Node next;

            Node(String data) {
                this.data = data;
                this.next = null;
                size++;
            }
        }

        // Add at start
        public void addFirst(String data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Add at end
        public void addLast(String data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        // Insert at index
        public void addInMiddle(int index, String data) {
            if (index > size || index < 0) {
                System.out.println("Invalid Index value");
                return;
            }
            size++;
            Node newNode = new Node(data);
            if (head == null || index == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node currNode = head;
            for (int i = 1; i < size; i++) {
                if (i == index) {
                    Node nextNode = currNode.next;
                    currNode.next = newNode;
                    newNode.next = nextNode;
                    break;
                }
                currNode = currNode.next;
            }
             
        }

        // Remove first
        public void removeFirst() {
            if (head == null) {
                System.out.println("Empty List, nothing to delete");
                return;
            }
            head = head.next;
            size--;
        }

        // Remove last
        public void removeLast() {
            if (head == null) {
                System.out.println("Empty List, nothing to delete");
                return;
            }
            size--;
            if (head.next == null) {
                head = null;
                return;
            }
            Node currNode = head;
            Node lastNode = head.next;
            while (lastNode.next != null) {
                currNode = currNode.next;
                lastNode = lastNode.next;
            }
            currNode.next = null;
        }

        // Print list
        public void printList() {
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }
            System.out.println("null");
        }

        public int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        // ======= COLLECTION FRAMEWORK EXAMPLE =======
        System.out.println("=== Using Java's LinkedList Class ===");
        LinkedList<String> list = new LinkedList<>();
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked");
        System.out.println(list);

        System.out.println("First element: " + list.get(0));
        System.out.println("Size: " + list.size());

        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println("After removals: " + list);

        // ======= SCRATCH IMPLEMENTATION EXAMPLE =======
        System.out.println("\n=== Scratch Implementation ===");
        LL myList = new LL();
        myList.addLast("is");
        myList.addLast("a");
        myList.addLast("list");
        myList.printList();

        myList.addFirst("this");
        myList.printList();

        System.out.println("Size: " + myList.getSize());

        myList.removeFirst();
        myList.printList();

        myList.removeLast();
        myList.printList();

        System.out.println("Inserting 'linked' at index 1:");
        myList.addInMiddle(1, "linked");
        myList.printList();
    }
}


