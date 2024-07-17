class Employee {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class PrivateExample7 {

    public static void main(String args[]) {
        Employee e = new Employee();
        e.setId(101);
        e.setName("John William");
        e.setAge(25);
        System.out.println(e.getId() + " " + e.getName() + " " + e.getAge());
    }
}