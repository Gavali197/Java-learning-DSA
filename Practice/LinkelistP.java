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

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void Remove(int key) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value Not Found..!");
            return;
        }
        prev.next = temp.next;
    }

    public void PrintNum() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}

public class LinkelistP {

    public static void main(String[] args) {
        linked list = new linked();

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        System.out.println("Original List : ");
        list.PrintNum();

        list.Remove(10);
        System.out.println("After remove list :");
        list.PrintNum();

    }
}
