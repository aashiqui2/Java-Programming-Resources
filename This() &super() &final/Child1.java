public class Child1 extends Parent1{
Child1(){
System.out.println("iam child class no-arg constructor");
}
public static void main(String[] args){
Child1 raman=new Child1();
raman.work();
System.out.println(raman.pocket_money);
//raman.pocket_money=100;
System.out.println(raman.pocket_money);
}
//Method Overriding
//same method signature with Different definitions in parent and child classes 
public void work(){
this.getSalary();
System.out.println("It Organization");
super.work();//super refers to super class object
//this refer to current class object
}
void getSalary(){
System.out.println("Salary Credited");
}
/*public  void study(){
System.out.println("Study is not must");
}*/
}
