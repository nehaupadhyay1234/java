import java.util.Scanner;
public class Fibonacci{
    public static void FibonacciSeries(int n){
        int first=0;int second =1;
        System.out.print("fibonacci series upto" +n+"terms :");
        for(int i=1;i<=n;i++){
            System.out.print(first+" ");
            int next=first+second;
            first=second;
            second=next;

        }
        
        
return ;

    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter no.of terms:");
        int terms=scanner.nextInt();

        FibonacciSeries(terms);
        
         

       scanner.close();
    }
}