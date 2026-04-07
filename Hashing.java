import java.util.HashSet;
import java.util.Iterator;

public class Hashing{
    public static void main(String args[]){
        //creating
        HashSet<Integer> set=new HashSet<>();
        //insert
        set.add(1);
 set.add(2);
 set.add(3);
 set.add(1);
 //size
 System.out.println("size of set is:"+ set.size());
 //print all element
 System.out.println(set);
 //search 
 if(set.contains(1)){
     System.out.println("set contains 1");
 }
 if(!set.contains(6)){
     System.out.println("set  does not contain");
 }
 //remove 
 set.remove(1);
if(!set.contains(1)){
    System.out.println("set does not contain  1");
}
//Iterator
Iterator it=set.iterator();
//hasNext: next
while(it.hasNext()){
    System.out.println(it.next());
}


    }
}
