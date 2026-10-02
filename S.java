class Student
{
 int id;
String name;
public void display(int id,String name){
this.id = id;
this.name = name;
System.out.println("Id is:" + id);
System.out.println("Name:" + name);
}
}
public class S{
public static void main(String[] args){
Student s1 = new Student();
s1.display(10,"Rahul");
}
}
