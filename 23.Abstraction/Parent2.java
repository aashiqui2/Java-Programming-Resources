public abstract class Parent2 {
    Parent2(){
        System.out.println("i am Music");
    }
    public static void main(String[] args) {
        // Parent2 parent=new Parent2();//we cannot create object for the abstract class
        // parent.work();
        // parent.study();
    }
    public void work() {
        System.out.println("work");
    }
    public abstract void study();// enforcing child
}