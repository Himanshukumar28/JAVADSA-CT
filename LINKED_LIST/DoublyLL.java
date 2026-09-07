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
    
    //FORWARD
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println();
    }

    //BACKWARD
    public void printBackward(){
        Node temp = tail;
        while(temp != null){
            System.out.print("<-"+ temp.data);
            temp = temp.prev;
        }
        System.out.println();
    }
//==========================

    //SEARCH AN ELEMENT IN LL
    public boolean searchInLL(int target){
        if(head == null){
            System.out.println("NO NODE INSIDE LL");
            return false;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            else{
                temp = temp.next;
            }
        }
        return false;
    }

    //=======================
    //DELETION
    //=======================

    //DELETE AT HEAD
    public void deleteHead(){
        if(head == null){
            System.out.println("No Need to delete");
            return ;
        }
        //single node
        if(head == tail){
            head = null;
            tail = null;
            //always remember
            size = 0; //or size---
            return ;
        }
        //LL has more than 1 node
        head = head.next;
        head.prev = null;
        size--;
    }

    //DELETE AT TAIL.
    public void deleteTail(){
        if(head == null){
            System.out.println("No Need to delete");
            return ;
        }
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return ;
        }
        //LL has more than 1 node
        Node currNode = tail;
        Node prevNode = tail.prev;

        //link change
        prevNode.next = null;
        currNode.prev = null;
        //tail update
        tail = prevNode;
        size--;
    }

    //DELETE AT POSITION
    public void deletePosition(int position){
        if(position < 1 || position > size+1){
            System.out.println("Invalid Condition");
            return ;
        }
        if(position == 1){
            deleteHead();
            return ;
        }
        if(position == size){
            deleteTail();
            return ;
        }
        //Main Logic

        //firstly reach to that position
        Node currNode = head;
        for(int i = 1; i<=position-1; i++){
            currNode = currNode.next;
        }
        //currNode is at the right place, i.e at the node which is to be deleted
        Node prevNode = currNode.prev;
        Node nextNode = currNode.next;

        //change links
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        currNode.prev = null;
        currNode.next = null;
        // size update
        size--;
    }


    public static void main(String[] args) {
        DoublyLL myList = new DoublyLL();

        myList.insertionAtHead(10);
        myList.printList();

        myList.insertionAtHead(12);
        myList.printList();

        myList.insertAtTail(20);
        myList.printList();

        myList.insertAtTail(60);
        myList.printList();

        myList.insertAtPosition(2, 80);
        myList.printList();

        myList.printBackward();

        System.out.println("Found Or Not: " + myList.searchInLL(55));
        
        myList.deleteHead();
        myList.printList();

        // myList.deleteTail();
        // myList.printList();

        myList.deletePosition(2);
        myList.printList();
    }
}
