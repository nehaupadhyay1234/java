import java.util.*;
public class LL3{
    Node head;
    private int Size;
    LL3(){
        this.Size=0;
    }
    class Node{
            String data;
            Node next;
            Node(String data){
                this.data=data;
                this.next=null;
                Size++;
            }
        }
        public void addFirst(String data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
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
                return;
            }
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
            System.out.println("NULL");
        }
        public int getSize(){
            return Size;
        }
        public void deleteFirst(){
            if(head==null){
                System.out.println("the list is empty");
                return;
            }
            Size--;
            head=head.next;
        }
        public void deleteLast(){
            if(head==null){
                System.out.println("the list is empty");
                return;
            }
            Size--;
            if(head.next!=null){
                head=null;
                return;
            }
            Node secondLast=head;
            Node LastNode=head.next;
            while(LastNode.next!=null){
                LastNode=lastNode.next;
                secondLast=secondLast.next;


            }
            secondLast.next=null;
        }
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("b");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.PrintList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        





    }
}
