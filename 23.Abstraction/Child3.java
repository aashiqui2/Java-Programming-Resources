public class Child3 extends Parent3 {
    //can we declare object here
    // Child3 child = new Child3();
    //the object will be created infinite times //stackoverflow error
    public static void main(String[] args) {
        Child3 child = new Child3();

        child.play();
        child.study();
        child.work();
        child.do_java_program();

        // Dynmaic binding:
        Parent3 parent = new Child3();
        parent.study();
        parent.work();
        // parent.play();
        // parent.do_java_program();
    }

    public void play() {
        System.out.println("Playing");
    }

    public void study() {
        System.out.println("Studying");
    }

    void do_java_program() {
        System.out.println("doing java program");
    }

    public void work() {
        System.out.println("Working in child3");
    }

}
