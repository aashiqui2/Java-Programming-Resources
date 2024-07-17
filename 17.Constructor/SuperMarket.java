public class SuperMarket {
    String prod_name;
    int price,discount;
    public SuperMarket(String prod_name,int price,int discount){
        // prod_name=s1;
        // price=no1;
        // discount=no2;
        // prod_name=prod_name;
        // price=price;
        // discount=discount;
        this.prod_name=prod_name;
        this.price=price;
        this.discount=discount;
        System.out.println("Hi"+ prod_name+price+discount);
        // shoudl give the proper argument names inside the constructor
        // it is usefull for intializing object specific values.

    }
    public static void main(String[] args) {
        SuperMarket prod1=new SuperMarket("Soap",20,2);
        // prod1.prod_name="Soap";
        // prod1.price=20;
        // prod1.discount=2;
        SuperMarket prod2=new SuperMarket("Shampoo",5,1);
        // prod2.prod_name="Shampoo";
        // prod2.price=100;
        // prod2.discount=1;
        SuperMarket prod3=new SuperMarket("Biscuits",30,3);
        // prod3.prod_name="Biscuits";
        // prod3.price=30;
        // prod3.discount=3;
        prod1.sell();
        prod1.give_back();
        prod2.sell();
    }
    void sell(){
        System.out.println(prod_name);
        System.out.println(discount);
        System.out.println(price);
    }
    void give_back(){
        System.out.println(prod_name);
        System.out.println(discount);
        System.out.println(price);

    }
}

// supermarket bill detail are in same object
// biscuits price is on the object.
