public class ThreadCaller {
    public static void main(String[] args) {
        ChildThread ct=new ChildThread();
        System.out.println(ct.getState());
        // ct.setPriority(1);
        // ct.start();//you arestarting a new thread
        // ct.run();
        ct.start();
        System.out.println(ct.getState());
        System.out.println(ct.getName());
        ct.setName("Customer");
        System.out.println(ct.getName());
        // System.out.println(ct.getId());
        System.out.println(ct.getPriority());
        // ct.start();//exeception


        AbcCaller ac=new AbcCaller();
        ac.start();

        for (int i = 1; i <=5; i++) {
            System.out.println("Main thread "+ i);
            
        }
        System.out.println(ct.getState());//waiting/terminatedor dead/runnable
    }
    
}
