import java.util.*;
//set bit
public class Bits1{
    public static void main(String args[]){
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        int newNumber=bitmask|n;
        System.out.println(newNumber);
    }
}