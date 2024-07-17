public class Abc extends Thread{
    public static void main(String[] args) {
        
    }
    public void run(){
        System.out.println("Child class ABC");
       
    }
    public void start(){
        run();
    }

    
}