import java.util.*;
public class Radius2{
   public static double Circumference(double r){
       
       return(2*(Math.PI)*r);
   }



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        
        System.out.println("circumference of circle is: " +Circumference(r));

    }
}