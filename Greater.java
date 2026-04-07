import java.util.Scanner;
public class Greater{
    public static int  GreaterOfTwo(int n,int m){
        if(n>m){
            return n;
        }else{
            return m;
        }
        
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        System.out.println(+(GreaterOfTwo(n,m)));
        
        

       scanner.close();
    }
}