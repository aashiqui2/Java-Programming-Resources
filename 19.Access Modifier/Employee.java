package tamilnadu.chennai;

class Employee// javac -d . Employee.java(to compile)
// java tamilnadu.chennai.Employee(to run)
{
    String name;

    public static void main(String args[]) {
        Employee objemp1 = new Employee();
        objemp1.name = "Rose";
        System.out.println(objemp1.name);
        Office objoffice = new Office();
        objoffice.work();
        objoffice.wtf();
        System.out.println(objoffice.salary);
    }

}