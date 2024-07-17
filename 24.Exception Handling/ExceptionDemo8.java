public class ExceptionDemo8 {
    public static void main(String[] args) {
        ThrowDemo td1=new ThrowDemo();
        try{
            td1.test();
        }
        catch(NullPointerException npe){
            System.out.println("Caught second Time");
        }
    }
}
class ThrowDemo{
    public void test(){
        try{
            throw new NullPointerException();//explicit throwing the object
        }
        catch(NullPointerException npe){
            System.out.println("Got NPE");
            throw npe;
        }
    }
}
