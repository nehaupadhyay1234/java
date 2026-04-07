import java.util.*;
import java.util.HashMap;
public class Hashing2{
    public static void main(String args[]){
        //country(key,population)
        HashMap<String,Integer> map=new HashMap<>();
        //insertion
        
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);
map.put("China",180);
System.out.println(map);
//search
if(map.containsKey("Indonesia")){
    System.out.println("key is present in the map");
}
else{
    System.out.println("key is not present in the map");
}
System.out.println(map.get("China"));
System.out.println(map.get("Indonesia"));

int arr[] = {12,15,10};
for(int i=0;i<3;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();

for(int val: arr){
    System.out.print(val+" ");
}
System.out.println();

for(Map.Entry<String,Integer> e: map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
}
Set<String> keys=map.keySet();
for(String key: keys){
    System.out.println(key+" "+map.get(key));
}
map.remove("China");
System.out.println(map);

    }
}