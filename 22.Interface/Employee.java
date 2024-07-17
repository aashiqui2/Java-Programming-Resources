public class Employee {
    String name; 
    int id; 
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}