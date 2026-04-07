import java.util.*;
public class Togglebit{



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter an integer :");
        int n=sc.nextInt();
         System.out.println("enter the bit position to toggle :");
         int pos=sc.nextInt();
         //toggle the bit using xor
         int bitmask=1<<pos;
         int toggled=n ^ bitmask;
          System.out.println("original number(binary) :" +Integer.toBinaryString(n));
           System.out.println("toggled number(binary) :" +Integer.toBinaryString(toggled));
            System.out.println("toggled number(decimal) :" +toggled);
        

        
    }
}