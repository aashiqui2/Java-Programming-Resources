class Hi implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        // Hi obj = new Hi();
        // Hello obj1 = new Hello();

        Runnable obj=new Hi();
        Runnable obj1=new Hello();
        // Runnable interface is not having start method

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        try {Thread.sleep(1000);} catch (InterruptedException e) { }
        t2.start();



    }
}
