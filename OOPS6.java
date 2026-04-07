abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walks on four legs");
    }
}
class children extends Animal{
    public void walk(){
         System.out.println("walks on 2 legs");
    }
    
}





public class OOPS6{
    public static void main(String args[]){
        Horse horse=new Horse();
        horse.walk();
        
    }
}