class Game implements InterfaceDemo {
    public static void main(String[] args) {
        InterfaceDemo gg = new Game();
        gg.test();
        gg.test2();
        InterfaceDemo.test3();
    }

    public void test() {
        System.out.println("GAME TEST");
    }
}