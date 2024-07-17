package tamilnadu.madurai;
import tamilnadu.chennai.Office;
class Employee2 {
    String name;
    public static void main(String args[]) {
        Employee2 objemp1 = new Employee2();
        objemp1.name = "gopal";
        System.out.println(objemp1.name);
        Office objoffice = new Office();
        objoffice.wtf();
        objoffice.get_travel_allowance();
        System.out.println(objoffice.salary);
    }
}
