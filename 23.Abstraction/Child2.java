public  class Child2 extends Parent2 {
    public static void main(String[] args) {
        Child2 child = new Child2();
        child.work();
        child.study();
    }

    // Method Overriding
    public void study() {
        System.out.println("UG Degree needed");
    }
}