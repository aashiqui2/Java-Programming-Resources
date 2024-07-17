class LambdaDemo {
    public static void main(String[] args) {
        // InterfaceDemo gg=new Game();
        // Dynmaic Binding
        // gg.test();

        /*
          InterfaceDemo id=//()->System.out.println("GAME TEST123 ");
          (int no1,int no2)->
          {
          System.out.println(no1+no2);
          };
          id.add(256,123);
          //id.test();
         */

        InterfaceDemo id = (int no1, int no2) -> {
            return no1 + no2;
        };
        int result = id.add(123, 456);
        System.out.println(result);
    }
}
