public class ChildThread extends Thread{
    // method overriding
    public void run(){
        for (int i = 1; i <=5; i++) {
            // Thread.yield();
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                // e.printStackTrace();
                System.out.println("My sleep got intrupted");
            }
            System.out.println("Child Thread "+ i);   
        }

    }
    
    
}
