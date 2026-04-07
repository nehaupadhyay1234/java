interface Animal{
    int eyes=2;
    void walk();
}




class Horse implements Animal{

    public void walk(){ 
        System.out.println("walks on four legs");
}
}








public class OOPS7c{
    public static void main(String args[]){
        Horse horse=new Horse();
        horse.walk();

    }
}