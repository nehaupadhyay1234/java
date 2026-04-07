import java.util.*;
public class Even2{
    public static  boolean isEven(int n){
        if(n%2==0){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isEven( n)){
            System.out.println(n+ "is an even no.");
        } else{
            System.out.println(n+ "not an even no.");
        }
        

    }
}