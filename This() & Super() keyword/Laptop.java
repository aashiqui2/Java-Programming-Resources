public class Laptop extends Desktop {
    public Laptop() {
        // default--super()
        // this();//error--recursive constructor invocation
        System.out.println("Charge");
    }

    public Laptop(String brand) {
        // super();--invisible
          super(brand); //explicit call
        // this();
        System.out.println(brand);
    }

    public static void main(String[] args) {
        Laptop lenovo = new Laptop();
        Laptop lap2 = new Laptop("Dell");
    }
}