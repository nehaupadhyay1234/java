import java.util.*;
public class count1{



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
          System.out.println("enter a number:");
          int n=sc.nextInt();
             int count=Integer.bitCount(n);
             System.out.println(" number of 1s in binary representation:" +count);

    }   
}