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

    public int find(int val){
        node temp = head;
        int idx = 0;

        while (temp != null) { 
            if(temp.data == val){
                return idx;
            }
            idx++;
            temp = temp.next;
        }
        return -1;
    }

    public void delete(int key){
        node temp = head;
        node prev = null;

        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }

        if(temp == null){
            System.out.println("value not found ");
            return;
        }

        while (temp != null && temp.data != key) { 
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        
    }

    public void Print(){
        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

}

class LinkedList{
    public static void main(String[] args) {
        linked list = new linked();
        for (int i = 0; i < 50; i++) {
            list.add(i);
        }
        System.out.println("Original Linkelist :- ");
        list.Print();
        
        System.out.println("find index : " + list.find(978));
        
    }
}