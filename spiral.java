import java.util.*;
public class spiral{
    public static void printspiral(int[][] matrix){ 
        if(matrix.length==0)
        return;
         int top=0;
          int bottom=matrix.length-1;
         int left=0;
         int right=matrix[0].length-1;
         System.out.println("Spiral order:");
          while(top<=bottom && left<=right){
              for(int i=left;i<=right;i++){ 
                    System.out.print(matrix[top][i]+" ");
                       top++;
                       //traverse from top to bottom
                       for(int j=top;j<=bottom;j++){
                           System.out.print(matrix[i][right]+" ");
                       }
                       right--;
                       //traverse from right to left
                       if(top<=bottom){
                           for(int k=right;k>=left;k--){
                               System.out.print(matrix[i][left]+" ");
                           }
                           bottom--;
                       }
                       //traverse from bottom to top
                       if(left<=right){
                           for(int m=bottom;m >=top;m--){
                               System.out.print(matrix[i][left]+" ");
                           }
                           left++;
                       }
                }  
            }
    }

    public static void main(String args[]){
        int[][] matrix= {
            {1,2,3,4},
            {5,6,7,8,},
            {9,10,11,12},
            {13,14,15,16}
            
            };
            System.out.println("spiral order:");
            printspiral(matrix);

    }
}