public class SoftwareEngineer extends Parent3 implements OfficeRules, TrafficRules {
    public static void main(String[] args) {
        SoftwareEngineer se = new SoftwareEngineer();
        OfficeRules office = new SoftwareEngineer();
        TrafficRules police = new SoftwareEngineer();
        // constructor,and object is canot be created by interface 
        office.get_salary();
        se.apply_leave();
        // office.chat();//cannot error
        police.go_slow();
        police.keep_left();
        se.chat();
        System.out.println(se.min_salary);
        System.out.println(se.no_of_leave);
        // se.no_of_leave=20;// final and static
        System.out.println(SoftwareEngineer.no_of_leave);
        se.work();
        se.study();
    }

    public void apply_leave() {
        System.out.println("Apply leave");
    }

    public void work_8_hours() {
        System.out.println("work 8 hours");
    }

    public void wear_formals() {
        System.out.println("Wear Forlmals");
    }

    public void get_salary() {
        System.out.println("Get Salary");
    }

    public void take_break() {
        System.out.println("leisure time");
    }

    public void chat() {
        System.out.println("chatting with peoples");
    }

    public void go_slow() {
        System.out.println("Over Speed");
    }

    public void keep_left() {
        System.out.println("wrong side");
    }

    public void study() {
        System.out.println("studing");
    }

}