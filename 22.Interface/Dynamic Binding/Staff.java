public class Staff extends CEO {
    public static void main(String[] args) {
        // Staff s=new Staff();
        CEO s = new Staff();// Dynamic Binding
        s.work();
        s.display();
        s.attendMeetigs();
    }

    public void work()// method Overriding
    {
        System.out.println("S-ABC");
    }

    public void attendMeetigs() {
        System.out.println("S-ABCD");
    }
}
