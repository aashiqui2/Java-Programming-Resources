@FunctionalInterface
interface InterfaceDemo {
    // void add(int no1,int no2);

    int add(int no1, int no2);

    // void test();//public abstract method

    default void test2() {
        System.out.println("Hi I'm default method");
    }

    static void test3() {
        System.out.println("Hi I'm static method");
    }

}