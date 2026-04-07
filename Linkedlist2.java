import java.util.*;
import java.util.LinkedList;
public class Linkedlist2{
   
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        System.out.println("enter elements for the linked list between 1 and 50:");
        while(true){
            int num=sc.nextInt();
            
                if(num >=1 && num <=50){
                    list.add(num);
                } else{
                    System.out.println("please enter a number between 1 and 50");
                }
            
            list.removeIf(n -> n >25);
            System.out.println("linked list after deleting  nodes greater than 25:");
            for(int n: list){
                System.out.print(n+ " ");
            }
        }

        

    }
}