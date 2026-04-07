import java.util.Scanner;
public class Power{
    public static double  CalcPow(double x,int n){
        
       double result=1;
       for(int i=1;i<=Math.abs(n);i++){
           result*=x;
       }
       if(n<0){
           return 1;
       }
       return result;

    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        double x=scanner.nextDouble();
        int n=scanner.nextInt();
        double result=CalcPow(x,n);
        
         System.out.println(+(result));
       
    }
}