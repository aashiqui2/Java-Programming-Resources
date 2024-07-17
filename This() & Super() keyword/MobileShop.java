public class MobileShop {
    public MobileShop() {
        this(8000, 400);
        System.out.println("welcome");
    }
    public MobileShop(int disc) {
        this();
        System.out.println(disc);
    }
    public MobileShop(int price, int disc) {
        this();error: recursive constructor invocation
        System.out.println(price - disc);
    }
    public static void main(String[] args) {
        MobileShop mobile1 = new MobileShop();
        MobileShop mobile2 = new MobileShop(5);
        MobileShop mobile3 = new MobileShop(10000, 500);
    }
}