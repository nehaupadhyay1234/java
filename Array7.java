import java.util.*;
public class Array7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("the spiral order matrix is :");
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=m-1;
        //to print spiral order
        while(rowStart<=rowEnd && colStart<=colEnd){
               for(int col=colStart;col<=colEnd;col++){
                   System.out.print(matrix[rowStart][col]+" ");
               }
               rowStart++;
               //2
               for(int row=rowStart;row<=rowEnd;row++)

        }



        
    }
}