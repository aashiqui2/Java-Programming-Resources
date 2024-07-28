class School {
    static String name = "aashiqui";
    // private int salary=20000;
    int salary = 20000;

    void admit() {
        System.out.println("admitted");
    }

    void salary() {
        // private float pf=2.5f;
        System.out.println("salary is " + salary);
    }

    public static void main(String args[]) {
        School schoolObj = new School();
        schoolObj.salary();
        System.out.println("Hello World");
    }

}