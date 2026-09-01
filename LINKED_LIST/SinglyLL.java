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

    //==================
    //Searching
    //==================

    //Return true if value exists
    public boolean search(int target){
        Node temp = head;
        while (temp != null) {
            if(temp.data == target){
                return true;
            }
            else{
                temp = temp.next;
            }
        }

        return false;
    }

    //Return 1- Based position
    public int findPosition(int target){
        Node temp = head;
        int position = 1;

        while(temp != null){
            if(temp.data == target){
                return position;
            }
            else{
                temp = temp.next;
                position++;
            }
        }
        return -1;
    }

    //===================
    //Updation
    //===================

    //Update using position
    public void updateAtPosition(int position , int newData){
        if(position <1 || position > size+1){
            System.out.println("Invalid position");
            return;
        }
        Node temp = head;
        //take temp to the position given in input
        for(int i= 1; i<= position-1; i++){
            temp = temp.next;
        }
        //ab mera temp exact position wali data pr hai
        //replace old data with new
        temp.data = newData;
    }

    //Update first occurance of value
    public boolean updateValue(int oldValue , int newValue){
        Node temp = head;
        while (temp != null) {
            if(temp.data == oldValue){
                temp.data = newValue;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //====================
    //Deletion
    //====================

    public void deleteHead(){
        if(head == null) {
            System.out.println("LL is empty, cannot delete anything");
            return;
        }
        //main logic
        head = head.next;
        size--;
        //be cautious -> check whether after delete LL has become empty or not 
        if(head == null){
            tail = null;
        }
    }

    public void deleteTail(){
        if(head == null){
            System.out.println("LL is empty , cannot delete anything");
            return;
        }
        //check for single node
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        //for normal >1 length wali LL
        Node temp = head;
        for(int i = 1; i<size-2; i++){
            temp = temp.next;
        }
        //now temp is pointing at 2nd last node of LL
        temp.next = null;
        tail = temp;
        size--;
    }

    public void deleteAtPosition(int position){
        if(position <1 || position > size+1){
            System.out.println("invalid Position, can't delete node");
            return;
        }
        if(position == 1){
            deleteHead();
            return;
        }
        if(position == size){
            deleteTail();
            return;
        }
        //variable setup --> prev , curr , forward
        Node prev = head;
        for(int i = 1; i<=position-2; i++){
            prev = prev.next;
        }
        Node curr = prev.next;
        Node forward = curr.next; 

        //main logic
        prev.next = forward;
        curr.next = null;
        size--;
    }

    //Delete first occurance of value
    public boolean deleteValue(int target){
        if(head == null){
            System.out.println("Deletion not possible , no nodes to delete ");
            return false;
        }
        if(head.data == target){
            deleteHead();
            return true;
        }
        Node prev = head;
        Node curr = head.next;

        while(curr != null){
            if(curr.data == target){
                //deletion ka logic lagao
                Node forward = curr.next;

                prev.next = forward;
                curr.next = null;

                if(tail == curr){
                    //tail update
                    tail = prev;
                }
                size--;
                return true;
            }
            else{
                prev = prev.next;
                curr = curr.next;
            }
        }
        return false;
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

        System.out.println("Tail data  " + mylist.getTail());

        System.out.println("Found or not" + mylist.search(200));

        System.out.println("Position of 200 is:" + mylist.findPosition(200));

        mylist.updateAtPosition(9, 1);
        mylist.printList();

        System.out.println("Update or Not" + mylist.updateValue(500, 5));
        mylist.printList();

        mylist.deleteHead();
        mylist.printList();

        mylist.deleteTail();
        mylist.printList();

        mylist.deleteAtPosition(3);
        mylist.printList();

        mylist.deleteValue(100);
        mylist.printList();
    }
}
