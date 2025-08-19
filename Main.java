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
