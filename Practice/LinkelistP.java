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


    public void Remove(int key){
        Node temp = head;
        Node prev = null;

        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Value Not Found..!");
            return;
        }
        prev.next = temp.next;
    }

    public void PrintNum() {

    }   
}

public class LinkelistP {

    public static void main(String[] args) {

    }
}
