import java.util.*;
import java.util.LinkedList;
public class LinkedList3{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
   public void detectAndRemoveLoop(){
       Node slow=head,fast=head;
       while(slow!=null && fast!=null && fast.next !=null){
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast){
               removeLoop(slow);
               return;
           }
       }
   }
    private void removeLoop(Node loopNode){
        Node ptr1=head;
        Node ptr2;
        while(true){ 
            ptr2=loopNode;
        while(ptr2.next !=loopNode && ptr2.next !=ptr1){
            ptr2=ptr2.next;
        }
        if(ptr2.next==ptr1){
            break;
        }
        ptr1=ptr1.next;
    }
     ptr2.next=null;
    }
    public void printList(){
        Node temp=head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();

    }



    public void createLoop(int index){
        Node loopNode=head;
        for(int i=0;i<index;i++){
            if(loopNode !=null){
                loopNode=loopNode.next;
            }
            Node end=head;
            while(end.next!=null){
                end=end.next;
            }
            end.next=loopNode;
        }
    }

















    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(3);
        list.head.next.next.next=new Node(4);
        list.head.next.next.next.next=new Node(5);

        list.createLoop(2);
        list.detectAndRemoveLoop();
        System.out.println("linked list after removing loop:");
        list.printList();

    }









}
