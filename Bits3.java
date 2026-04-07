import java.util.*;
//update bit
public class Bits3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int n=5;
        int pos=1;
        int bitmask=1<<1;
        if(oper==1){
            int newNumber=bitmask | n;
             System.out.println(newNumber);
        }else{
            int newBitmask=~(bitmask);
            int newNumber=newBitmask & n;

            System.out.println(newNumber);
        }
    }
}