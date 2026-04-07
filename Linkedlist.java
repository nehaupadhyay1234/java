import java.util.*;
public class Linkedlist{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(4);
         System.out.print(list+" ");
         int target=7;
         int index=list.indexOf(target);
         if(index!=-1){
             System.out.println("element"+target+"found at index:"+index);
            } else{
                System.out.println("element"+target+"not found in the list");
            }

    }
}