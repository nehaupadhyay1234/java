import java.util.Scanner;
public class Function5{
    public static int printAverage(int m,int n,int p){
        return (m+n+p)/3;
        

    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int p=scanner.nextInt();
        System.out.println("average of given numbers is:"+printAverage(m,n,p));
        
        

       scanner.close();
    }
}