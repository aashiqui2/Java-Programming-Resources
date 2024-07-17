public class AbcCaller extends Abc {
    public static void main(String[] args) {
        AbcCaller ab=new AbcCaller();
        ab.start();

        
    }
    public void run(){
        System.out.println("I am from abc caller");
    }
    
}
