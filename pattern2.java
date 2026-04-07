import java.util.*;
public class pattern2{
    public static void main(String[] args){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=m;j++){
                //cell->(i,j)
                if(i==1|| j==1|| i==n|| j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}