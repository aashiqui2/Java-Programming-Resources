public class ThreadCaller1 {

    public static void main(String[] args) throws InterruptedException {
        ChildThread ct=new ChildThread();
        ct.start();
        // once the child thread is finished then main thread will executed
        // ct.join();
        ct.interrupt();
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread " + i);
        }
    }
}
