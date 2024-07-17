package tamilnadu.chennai;
class Employee// javac -d . Employee.java(to compile)
// java tamilnadu.chennai.Employee(to run)
{
    String name;
    public static void main(String args[]) {
        Employee objemp1 = new Employee();
        objemp1.name = "raja";
        System.out.println(objemp1.name);
        Office objoffice = new Office();
        objoffice.work();
        objoffice.get_travel_allowance();
        System.out.println(objoffice.salary);
    }
}
