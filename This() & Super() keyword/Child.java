public class Child extends Parent {
    Child() {
        System.out.println("iam child class no-arg constructor");
    }

    public static void main(String[] args) {
        Child raman = new Child();
        raman.work();
    }

    // Method Overriding
    // same method signature with Different definitions in parent and child classes
    void work() {
        this.getSalary();
        System.out.println("It Organization");
        super.work();// super refers to super class object
        // this refer to current class object
    }

    void getSalary() {
        System.out.println("Salary Credited");
    }
}
