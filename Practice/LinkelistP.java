package Practice;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linked {

    Node head;

    public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void PrintNum() {

    }
}

public class LinkelistP {

    public static void main(String[] args) {

    }
}
