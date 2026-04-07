import java.util.Scanner;
public class Vote{
    public static boolean EligibleToVote(int n){
        if(n>=18){
            return true;
        } else{
            return false;
        }
       


    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println((EligibleToVote(n)));
        
         

       scanner.close();
    }
}