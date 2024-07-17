class FullStackDeveloper extends Employee implements JavaDeveloper, PythonDeveloper {
    FullStackDeveloper(String name, int id) {
        super(name, id); 
    }

   
    public void writeJavaCode() {
        System.out.println(name + " is writing Java code.");
    }
 
    public void writePythonCode() {
        System.out.println(name + " is writing Python code.");
    }
}
public class Company {
    public static void main(String[] args) {
        
        FullStackDeveloper developer = new FullStackDeveloper("Arun", 101);
        developer.display(); 
        developer.writeJavaCode(); 
        developer.writePythonCode(); 
    }
}
