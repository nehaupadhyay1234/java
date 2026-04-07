import java.util.*;
public class Month{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch(button){
            case 1:System.out.println("january");
            break;
            case 2:System.out.println("march");
            break;
            case 3:System.out.println("november");
            break;
            default:System.out.println("invalid");
            
        }
    }
}