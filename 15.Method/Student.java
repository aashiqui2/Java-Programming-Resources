class Student
{
void display()
{
System.out.println(School.name);
}
public static void main(String[] args)
{

School schoolObj=new School();
schoolObj.admit();
schoolObj.salary();
System.out.println(schoolObj.salary);
 
Student studentobj=new Student();
studentobj.display();

}

}