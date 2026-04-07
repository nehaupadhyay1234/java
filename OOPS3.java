class student{
   String name;
   int age;
   public void printInfo(){
       System.out.println(this.name);
       System.out.println(this.age);
   }
student(String name,int age){
    this.name=name;
    this.age=age;
}



}
public class OOPS3{
public static void main(String args[]){
    student s1=new student("aman",24);
    
    s1.printInfo();
}


}