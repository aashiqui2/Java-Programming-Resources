package tamilnadu.chennai;

public class Office// javac -d . Office.java(to compile)
{// java tamilnadu.chennai.Office(to run)
     public int salary = 20000;

    public Office() {
        System.out.println("no-arg constructor");
    }

    public static void main(String args[]) {
        Office objoffice = new Office();
        objoffice.work();
        System.out.println(objoffice.salary);
    }

    public void work() {
        System.out.println("Working in office");
    }

    protected void wtf() {
        System.out.println("Work from Home");
    }

    public void do_business_plans() {
        System.out.println("Doing Business Plan");
    }
}