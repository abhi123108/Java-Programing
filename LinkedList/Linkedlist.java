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
    public static  int size;
    
    //Methods  

    public void addFirst(int data){
        //Create new node
        Node newNode=new Node(data);
        size++;
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
        size ++;
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

    public void add(int idx ,int data){
        if (idx==0) {
            addFirst(data);
            return; 
        }
        Node newNode=new Node(data);
        size ++;
        Node temp=head;
        int i=0;

        while (i<idx-1) {
            temp=temp.next;
            i++;
        }

        //i=idx-1;  temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if (size==0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val=head.data;
            head=tell=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size --;
        return val;
    }

    public int removeLast(){
        if (size==0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val=head.data;
            head=tell=null;
            size=0;
            return val;
        }
        //prev : i+size-2
        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data;  //tell.data
        prev.next=null;
        tell=prev;
        size--;
        return val;
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        
        ll.addFirst(2);
        
        ll.addFirst(1);
        
        ll.addlast(3);
        
        ll.addlast(4);

        ll.add(2,9);
        ll.print();
        //System.out.println(ll.size);
        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}
