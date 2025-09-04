package linklist;


public class CreateLinked {
     public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    // add node in first of existing linkedlist
    public void addFirst(int data){
         Node newNode = new Node(data);
         if(head==null){
            head=tail=newNode;
            return;
         }
         newNode.next=head;
         head=newNode;
    }

    // ADD NODE IN LAST OF EXISTING LINKEDLIST
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
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
        CreateLinked list = new CreateLinked();
        CreateLinked.printList();
        list.addFirst(5);
        CreateLinked.printList();
        list.addFirst(10);
        CreateLinked.printList();
        list.addLast(9);
        CreateLinked.printList();
        
    }
}
