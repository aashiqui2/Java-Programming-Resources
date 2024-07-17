class SuperMarket {
    static int streetNo = 5;
    String name = "Reliance Mall";
    int price, discount = 2;// non-static variable//object specific
    String brand;

    public static void main(String[] args) {
        SuperMarket product1 = new SuperMarket();// Getting space for my object

        product1.price = 10;// object specific values
        product1.discount = 2;
        product1.brand = "ABC";

        SuperMarket product2 = new SuperMarket();
        product2.price = 20;
        product2.discount = 3;
        product2.brand = "POI";

        SuperMarket product3 = new SuperMarket();
        product3.price = 25;
        product3.discount = 4;
        product3.brand = "PQR";
        SuperMarket product4=new SuperMarket();

        System.out.println(product1.price);
        System.out.println(product4.discount);
        // System.out.println(name);
        // non-static variable name cannot be referenced from a static context.Please
        // declare variable as static

    }
}
