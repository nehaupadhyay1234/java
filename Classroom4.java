import java.util.*;
public class Classroom3{
    public static String getStart(HashMap<String , String> tick){
        HashSet<Integer> set=new HashSet<>();
        for(String key: tick.keySet()){
            revMap.put(tick.get(key),key);
        }
        for(String key: tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
        


    }
public static void main(String args[]){
    HashMap<String,String> tickets=new HashMap<>();
    tickets.put(key: " Chennai",value:" Bengaluru");
tickets.put(key: "Mumbai",value:"Delhi");
tickets.put(key: "Goa",value:"Chennai");
tickets.put(key: "Delhi",value:"Goa");
String start=getStart(tickets);
while(tickets.containsKey(start)){
    System.out.println(start);
    start=tickets.get(start);

}
 System.out.println(start);
}

}