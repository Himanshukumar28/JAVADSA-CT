package LINKED_LIST;

public class RotateKelement {
        public static void rotateKelement( Node head , int k){
        //main alogtithm
        
        Node temp = head;

        while(temp != null){
        System.out.print(temp.data + "-->");
        temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        rotateKelement(a, 2);
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
    this.data = data;
    this.next = null;
    }
}
