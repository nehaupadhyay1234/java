class pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }



        public void printcolor(){
            System.out.println("this color");
        }
    

}

public class OOPS1{
    public static void main(String args[]){
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
        pen1.printcolor();






    }


}