class student{
   String name;
   int age;
   public void printInfo(String name){
       System.out.println(name);
       
   }
   public void printInfo(int age){
       System.out.println(age);
   }



}
public class OOPS5{
public static void main(String args[]){
    student s1=new student();
    s1.name="aman";
    s1.age=24;
    s1.printInfo(s1.age);
}


}