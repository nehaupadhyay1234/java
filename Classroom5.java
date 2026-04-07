 import java.util.*;
 public class Classroom5{
     public static void main(String args[]){
int arr[]={10,2,-2,-20,10};
int k=-10;
HashMap<Integer,Integer> map=new HashMap<>();
    map.put(key: 0, value:1);
    int ans=0;
    int sum=0;
    for(int j=0;j<arr.length;j++){
        sum+=arr[j];
        if(map.containsKey(sum-k)){
            ans+=map.get(sum-k);
        }
        if(map.containsKeysum){
            map.put(sum,map.get(sum)+1);
        }else{
            map.get(sum,value:1);
        }
    }



System.out.println(ans);






     }
 }