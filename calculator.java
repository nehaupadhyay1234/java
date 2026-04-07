import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=(a+b);
        int subtraction=(a-b);
        int multiply=(a*b);
        int division=(a/b);
        int modulo=(a%b);
        System.out.println(modulo);
    }
}