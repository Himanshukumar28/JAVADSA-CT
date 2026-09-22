package LINKED_LIST;

public class CircularSinglyLL {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private  int size;

    public void insertAtHead(int data){
        Node newNode = new Node(data);

        //Case 1: Empty Linked List
        if(head == null){
            head = newNode;
            tail = newNode;
            //circular connection
            tail.next = head;
        }
        //Case 2: Non-empty Linked List
        else{
            newNode.next = head;
            head = newNode;
            //maintain circular connection
            tail.next = head;
        }
        size++;
    }

    public void insertAtTail(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            //circular connection 
            tail.next = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            //maintain circular connection
            tail.next = head;
        }
        size++;
    }

    public void insertAtPosition(int position, int data){
        Node newNode = new Node(data);

        if(position < 1 || position > size+1){
            System.out.println("invalid position");
            return ;
        }
        if(position == 1){
            insertAtHead(data);
            return ;
        }
        if(position == size+1){
            insertAtTail(data);
            return ;
        }
        //in between position
        Node prevNode = head;

        for(int i =1; i<= position-2; i++){
            prevNode = prevNode.next;
        };
        Node currNode = newNode;
        Node nextNode = prevNode.next;

        prevNode.next = currNode;
        currNode.next = nextNode;

        size++;

    }

//=========================
//      TRAVERSE
//=========================
public void printList(){
    if(head == null){
        System.out.println("Circular Linked List is Empty");
        return ;
    }
    Node current = head;

    do{
        System.out.println(current.data + " -> ");

        current = current.next;

    }while(current != head);

    System.out.println("Back to head");
}

//========================
//      SEARCHING
//========================
//TIME 22:30

    public static void main(String[] args) {
        CircularSinglyLL myList = new CircularSinglyLL();

        myList.insertAtHead(10);
        myList.printList();
    }
}
