import java.util.*;
public class Butterfly{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no. of rows:");
        int n=sc.nextInt();
        //upper half
        for(int i=1;i<=n;i++){
            //left wing
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
             //right wing
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                     System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){
            //left wing
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //right wing
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        
    }
}