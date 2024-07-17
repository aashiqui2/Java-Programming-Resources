public class Demo {
    public static void main(String[] args) {
        Demo db=new Demo();
        db.test();
    }

    private void test() {
        int no1 =55;
        int no2=65;
        if(no1>no2){
            if(no1>50){
                System.out.println("No1 greater than 50");
            }
            System.out.println(no1);
        }
        else if(no2>no1){
            System.out.println(no2);
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
