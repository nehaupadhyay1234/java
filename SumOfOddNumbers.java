import java.util.Scanner;
public class SumOfOddNumbers{
    public static int sumOfOdds(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if((i%2)!=0){
                sum+=i;
            }

        }
        return sum;
         
       
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        System.out.println("sumof odd no.s upto given n:" +(sumOfOdds(n)));

        
         

       scanner.close();
    }
}