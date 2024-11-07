package LinkedList;

public class Linkedlist {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tell;
    
    //Methods  

    public void addFirst(int data){
        //Create new node
        Node newNode=new Node(data);
        if (head==null) {
            head=tell=newNode;
            return;
        }
        //new node's next=head
        newNode.next=head;  //link

        //head = new node
        head=newNode;
    }

    public void addlast(int data){
        //create new node
        Node newNode=new Node(data);
        if (head==null) {
            head=tell=newNode;
            return;
        }
        //tails next = new node
        tell.next=newNode;

        //tail=new node
        tell=newNode;
    }

    public void print(){   //TimeComplexity=O(n)
        Node temp=head;
        if (head==null) {
            System.out.println("LL is empty");
            return;
        }
        while (temp!=null) {
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.print();;
        ll.addFirst(2);
        ll.print();;
        ll.addFirst(1);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.print();
    }
}
