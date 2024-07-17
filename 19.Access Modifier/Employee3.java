// checking for package-private when public is not defined
package tamilnadu.banglore;
import tamilnadu.chennai.Office;
public class Employee3 extends Office {
    public static void main(String[] args) {
        Employee3 obj=new Employee3();
        System.out.println(obj.salary);
    }
}
