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

        node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void Print(){
        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

}

class LinkedList{
    public static void main(String[] args) {
        linked list = new linked();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.Print();
    }
}