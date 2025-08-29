package Linkelist;

class node{
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}

class linked{
    node head;
    public void add(int data){
        node newNode = new node(data);

        if(head == null){
            head = newNode;
            return;
        }

        node currnode = head;

        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newNode;
    }

    //count even number
    public void even(){
        int count = 0;
        node currNode = head;

        while (currNode != null) {
            if(currNode.data % 2 == 0){
                count++;
            }
            currNode = currNode.next;
        }
    }

    public void print(){
        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
       System.out.println("null");
    }
}


public class CountEven {
    public static void main(String[] args) {
        linked list = new linked();

        list.add(1);
        list.add(2);
        list.add(3);

        list.print();
    }
}
