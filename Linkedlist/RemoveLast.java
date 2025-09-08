package linklist;

public class RemoveLast {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addMiddle(int data,int position){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        Node temp=head;
        int i=1;
        while(i<position-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    public static Node head;
    public static Node tail;
    public static int size;
    // remove last node of linkedlist
    public static int removeLastNode(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
       
    }
    // print linkedlist
    public static void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Object ll = null;
        // add first
        ((RemoveLast) ll).addFirst(3);
        
        ((RemoveLast) ll).addFirst(1);
        ((RemoveLast) ll).addLast(4);
        ((RemoveLast) ll).addLast(5);
        ((RemoveLast) ll).addMiddle(2, 3);
        printList();
        System.out.println("Size of linked list: "+size);
        System.out.println("Removed last node: "+removeLastNode());
        printList();

    }
}
