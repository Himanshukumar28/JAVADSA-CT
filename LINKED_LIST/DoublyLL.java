package LINKED_LIST;

public class DoublyLL {
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    //data members
    private Node head;
    private Node tail;
    private int size;

    //CONSTRUCTOR
    public DoublyLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //INSERTION AT HEAD
    public void insertionAtHead(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //INSERTION AT TAIL
    public void insertAtTail(int data){
        Node newNode = new Node(data);
            if(head == null && tail == null){
                head = newNode;
                tail = newNode;
            }
            else{
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
            size++;
    }

    //INSERTION AT POSITION.
    public void insertAtPosition(int position , int data){
        if(position < 1 || position > size+1){
            System.out.println("insertion is not Possible in this position");
            return;
        }
        if(position == 1){
            insertionAtHead(data);
            return;
        }
        if(position == size+1){
            insertAtTail(data);
            return;
        }
        //in between kahin pr node insert krne ko bola h
        Node temp = head;
        for(int i =1; i<=position-2; i++){
            temp = temp.next;
        }
        //ab mera temp preNode pr aa chuka h
        Node preNode = temp;
        Node nextNode = preNode.next;
        Node currNode = new Node(data);

        //ab change links
        currNode.prev = preNode;
        preNode.next = currNode;
        currNode.next = nextNode;
        nextNode.prev = currNode;
        size++;

    }

    //====================
    //Traversal
    //====================
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        DoublyLL mylist = new DoublyLL();
        mylist.insertionAtHead(10);
        mylist.printList();
    }
}
