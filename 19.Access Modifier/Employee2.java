package tamilnadu.madurai;
import tamilnadu.chennai.Office;
class Employee2
{
String name;
public static void main(String args[])
{
Employee2 objemp1=new Employee2();
objemp1.name="Salim";
System.out.println(objemp1.name);

Office objoffice=new Office();
objoffice.wtf();// this is protected
System.out.println(objoffice.salary);
}
} 

