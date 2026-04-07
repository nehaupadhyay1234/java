class student{
   String name;
   int age;
   public void printInfo(){
       System.out.println(this.name);
       System.out.println(this.age);
   }
student(){
    System.out.println("constructor called");
}



}
public class OOPS2{
public static void main(String args[]){
    student s1=new student();
    s1.name="aman";
    s1.age=24;
    s1.printInfo();
}


}