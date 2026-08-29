package LINKED_LIST;

public class SinglyLL {
    Node head;
    Node tail;
    int size;

    //Node class
    class Node {
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //CONSTRUCTOR
    public SinglyLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    


    // INSERT AT HEAD
    public void insertAtHead(int data ){
        Node newNode = new Node(data);
        //if LL is empty -> head and tail ko newNode pr point kardo
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        //increase the size by 1.
        size++;
    }

    //INSERT AT END.
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //INSERT AT POSITION.
    public void insertAtPosition(int position , int data){
        if(position < 1 || position > size+1){
            System.out.println("Insertion is not possible at this position");
            return;
        }
        if(position == 1){
            insertAtHead(data);
            return;
        }
        if(position == size + 1){
            insertAtTail(data);
            return;
        }
        //Middle me khi pe insert karna ho
        Node preNode = head;
        //move preNode by (Position -2) steps, to reach to the previous node of the destination location
        for(int i = 1; i<= position-2; i++){
            preNode = preNode.next;
        }
        
        Node newNode = new Node(data);
        //update links
        newNode.next = preNode.next;
        preNode.next = newNode;
        //increment size
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

    //====================
    //Utility Functions
    //====================
    
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getHead(){
        if(head == null){
            return -1;
        }else{
            return head.data;
        }
    }

    public int getTail(){
        if(tail == null){
            return -1;
        }else{
            return tail.data;
        }
    }

    public void clear(){
        this.head = null;
        this.size = 0;
    }


    public static void main(String[] args) {
        SinglyLL mylist = new SinglyLL();

        if(mylist.isEmpty()){
            System.out.println("List is Empty");
        }

        System.out.println("Size of LL:" + mylist.getSize());

        mylist.insertAtHead(10);
        mylist.printList();

        mylist.insertAtHead(20);
        mylist.printList();

        mylist.insertAtHead(30);
        mylist.printList();

        mylist.insertAtTail(100);
        mylist.printList();

        mylist.insertAtTail(110);
        mylist.printList();

        mylist.insertAtTail(120);
        mylist.printList();

        mylist.insertAtPosition(1, 22);
        mylist.printList();

        mylist.insertAtPosition(8, 200);
        mylist.printList();

        mylist.insertAtPosition(5, 500);
        mylist.printList();

        System.out.println("Head data" + mylist.getHead());

        System.out.println("Tail data " + mylist.getTail());



    }
}
