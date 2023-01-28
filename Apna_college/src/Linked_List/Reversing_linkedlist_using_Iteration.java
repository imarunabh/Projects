package Linked_List;

class Reversing_linkedlist_using_Iteration {
    Node head;
    private int size;
    Reversing_linkedlist_using_Iteration(){
        this.size=0;

    }
    class Node{

        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add- first,last

    // Add-First
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // Add-Last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return ;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    //delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last
    public void deleteLast(){
        // if the linkedlist is empty
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        // if the linkedlist contains only one node
        if(head.next==null){
            head=null;
            return;
        }
        // is the linkedlist contains more than one node
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }
    public int getSize(){

        return size;

    }
    public void reverserIterate(){
        if(head==null||head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextnode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextnode;
        }
        head.next=null;
        head=prevNode;
    }



    public static void main(String[] args) {
        Reversing_linkedlist_using_Iteration list =new Reversing_linkedlist_using_Iteration();

        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

       // list.deleteFirst();
        list.printList();

       // list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.reverserIterate();
        list.printList();



    }
}
