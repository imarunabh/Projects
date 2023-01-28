package Linked_List;

public class Link_L {
     Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
        //add-First
        public void addFirst(String data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        //add-Last
        public void addLast(String data){
            Node newNode=new Node(data);
            if(head==null){
               head=newNode;
                return;
            }
            Node curr=head;
            while(curr!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }

        //delete-First
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return ;
        }

        head=head.next;

    }
    //delete -Last
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node secondlast=head;
        Node last=head.next;
        while(last.next!=null){
            secondlast=secondlast.next;
            last=last.next;
        }
        secondlast.next=null;
    }
        //print
        public void printNode(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+"->");
                curr=curr.next;
            }
            System.out.println("NULL");
        }
        public void reverIter(){
        if(head==null||head.next==null){
            return;
        }
        Node prev=head;
        Node curr=prev.next;
        while(curr!=null){

            Node next=curr.next;
            curr.next=prev;
            //update
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
        }

        //reverseRecursion
    public Node revRecur(Node head){
        if(head.next==null||head==null){
            return head;
        }
        Node newnode=revRecur(head.next);
        head.next.next=head;
        head.next=null;
        return newnode;
    }
    public void nthnode(Node head,int pos){
        if(head.next==null||head==null){
            return ;
        }
        int size=1;
        Node pre=head;
        Node curr=head.next;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        System.out.println(size);
        int current=size-pos+1;
        int previous=size-pos;
        for(int i=1;i<previous;i++){
            pre=pre.next;
          //  curr=curr.next;
        }
        pre.next=pre.next.next;
    }
    public void size(){
        Node curr=head;
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        System.out.println(size);
    }

    public static void main(String[] args) {
        Link_L list=new Link_L();
        list.addFirst("list");
        list.addFirst("a");
        list.printNode();
        list.deleteFirst();
        list.printNode();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printNode();
        //list.deleteLast();
        list.printNode();
        list.reverIter();
        list.printNode();
       list.head= list.revRecur(list.head);
        list.printNode();
        list.nthnode(list.head,2);
        list.printNode();
        list.size();

    }
}