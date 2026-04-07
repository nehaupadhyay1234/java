import java.util.Scanner;
public class CommonDivisor{
    public static int findGCD(int n,int m){
        while(m!=0){//divide the lager no. by the smaller no. and find the remainder.If the rem is zero,the divisor is the
            int temp=m;//rem is not zero replace the largerno. with the saller no.and the smaller no. with the remainder.
            m=n%m;//repeat steps 1 and 2 until you get a rem of zero.The lastt non zero rem is the GCD
            n=temp;
        }
        
return n;

    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        
         int m=scanner.nextInt();
         int gcd=findGCD(n,m);
         System.out.println(+(gcd));

       scanner.close();
    }
}