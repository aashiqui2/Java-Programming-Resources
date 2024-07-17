public /* final */ class Parent1 {
    private int a = 10;
    // int pocket_money=10;
    // static int pocket_money=10;
    // final int pocket_money = 10;
    static final int pocket_money = 10;
    static int cash = 100;
    
    // returning object from methods
     public Parent1 display()
     {
     Parent1 pa =new Parent1();
     return pa;
     }
     

    public void work() {
        System.out.println("Govt Service");
    }

    public final void study() {
        System.out.println("Study is must");
    }
}