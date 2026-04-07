import java.util.*;
public class Numbers{
    public static void CountNumbers(int n){
        Scanner sc=new Scanner(System.in);
        int positivecount=0;
        int negativecount=0;
        int Zerocount=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num>0){
                positivecount++;
            } else if(num<0){
                negativecount++;
            } else{
                Zerocount++;
            }
        }
        System.out.println("positive numbers:"+positivecount);
        System.out.println("negatve numbers:"+negativecount);

        System.out.println("zeroes:"+Zerocount);

        
   
    }
    

    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many no.s will u enter?");

        int n=sc.nextInt();

        CountNumbers(n);
        

       
    }
}