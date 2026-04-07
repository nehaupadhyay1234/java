import java.util.ArrayList;
import java.util.Collections;
class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<Integer>();

//add elements
list.add(0);
list.add(2);
list.add(3);
System.out.println();
int element=list.get(0);
System.out.println(element);
//add element in between
list.add(1,2);
System.out.println(list);

//set element
list.set(0,5);
System.out.println(list);

//delete element
list.remove(3);
System.out.println(list);

int size=list.size();
System.out.println(size);

//loops
for(int i=0;i<list.size();i++){
    System.out.println(list.get(i));
}
System.out.println();

//sorting
Collections.sort(list);
System.out.println(list);
















    }
}