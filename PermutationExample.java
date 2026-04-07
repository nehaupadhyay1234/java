import java.util.*;
public class PermutationExample{
    public static void Permute(int[] arr,int index){
        if(index==arr.length-1){
            printArray(arr);
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(arr,index,i);
            Permute(arr,index+1);
            swap(arr,index,1);
        }

    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();
        
    }
    public static void main(String args[]){
        int[] num={1,2,3};
        System.out.println("permutations of[1,2,3]:");
        Permute(num,0);

    }
}
