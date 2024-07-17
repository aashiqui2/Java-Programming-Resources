public class Child1 extends Parent1 {
    private int a = 10;

    Child1() {
        System.out.println("iam child class no-arg constructor");
    }

    public static void main(String[] args) {
        Child1 raman = new Child1();
        raman.work();
        // This has been private in Parent1 Class and also in this class
        raman.a = 20;
        System.out.println(raman.a);

        // accessed using object creation because this non-static
        // System.out.println(raman.pocket_money);

        // accessed by its name because its static.
        System.out.println(pocket_money);

        // we cannot reassign final variable
        // raman.pocket_money=100;

        System.out.println(raman.pocket_money);

        // we can access static variable without creating object

        System.out.println(cash);
                                                           
        raman.study();

        Parent1 b = raman.display();
        // ClassName@HashCode
        System.out.println(b);
    }

    // Method Overriding
    // same method signature with Different definitions in parent and child classes

    public void work() {
        this.getSalary();
        System.out.println("It Organization");
        super.work();// super refers to super class object
        // this refer to current class object
    }

    void getSalary() {
        System.out.println("Salary Credited");
    }

    // ! cannot override final method
    // public void study() {
    // System.out.println("Study is not must");
    // }

}
