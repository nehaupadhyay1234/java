import java.util.*;
public class conversion{

    public static String decimaltoBinary(int n){
        return Integer.toBinaryString(n);
    }
    public static int binarytoDecimal(String binary){
        return Integer.parseInt(binary,2);


    }



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a decimal no. :");
        int decimal=sc.nextInt();
        String binary=decimaltoBinary(decimal);
        System.out.println("Binary equivalent:" +binary);
        //binary to decimal
        System.out.println("enter a binary no. :");
        String binaryinput=sc.next();
        int decimalEquivalent=binarytoDecimal(binaryinput);
        System.out.println("decimal equivalent:"+decimalEquivalent);
    
    
    
    










    }    
}