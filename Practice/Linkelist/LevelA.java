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
    public void addlast(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }

        node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void print(){
        node currNode = head;

        while (currNode != null) {
            System.out.println(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}

public class LevelA {
    public static void main(String[] args) {
     System.out.println("null");   
    }
}
